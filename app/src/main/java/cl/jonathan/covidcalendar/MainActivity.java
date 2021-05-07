package cl.jonathan.covidcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
private TextView date,confirmCases,totalDeaths;
private Button selectDate;
private Calendar c;
private DatePickerDialog dpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        date=findViewById(R.id.date);
        confirmCases=findViewById(R.id.confirmCases);
        totalDeaths=findViewById(R.id.totalDeaths);
        selectDate=findViewById(R.id.btnSelectDate);

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=Calendar.getInstance();
                int day =c.get(Calendar.DAY_OF_MONTH);
                int month =c.get(Calendar.MONTH);
                int year =c.get(Calendar.YEAR);

                dpd=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int mYear, int mMonth, int mDay) {
                        date.setText(mDay+"-"+mMonth+"-"+mYear+"");
                    }
                },day, month, year);
                dpd.show();

            }
        });

    }


}