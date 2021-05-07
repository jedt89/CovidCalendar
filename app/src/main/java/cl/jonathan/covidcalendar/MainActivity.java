package cl.jonathan.covidcalendar;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private TextView date, confirmCases, totalDeaths;
    private Button selectDate;
    private Calendar c;
    private DatePickerDialog dpd;
    private String  fechaActual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date = findViewById(R.id.date);
        confirmCases = findViewById(R.id.confirmCases);
        totalDeaths = findViewById(R.id.totalDeaths);
        selectDate = findViewById(R.id.btnSelectDate);
        getDates(obtenerFechaActual());
        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String fecha=obtenerFechaActual();
               StringTokenizer tokenizer = new StringTokenizer(fecha,"-");
                String year = tokenizer.nextToken();
                String month = tokenizer.nextToken();
                String day = tokenizer.nextToken();


                dpd = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        fechaActual=mYear + "-" + mMonth + "-" + mDay;
                        getDates(fechaActual);
                    }
                }, Integer.valueOf(day), Integer.valueOf(month), Integer.valueOf(year));
                dpd.show();

            }
        });

    }

    public void getDates(String fecha) {
        //Iniciar el sevicio de Retrofit
        ApiInterface service = ApiClient.getRetrofit().create(ApiInterface.class);

        //Llamada para traer datos
        Call<DataModel> call = service.getcases(new Request(fecha));
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                generarInterfaz(response.body());
            }
            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
            }
        });
    }

    private void generarInterfaz(DataModel modelo) {
        date.setText(modelo.getDate() + "");
        confirmCases.setText(modelo.getConfirmed() + "");
        totalDeaths.setText(modelo.getDeaths() + "");
    }

    private String obtenerFechaActual() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date date = new Date();
        return dateFormat.format(date);
    }

}