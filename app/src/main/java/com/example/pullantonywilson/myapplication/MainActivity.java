package com.example.pullantonywilson.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Context con;
    Toast t=Toast.makeText("hai",Toast.LENGTH_LONG);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        con = this;
    }

    public void Open_NewActivity(View view) {
        Intent intent = new Intent(con, MainActivity2Activity.class);
        startActivity(intent);
        intent.putExtra("haloooo","this is from");

    }
}
