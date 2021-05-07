package cl.jonathan.covidcalendar;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;

public interface ApiInterface {



   // @GET("reports/total")
   // Call<DataModel> getcases(@Body Request dateBody);


    @HTTP(method = "GET", path = "reports/total", hasBody = true)
    @Headers({"X-RapidAPI-Key:96afa298cbmsh913f910f914494cp110c39jsn01a32d68445e"})
    Call<DataModel> getcases(@Body Request dateBody);

}
