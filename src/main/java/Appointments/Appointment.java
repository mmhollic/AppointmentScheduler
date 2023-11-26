package Appointments;

import java.time.LocalDate;

public abstract class Appointment {
    // Date and location are common to all appointments
    protected LocalDate date;
    protected String location;
    public Appointment(LocalDate date, String location){
        this.date = date;
        this.location=location;
    }
    public abstract String getDisplayText();

}
