package cl.jonathan.covidcalendar;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInterface {


    @Headers({"X-RapidAPI-Key:96afa298cbmsh913f910f914494cp110c39jsn01a32d68445e"})
    @GET("reports/total")
    Call<DataModel> getcases(@Body String dateBody);

}
