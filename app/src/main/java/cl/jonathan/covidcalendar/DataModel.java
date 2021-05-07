package cl.jonathan.covidcalendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataModel {
    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("last_update")
    @Expose
    private String last_update;

    @SerializedName("confirmed")
    @Expose
    private int confirmed;

    @SerializedName("deaths")
    @Expose
    private int deaths;

    @SerializedName("deaths_diff")
    @Expose
    private int deaths_diff;

    @SerializedName("recovered")
    @Expose
    private int recovered;

    @SerializedName("recovered_diff")
    @Expose
    private int recovered_diff;

    @SerializedName("active")
    @Expose
    private int active;

    @SerializedName("active_diff")
    @Expose
    private int active_diff;

    @SerializedName("fatality_rate")
    @Expose
    private double fatality_rate;

    public DataModel() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getDeaths_diff() {
        return deaths_diff;
    }

    public void setDeaths_diff(int deaths_diff) {
        this.deaths_diff = deaths_diff;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getRecovered_diff() {
        return recovered_diff;
    }

    public void setRecovered_diff(int recovered_diff) {
        this.recovered_diff = recovered_diff;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getActive_diff() {
        return active_diff;
    }

    public void setActive_diff(int active_diff) {
        this.active_diff = active_diff;
    }

    public double getFatality_rate() {
        return fatality_rate;
    }

    public void setFatality_rate(double fatality_rate) {
        this.fatality_rate = fatality_rate;
    }
}
