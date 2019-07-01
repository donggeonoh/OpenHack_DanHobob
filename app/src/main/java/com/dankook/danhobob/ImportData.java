package com.dankook.danhobob;

import io.realm.Realm;

public class ImportData {
    public static void Import() {
        Realm realm = Realm.getDefaultInstance();

        FoodData5 food = realm.where(FoodData5.class)
                .findFirst();

        if (food != null){
            return;
        }

        realm.beginTransaction();




        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(0);
            FoodData5.setName("호박죽");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor("달콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("추움");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("쌀");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(1);
            FoodData5.setName("오므라이스");
            FoodData5.setPreference(3);
            FoodData5.setCategory("양식");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("계란");
            FoodData5.setIngredient("쌀");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(2);
            FoodData5.setName("초밥");
            FoodData5.setPreference(3);
            FoodData5.setCategory("일식");
            FoodData5.setTexture("차가운");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("생선");
            FoodData5.setIngredient("해산물");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(3);
            FoodData5.setName("간장치킨");
            FoodData5.setPreference(3);
            FoodData5.setCategory("기타");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("달콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("닭");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(4);
            FoodData5.setName("야채곱창");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("매콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("고기");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(5);
            FoodData5.setName("햄버거");
            FoodData5.setPreference(3);
            FoodData5.setCategory("양식");
            FoodData5.setTexture("식감있는");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("고기");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(6);
            FoodData5.setName("양념치킨");
            FoodData5.setPreference(3);
            FoodData5.setCategory("기타");
            FoodData5.setTexture("바삭한");
            FoodData5.setFlavor("매콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("닭");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(7);
            FoodData5.setName("삼겹살");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("식감있는");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("돼지");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(8);
            FoodData5.setName("라면");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor("매콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("추움");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(9);
            FoodData5.setName("짜장면");
            FoodData5.setPreference(3);
            FoodData5.setCategory("중식");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(10);
            FoodData5.setName("샤브샤브");
            FoodData5.setPreference(3);
            FoodData5.setCategory("일식");
            FoodData5.setTexture("식감있는");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("비");
            FoodData5.setTime(0);
            FoodData5.setTemperature("추움");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("고기");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(11);
            FoodData5.setName("마라탕");
            FoodData5.setPreference(3);
            FoodData5.setCategory("중식");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("매콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("추움");
            FoodData5.setAllergic("땅콩");
            FoodData5.setIngredient("null");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(12);
            FoodData5.setName("후라이드치킨");
            FoodData5.setPreference(3);
            FoodData5.setCategory("기타");
            FoodData5.setTexture("바삭한");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("닭");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(13);
            FoodData5.setName("냉면");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("차가운");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("더움");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(14);
            FoodData5.setName("떡볶이");
            FoodData5.setPreference(3);
            FoodData5.setCategory("분식");
            FoodData5.setTexture("쫀득한");
            FoodData5.setFlavor("매콤");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("null");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(15);
            FoodData5.setName("일본라멘");
            FoodData5.setPreference(3);
            FoodData5.setCategory("일식");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("비");
            FoodData5.setTime(0);
            FoodData5.setTemperature("추움");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(16);
            FoodData5.setName("샐러드");
            FoodData5.setPreference(3);
            FoodData5.setCategory("기타");
            FoodData5.setTexture("차가운");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("더움");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("야채");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(17);
            FoodData5.setName("멸치국수");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("비");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(18);
            FoodData5.setName("팟타이");
            FoodData5.setPreference(3);
            FoodData5.setCategory("동남아");
            FoodData5.setTexture("식감있는");
            FoodData5.setFlavor("null");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(19);
            FoodData5.setName("푸팟퐁커리");
            FoodData5.setPreference(3);
            FoodData5.setCategory("동남아");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("게");
            FoodData5.setIngredient("해산물");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(20);
            FoodData5.setName("얇은 피자");
            FoodData5.setPreference(3);
            FoodData5.setCategory("양식");
            FoodData5.setTexture("null");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("null");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(21);
            FoodData5.setName("오꼬노미야끼");
            FoodData5.setPreference(3);
            FoodData5.setCategory("일식");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("비");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("null");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(22);
            FoodData5.setName("빈대떡");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("식감있는");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("비");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("밀가루");
            FoodData5.setIngredient("null");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(23);
            FoodData5.setName("곱창");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("쫀득한");
            FoodData5.setFlavor("느끼");
            FoodData5.setWeather("맑음");
            FoodData5.setTime(1);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("고기");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(24);
            FoodData5.setName("간장게장");
            FoodData5.setPreference(3);
            FoodData5.setCategory("한식");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor(null);
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic("게");
            FoodData5.setIngredient("해산물");
            FoodData5.setPreference2(3);
        }

        {
            FoodData5 FoodData5 = realm.createObject(FoodData5.class);

            FoodData5.setId(25);
            FoodData5.setName("쌀국수");
            FoodData5.setPreference(3);
            FoodData5.setCategory("동남아");
            FoodData5.setTexture("부드러운");
            FoodData5.setFlavor(null);
            FoodData5.setWeather("맑음");
            FoodData5.setTime(0);
            FoodData5.setTemperature("적당");
            FoodData5.setAllergic(null);
            FoodData5.setIngredient("면");
            FoodData5.setPreference2(3);
        }
        realm.commitTransaction();
    }
}
