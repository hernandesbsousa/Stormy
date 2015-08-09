package me.hernandes.stormy.weather;

/**
 * Created by hernandes on 09/08/15.
 */
public class Day {
    private long mTime;
    private String mSummary, mIcon, mTimezone;

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

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public double getTemparatureMax() {
        return mTemparatureMax;
    }

    public void setTemparatureMax(double temparatureMax) {
        mTemparatureMax = temparatureMax;
    }

    private double mTemparatureMax;
}
