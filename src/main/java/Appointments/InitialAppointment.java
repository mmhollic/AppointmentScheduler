package Appointments;

import java.time.LocalDate;

public class InitialAppointment extends Appointment{
    public InitialAppointment(LocalDate date, String location){
        super(date, location);
    }
    public String getDisplayText(){
        return "Initial appointment on "+date.toString()+" with administrator at "+location+"<br>";
    }
}
