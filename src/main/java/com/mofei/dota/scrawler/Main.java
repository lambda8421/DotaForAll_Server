package com.mofei.dota.scrawler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mofei.dota.web.entity.Hero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        test("https://api.opendota.com/api/heroes");
    }


    static void test(String strURL){
        try {
            URL url = new URL(strURL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            InputStreamReader input = new InputStreamReader(httpConn.getInputStream(), "utf-8");
            BufferedReader bufReader = new BufferedReader(input);
            String line = "";
            StringBuilder contentBuf = new StringBuilder();
            while ((line = bufReader.readLine()) != null) {
                contentBuf.append(line);
            }

            ObjectMapper mapper = new ObjectMapper();
            JsonNode actualObj = mapper.readTree(contentBuf.toString());
            JsonNode node = actualObj.get(0);
            Hero hero = mapper.convertValue(node,Hero.class);
          contentBuf.toString();
        }catch (Exception e){
//            crawlerData = null;
            System.out.println(e.getStackTrace());
        }
    }
}
