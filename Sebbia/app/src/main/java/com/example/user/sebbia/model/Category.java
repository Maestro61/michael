package com.example.user.sebbia.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by User on 14.11.2016.
 */
public class Category {

    private String id;
    private String name;

    public Category() {

    }

    public Category(JSONObject json) throws JSONException {
        this.id = json.getString("id");
        this.name = json.getString("name");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
