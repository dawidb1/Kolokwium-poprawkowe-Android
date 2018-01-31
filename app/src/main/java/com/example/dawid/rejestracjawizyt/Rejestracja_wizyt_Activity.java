package com.example.dawid.rejestracjawizyt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Rejestracja_wizyt_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejestracja_wizyt_);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.choose_doctor) void goAvailibleDoctorsActivity(){
        Intent intent = new Intent(Rejestracja_wizyt_Activity.this,AvailibleDoctorsActivity.class);
        startActivity(intent);
    }
}
