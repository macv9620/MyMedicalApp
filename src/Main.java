import java.util.ArrayList;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main (String[] args) {
        //Al ser public se puede acceder directamente al método setter únicamente instanciando la clase

        Doctor myDoctor = new Doctor("Mateo Vasco", "Internista");
        myDoctor.addAvailableDate(new Date(), "2pm");
        myDoctor.addAvailableDate(new Date(), "5pm");
        myDoctor.addAvailableDate(new Date(), "9pm");

        System.out.println("Available dates for Dr: " + myDoctor.getName());
        for(Doctor.AvailableAppointments avAppointment : myDoctor.getAvailableDates()){
            System.out.println(avAppointment.getDate() + " " + avAppointment.getTime());
        }

    }
}
