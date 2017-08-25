package com.lezequielm.wolulu.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

@Table(name = "Expenses")
public class Expenses extends Model {
    @Column(name = "category")
    private String category;
    @Column(name = "amount")
    private double amount;
    @Column(name = "description")
    private String description;
    @Column(name = "foodMeeting")
    private FoodMeeting foodMeeting;
    @Column(name = "webId")
    private String webId;
    @Column(name = "buyer")
    private User buyer;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "modifiedAt")
    private Date modifiedAt;

    public Expenses() {
    }

    public Expenses(String category, double amount, String description, FoodMeeting foodMeeting, String webId, User buyer) {
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.foodMeeting = foodMeeting;
        this.webId = webId;
        this.buyer = buyer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FoodMeeting getFoodMeeting() {
        return foodMeeting;
    }

    public void setFoodMeeting(FoodMeeting foodMeeting) {
        this.foodMeeting = foodMeeting;
    }

    public String getWebId() {
        return webId;
    }

    public void setWebId(String webId) {
        this.webId = webId;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
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
