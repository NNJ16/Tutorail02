package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.tvMsg2);
        txtMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle","onCreate() invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","onStart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","onResume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","onPause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() invoked");
    }
}
