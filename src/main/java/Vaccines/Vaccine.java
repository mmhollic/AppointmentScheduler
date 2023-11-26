package Vaccines;

import Appointments.Appointment;
import java.time.LocalDate;
import java.util.List;

public abstract class Vaccine {
    // The common settings for all vaccines
    protected String name;
    protected int numDoses;
    protected int daysBetweenDoses;
    private String location;
    protected LocalDate firstDose;

    public Vaccine(String name, int numDoses, int daysBetweenDoses, LocalDate firstDose, String location){
        this.name = name;
        this.numDoses = numDoses;
        this.daysBetweenDoses = daysBetweenDoses;
        this.location= location;
        this.firstDose=firstDose;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }

    // Specific vaccines return their specific appointments
    public abstract List<Appointment> getAppointments();

}
