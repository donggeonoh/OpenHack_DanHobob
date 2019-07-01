package com.dankook.danhobob;

import io.realm.*;

public class Food extends RealmObject{
    private int id;
    private String name;
    private int preference;         //선호도
    private String category;        //음식 종류
    private String texture;         //식감
    private String flavor;          //맛
    private int weather;        //날씨
    private int time;           //시간 0: 9시 이후 추천 금
    private String temperature;     //기온 적당, 추움, 더움 >> 추움일 때 추천, 더움일 때 추천
    private String allergic;        //알레르기 계란, 생선, 밀가루, 땅콩, 게, null
    private String ingredient;      //재료 해산물, 고기, 야채, 쌀, 닭, null

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreference() {
        return preference;
    }

    public void setPreference(int preference) {
        this.preference = preference;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
} //food class




