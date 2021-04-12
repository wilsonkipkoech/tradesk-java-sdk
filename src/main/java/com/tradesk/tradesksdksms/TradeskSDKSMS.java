/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tradesk.tradesksdksms;

import java.io.IOException;
import java.io.IOException;
import org.json.JSONException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import com.google.gson.Gson;
/**
 *
 * @author wilzkipkoech
 */

public class TradeskSDKSMS {
     public static void main(String[] args) throws IOException, JSONException {
        //pojo class
        Data data = new Data();
        
        // put in your url
        String postUrl = "https://api.tradesk.co.ke/api/v1/gateway/sms";
        
        Gson gson = new Gson();
        HttpClient httpClient = HttpClientBuilder.create().build();
        
        HttpPost post = new HttpPost(postUrl);
        //gson.tojson() converts your pojo to json
        StringEntity postingString = new StringEntity(gson.toJson(data));
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        HttpResponse response = httpClient.execute(post);    
    }
}
