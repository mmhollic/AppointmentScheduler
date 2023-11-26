package Vaccines;

import Appointments.Appointment;
import Appointments.VaccineAppointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PfizerVaccine extends Vaccine{
    public PfizerVaccine() {
        // Create the specific data for a Pfizer vaccine
        super("Pfizer",2, 6, LocalDate.now().plusDays(5), "Epping");
    }
    public List<Appointment> getAppointments(){
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String giver;
        // Create the appointments, and determine who gives each
        for(int i=1; i<=numDoses; i++){
            if (i==1) giver="Doctor";
            else giver="Nurse";
            LocalDate ld=firstDose.plusDays((i-1)*daysBetweenDoses);
            appointments.add(new VaccineAppointment(i, ld, this, giver));
        }
        return appointments;
    }
}
