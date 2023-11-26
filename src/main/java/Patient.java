import Appointments.Appointment;
import Appointments.InitialAppointment;
import Vaccines.Vaccine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private final String name;
    private ArrayList<Vaccine> vaccines = new ArrayList<Vaccine>();
    private InitialAppointment initialAppointment;
    public Patient(String name, String initialAppointmentLocation){
        this.name = name;
        // The initial appointment happens now, as the patient is being entered into the system
        initialAppointment=new InitialAppointment(LocalDate.now(),initialAppointmentLocation);
    }
    public void addVaccine(Vaccine vaccine){
        vaccines.add(vaccine);
    }
    public String getAppointmentsDisplay(){
        // Get a string displaying the appointment information for this patient
        // Surround with <html></html> tags so it can be displayed in a JLabel with <br> to make newlines
        // Note - if printing to the console instead, use \n instead of <br>
        String display=new String("<html>");
        display+="Patient: "+name+"<br>";
        display+=initialAppointment.getDisplayText();
        for(Vaccine vax:vaccines){
            List<Appointment> appts=vax.getAppointments();
            for (Appointment apt:appts){
                display+=apt.getDisplayText();
            }
        }
        return display+"<br></html>";
    }
}
