/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtphrases,txtnumber,txtfamily,txtcolors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        txtphrases =(TextView)findViewById(R.id.phrases);
        txtphrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Phrases of Language",Toast.LENGTH_LONG).show();
            }
        });
        txtcolors = (TextView)findViewById(R.id.colors);
        txtcolors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Colors of Language",Toast.LENGTH_LONG).show();
            }
        });
        txtnumber = (TextView)findViewById(R.id.numbers);
        txtnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Numbers of Language",Toast.LENGTH_LONG).show();
            }
        });
        txtfamily = (TextView)findViewById(R.id.family);
        txtfamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Family of Language",Toast.LENGTH_LONG).show();
            }
        });


    }



}
