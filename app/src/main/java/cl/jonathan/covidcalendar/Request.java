package cl.jonathan.covidcalendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("date")
    @Expose
    private String date;

    public Request(String date) {
        this.date = date;
    }

    public Request() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
