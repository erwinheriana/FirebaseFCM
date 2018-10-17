package com.example.heriana.firebasefcm;

import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

        public static String title;
        public static String body;

        public TextView tvjudul, tvisi;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            MyFirebaseMessagingService ambilToken= new MyFirebaseMessagingService();

            ambilToken.onTokenRefresh();

            tvjudul = (TextView) findViewById(R.id.tvjudul);
            tvisi = (TextView) findViewById(R.id.tvisi);

            if(title !=null || body !=null)
            {
                tvjudul.setText(title);
                tvisi.setText(body);
            }
        }
    }
