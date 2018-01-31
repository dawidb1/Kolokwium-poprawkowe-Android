package com.example.dawid.rejestracjawizyt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Dawid on 31.01.2018.
 */

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.ViewHolder> {

    public ArrayList<Doctor> doctors = new ArrayList<>();
    private Context context;

    public DoctorAdapter(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.doctor_item,null);
        context = parent.getContext();
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setDoctorName(doctors.get(position).getName());
        holder.setDoctorsHours(doctors.get(position).getWorkingHours());
    }

    @Override
    public int getItemCount() {
        return doctors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        private void setDoctorName(String name)
        {
            this.tvDoctorName.setText(name);
        }
        private void setDoctorsHours(String hours)
        {
            this.tvWorkingHours.setText(hours);
        }

        String defaultText = "WYBIERZ";

        @OnClick(R.id.choose_doctor2) void changeText(){
            if (submitDoctor.getText().equals(defaultText)){
                submitDoctor.setText("WYBRANO");
            }
            else submitDoctor.setText(defaultText);
        }
        @BindView(R.id.doctor_name)
        TextView tvDoctorName;
        @BindView(R.id.working_hours)
        TextView tvWorkingHours;
        @BindView(R.id.choose_doctor2) TextView submitDoctor;
    }



}
