package com.lezequielm.wolulu.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

@Table(name = "FoodMeeting")
public class FoodMeeting extends Model {
    @Column(name = "date")
    private Date date;
    @Column(name = "host")
    private User host;
    @Column(name = "food")
    private String food;
    @Column(name = "cooker")
    private String cooker;
    @Column(name = "webId")
    private String webId;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "modifiedAt")
    private Date modifiedAt;

    public FoodMeeting() {
    }

    public FoodMeeting(Date date, User host, String food, String cooker) {
        this.date = date;
        this.host = host;
        this.food = food;
        this.cooker = cooker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
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

    public String getWebId() {
        return webId;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
