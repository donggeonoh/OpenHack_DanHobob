package com.dankook.danhobob;

import android.util.Log;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class WeatherByGPS {
    static double temp;
    static String weather;
    static String location;

    WeatherByGPS() {
        temp=0.0;
        weather ="";
        location="";
        RunWeatherApi();
    }

    public static void RunWeatherApi() {
        try {
//            String lat = String.valueOf(GpsInfo.getLatitude());
//            String lon = String.valueOf(GpsInfo.getLongitude());
//
//            System.out.println(lat);
//            System.out.println(lon);
            //익산의 위도와 경도
            String lon = "126.975433";  //경도
            String lat = "35.950693";   //위도

            //OpenAPI call하는 URL
            String urlstr = "http://api.openweathermap.org/data/2.5/weather?"
                    + "lat=" + lat + "&lon=" + lon
                    + "&APPID=71ba279cebeaa162b94790f1818652ad";
            URL url = new URL(urlstr);
            BufferedReader bf;
            String line;
            String result = "";

            //날씨 정보를 받아온다.
            bf = new BufferedReader(new InputStreamReader(url.openStream()));

            //버퍼에 있는 정보를 문자열로 변환.
            while ((line = bf.readLine()) != null) {
                result = result.concat(line);
                //System.out.println(line);
            }

            //문자열을 JSON으로 파싱
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObj = (JSONObject) jsonParser.parse(result);

            //지역 출력
            System.out.println("지역 : " + jsonObj.get("name"));
            location = "" + jsonObj.get("name");
            Log.d("location",""+location);


            //날씨 출력
            JSONArray weatherArray = (JSONArray) jsonObj.get("weather");
            JSONObject obj = (JSONObject) weatherArray.get(0);
            System.out.println("날씨 : " + obj.get("main"));
            weather = "" + obj.get("main");
            Log.d("weather",""+weather);


            //온도 출력(절대온도라서 변환 필요)
            JSONObject mainArray = (JSONObject) jsonObj.get("main");
            double ktemp = Double.parseDouble(mainArray.get("temp").toString());
            temp = ktemp - 273.15;
            System.out.printf("온도 : %.2f\n", temp);
            Log.d("온도",""+temp);

            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double getTemp() {

        return temp;
    }

    public static String getWeather() {


        String k_weather="";
         try {
             System.out.println(weather);

             switch (weather) {
                 case "Haze":
                     k_weather = "안개";
                     break;
                 case "Clear":
                     k_weather = "맑음";
                     break;
             }
         }
         catch(Exception e){
             System.out.println(e);
         }
        return k_weather;
    }

    public static String getLocation() {
        if (location=="Iksan"){location ="익산";}
        return location;
    }

}