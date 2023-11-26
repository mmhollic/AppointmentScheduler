package Appointments;

import Vaccines.Vaccine;

import java.time.LocalDate;

public class VaccineAppointment extends Appointment{
    // Vaccine appointments hold the information about who gives them, and which dose number
    private Vaccine vaccine;
    private String giver=new String();
    private int doseNumber;
    public VaccineAppointment(int doseNumber, LocalDate date, Vaccine vaccine, String giver){
        super(date, vaccine.getLocation());
        this.vaccine=vaccine;
        this.giver=giver;
        this.doseNumber=doseNumber;
    }
    public String getDisplayText(){
        return "Vaccine:"+vaccine.getName()+" Dose "+doseNumber+" given by: "+giver+" date "+date.toString()+" at "+location+"<br>";
    }
}
