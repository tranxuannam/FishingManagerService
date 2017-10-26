package com.fishing.namtran.fishingmanagerservice;

import android.content.Intent;
import android.os.Bundle;

public class DisplayMessageActivity extends BaseMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_display_message);

        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        //TextView textView = (TextView) findViewById(R.id.textView);
        //textView.setText(message);

        //intent = new Intent(getApplicationContext(), MenuMainActivity.class);
       // startActivity(intent);
    }


}
