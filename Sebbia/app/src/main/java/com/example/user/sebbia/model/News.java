package com.example.user.sebbia.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by User on 14.11.2016.
 */
public class News {

    private String date;
    private String id;
    private String shortDesc;
    private String title;


    public News() {

    }


    public News(JSONObject json) throws JSONException {
        this.id=json.getString("id");
        this.date=json.getString("date");
        this.title=json.getString("title");
        this.shortDesc=json.getString("shortDescription");

    }
    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getShortDesc() { return shortDesc; }

    public void setShortDesc(String shortDesc) { this.shortDesc = shortDesc; }

    public  String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }


}
