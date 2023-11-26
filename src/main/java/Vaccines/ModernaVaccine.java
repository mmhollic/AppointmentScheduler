package Vaccines;

import Appointments.Appointment;
import Appointments.VaccineAppointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ModernaVaccine extends Vaccine {
    public ModernaVaccine() {
        super("Moderna",3, 4, LocalDate.now().plusDays(5), "Southall");
    }
    public List<Appointment> getAppointments(){
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        String giver;
        for(int i=1; i<=numDoses; i++){
            if (i==1) giver="Nurse";
            else giver="Doctor";
            LocalDate ld=firstDose.plusDays((i-1)*daysBetweenDoses);
            appointments.add(new VaccineAppointment(i, ld, this, giver));
        }
        return appointments;
    }
}
