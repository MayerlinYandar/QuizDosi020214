package com.example.aula7.quizdosi020214.Parser;

import com.example.aula7.quizdosi020214.Models.Post;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AULA 7 on 19/04/2018.
 */

public class Json {
    public static List<Post> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);
        List<Post> postList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            JSONObject item = jsonArray.getJSONObject(i);
            JSONObject item2= item.getJSONObject("address");
            Post post = new Post();

            post.setName(item.getString("name"));
            post.setUsername(item.getString("username"));
            post.setEmail(item.getString("email"));
            post.setStreet(item2.getString("street"));

            postList.add(post);

        }

        return postList;
    }

}


