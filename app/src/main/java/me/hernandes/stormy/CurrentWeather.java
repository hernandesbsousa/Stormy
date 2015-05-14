package me.hernandes.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by hernandes on 09/05/15.
 */
public class CurrentWeather {
    private String mIcon, mSummary, mTimezone;
    private long mTime;
    private double mTemperature, mHumidity, mPrecipChance;

    public CurrentWeather(String icon, String summary, long time, double temperature, double humidity, double precipChance, String timezone) {
        mIcon = icon;
        mSummary = summary;
        mTime = time;
        mTemperature = temperature;
        mHumidity = humidity;
        mPrecipChance = precipChance;
        mTimezone = timezone;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        int iconId;
        switch (mIcon) {
            case "clear-day":
                iconId = R.mipmap.clear_day;
                break;
            case "clear-night":
                iconId = R.mipmap.clear_night;
                break;
            case "rain":
                iconId = R.mipmap.rain;
                break;
            case "snow":
                iconId = R.mipmap.snow;
                break;
            case "sleet":
                iconId = R.mipmap.sleet;
                break;
            case "wind":
                iconId = R.mipmap.wind;
                break;
            case "fog":
                iconId = R.mipmap.fog;
                break;
            case "cloudy":
                iconId = R.mipmap.cloudy;
                break;
            case "partly-cloudy-day":
                iconId = R.mipmap.partly_cloudy;
                break;
            case "partly-cloudy-night":
                iconId = R.mipmap.cloudy_night;
                break;
            default:
                iconId = R.mipmap.rain;
                break;
        }
        return iconId;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        return (int) Math.round(mPrecipChance * 100);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(mTimezone));
        Date dateTime = new Date(mTime * 1000);
        return formatter.format(dateTime);
    }
}
