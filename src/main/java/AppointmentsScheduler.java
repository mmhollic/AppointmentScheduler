import Vaccines.ModernaVaccine;
import Vaccines.PfizerVaccine;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AppointmentsScheduler {
    public static void main(String[] args) {
        //Patient John Molecules visits Epping for their Initial appointment and is having the Moderna covid vaccine and the Pfizer flu vaccine
        //Patient Jill Biomedenhall visits Southall and is having just the Pfizer flu vaccine
        Patient patient1 = new Patient("John Molecules", "Epping");
        patient1.addVaccine(new PfizerVaccine());
        patient1.addVaccine(new ModernaVaccine());
        Patient patient2 = new Patient("Jill Biomedenhall", "Southall");
        patient2.addVaccine(new PfizerVaccine());

        // Create a simple window to display the output
        JFrame frame = new JFrame("Appointments");
        frame.setSize(450,400);

        JPanel displayPanel = new JPanel();
        // Create a label for each patient's text
        JLabel displayLabel1 = new JLabel(patient1.getAppointmentsDisplay());
        JLabel displayLabel2 = new JLabel(patient2.getAppointmentsDisplay());

        displayPanel.add(displayLabel1);
        displayPanel.add(displayLabel2);

        frame.setContentPane(displayPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
