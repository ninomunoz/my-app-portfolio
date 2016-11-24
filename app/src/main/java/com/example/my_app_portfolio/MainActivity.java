package com.example.my_app_portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view) {
        String app = ((TextView)view).getText().toString();
        String message = getString(R.string.toast_prefix) + " '" + app + "'";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}