package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);

        String msg = getIntent().getStringExtra("msg");

        TextView textViewReceivedMsg = findViewById(R.id.textViewReceivedMessage);
        textViewReceivedMsg.setText(msg);
    }
}