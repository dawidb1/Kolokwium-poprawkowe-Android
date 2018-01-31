package com.example.dawid.rejestracjawizyt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AvailibleDoctorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availible_doctors);
        ButterKnife.bind(this);

        doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Jan Kowalski","Pn-Pt 7.00-16.00"));
        doctors.add(new Doctor("Andrzej Kowalski","Pn-Pt 7.00-16.00"));
        doctors.add(new Doctor("Maciek Kowalski","Pn-Pt 7.00-16.00"));
        doctors.add(new Doctor("Zdzisław Kowalski","Pn-Pt 9.00-16.00"));
        doctors.add(new Doctor("Bożena Kowalska","Pn-Pt 7.00-15.00"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
//
        DoctorAdapter coffesAdapter = new DoctorAdapter(doctors);
        recyclerView.setAdapter(coffesAdapter);
    }
    private ArrayList<Doctor> doctors;
    @BindView(R.id.recycle_view) RecyclerView recyclerView;
}
