package com.example.volleylibraryeg_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

   private ListView listView;
    private UserAdapter adapter;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        userList = new ArrayList<>();
        adapter = new UserAdapter(this, userList);
        listView.setAdapter(adapter);


        String url = "https://jsonplaceholder.typicode.com/users";


        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<org.json.JSONArray>() {
            @java.lang.Override
            public void onResponse(org.json.JSONArray response) {

                for(int i = 0; i<response.length(); i++)
                {
                    try{
                        JSONObject jsonObject = response.getJSONObject(i);
                        int id = jsonObject.getInt("id");
                        String name = jsonObject.getString("name");
                        String username = jsonObject.getString("username");
                        String email = jsonObject.getString("email");

                        User user = new User(id,name,username,email);
                        userList.add(user);

                    }catch (JSONException e){
                        e.printStackTrace();
                    }
                }

                adapter.notifyDataSetChanged();

            }

            }, new Response.ErrorListener(){

            public void onErrorResponse(VolleyError error)
            {
                android.widget.Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonArrayRequest);

    }
}