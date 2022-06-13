package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        Button buttonSendChoose = findViewById(R.id.buttonSendChoose);
        Button buttonSend = findViewById(R.id.buttonSend);
        EditText editTextMsg = findViewById(R.id.editTextMessage);


        buttonSendChoose.setOnClickListener(v -> {
            String msg = editTextMsg.getText().toString();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, msg);
            Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title));
            startActivity(chosenIntent);
        });

        buttonSend.setOnClickListener(v -> {
            String msg = editTextMsg.getText().toString();
            Intent intent = new Intent(this, ReceivedMessageActivity.class);
            intent.putExtra("msg", msg);
            startActivity(intent);
        });

    }
}