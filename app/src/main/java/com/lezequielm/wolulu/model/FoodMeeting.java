package com.lezequielm.wolulu.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

@Table(name = "FoodMeeting")
public class FoodMeeting extends Model {
    @Column(name = "date")
    private Date date;
    private String place;
    private String food;
    private String cooker;

    public FoodMeeting() {
    }

    public FoodMeeting(Date date, String place, String food, String cooker) {
        this.date = date;
        this.place = place;
        this.food = food;
        this.cooker = cooker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getCooker() {
        return cooker;
    }

    public void setCooker(String cooker) {
        this.cooker = cooker;
    }
}
