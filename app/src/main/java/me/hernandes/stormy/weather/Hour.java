package me.hernandes.stormy.weather;

/**
 * Created by hernandes on 09/08/15.
 */
public class Hour {
    private long mTime;
    private String mSummary, mIcon, mTimezone;
    private double mTemperature;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimeZone() {
        return mTimezone;
    }

    public void setTimeZone(String timeZone) {
        mTimezone = timeZone;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }
}
