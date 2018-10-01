package com.mofei.dota.crawler;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mofei.dota.web.entity.Hero;
import com.mofei.dota.web.entity.Role;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        return;
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
            for (int i = 0; i < actualObj.size(); i++) {
                JsonNode node = actualObj.get(0);
                Hero hero = mapper.convertValue(node,Hero.class);
                JsonNode rolesNode = node.get("roles");
                List<Role> roles = new ArrayList<>();
                for (int j = 0; j < rolesNode.size(); j++) {
                    Role role = new Role(rolesNode.get(j).toString());
                    roles.add(role);
                }
                hero.setRoles(roles);
            }

          contentBuf.toString();
        }catch (Exception e){
//            crawlerData = null;
            System.out.println(e.getStackTrace());
        }
    }
}
