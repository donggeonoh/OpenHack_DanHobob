package com.dankook.danhobob;

import android.content.Context;
import android.util.Log;

import java.util.Random;

import io.realm.Realm;
import io.realm.RealmResults;

public class Database<let> {
    private static int trial = 1;

    private static Realm mRealm;

    public void test(Context context) {
        mRealm = Realm.getDefaultInstance();


    }

    public static void UpdatePreference(final int key, final int newValue) {
        mRealm = Realm.getDefaultInstance();
        mRealm.beginTransaction();

        //com.example.myapplication.Food food = new com.example.myapplication.Food();

        RealmResults<FoodData5> foods = mRealm.where(FoodData5.class).findAll();
        Log.d("count", "" + foods.toArray().length);

        FoodData5 food = mRealm.where(FoodData5.class)
                .equalTo("id", key)
                .findFirst();

        if (food == null) {
            Log.d("null", "");
        }

        RealmResults <FoodData5> weighted_food = null;
        if(newValue>4) {
            switch (food.getId()) {
                case 0:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "분식")
                            .findAll();
                    break;
                case 1:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "양식")
                            .findAll();
                    break;
                case 2:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "한식")
                            .findAll();
                    break;
                case 3:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "한식")
                            .findAll();
                    break;
                case 4:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "한식")
                            .findAll();
                    break;
                case 5:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "일식")
                            .findAll();
                    break;
                case 6:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "한식")
                            .findAll();
                    break;
                case 7:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "중식")
                            .findAll();
                    break;
                case 8:
                    weighted_food = mRealm.where(FoodData5.class)
                            .equalTo("preference", "기타")
                            .findAll();
                    break;

            }
            for (int i = 0; i < weighted_food.size(); i++) {
                if (weighted_food.get(i).getPreference() < 5) {
                    if (trial == 1) {
                        weighted_food.get(i).setPreference(weighted_food.get(i).getPreference() + 1);
                    } else {
                        weighted_food.get(i).setPreference2(weighted_food.get(i).getPreference2() + 1);
                    }
                }
            }
        }

        mRealm.commitTransaction();
//
//        food.getPreference();
//        Log.d("새 값", "" + food.getPreference());
    }

    public void deleteHates(String target) {
        mRealm = Realm.getDefaultInstance();
        mRealm.beginTransaction();

        RealmResults<FoodData5> foods = null;
        //= mRealm.where(FoodData5.class).findAll();
        //Log.d("count", "" + foods.toArray().length);
        FoodData5 food;
        if (target == "달콤") {
            foods = mRealm.where(FoodData5.class)
                    .equalTo("flavor", "달콤")
                    .findAll();
        } else if (target == "일식") {
            foods = mRealm.where(FoodData5.class)
                    .equalTo("category", "일식")
                    .findAll();
        } else if (target == "느끼") {
            foods = mRealm.where(FoodData5.class)
                    .equalTo("flavor", "느끼")
                    .findAll();
        }

        int length = foods.size();

        if (trial == 1) {
            for (int i = 0; i < length; i++) {
                foods.get(i).setPreference(0);
            }
            trial++;
        } else {
            for (int i = 0; i < length; i++) {
                foods.get(i).setPreference2(0);
            }
        }
        mRealm.commitTransaction();

        Log.d("count", "" + foods.toArray().length);
    }

    public void alergy(String myalgergy) {
        mRealm = Realm.getDefaultInstance();
        mRealm.beginTransaction();

        RealmResults<FoodData5> foods = null;

        foods = mRealm.where(FoodData5.class)
                .equalTo("flavor", myalgergy)
                .findAll();

        int length = foods.size();

        for (int i = 0; i < length; i++) {
            if(trial ==1) {
                foods.get(i).setPreference(0);
            }
            else
            {
                foods.get(i).setPreference2(0);
            }
        }
        mRealm.commitTransaction();

    }

    public static int likes() {
        mRealm = Realm.getDefaultInstance();
        mRealm.beginTransaction();

        int id = -1;
        String inTime = new java.text.SimpleDateFormat("HHmmss").format(new java.util.Date());
        //Log.d("현재시간",inTime);
        String time = inTime.substring(0, 2);//시간
        int isNight;
        if (Integer.parseInt(time) > 21 || Integer.parseInt(time) < 6) {
            isNight = 1;
        } else {
            isNight = 0;
        }

        RealmResults<FoodData5> total_foods = mRealm.where(FoodData5.class).findAll();
        int total_length = total_foods.size();

        RealmResults<FoodData5> foods = null;
        for (int i = 0; i < total_length; i++) {
            foods = mRealm.where(FoodData5.class)
                    .equalTo("preference", "5")
                    .equalTo("preference2", "5")
                    .equalTo("time", isNight)
                    .findAll();

        }
        //.equalTo("time",)

//show
        for(int i=0; i<foods.size();i++)
        {
            Log.d("아이템", "" + foods.get(i).getName());
            Log.d("선호도", "" + foods.get(i).getPreference());
        }
        int like_length = foods.size();

        Random randomGenerator = new Random();
        int randomInteger = randomGenerator.nextInt(like_length);

        id = foods.get(randomInteger).getId();

        mRealm.commitTransaction();

        return id;
    }

}
