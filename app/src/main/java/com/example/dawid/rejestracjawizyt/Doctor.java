package com.example.dawid.rejestracjawizyt;

/**
 * Created by Dawid on 31.01.2018.
 */

public class Doctor {
    private String name;
    private String workingHours;

    public Doctor(String name, String workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }


}
