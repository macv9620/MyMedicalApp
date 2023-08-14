import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    private int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String speciality;

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    ArrayList<AvailableAppointments> availableDates = new ArrayList<>();
    public void addAvailableDate(Date date, String time){
        availableDates.add(new AvailableAppointments(date, time));
    }

    public ArrayList<AvailableAppointments> getAvailableDates(){
        return availableDates;
    };

    public static class AvailableAppointments{
        private int id;
        private Date date;
        private String time;

        AvailableAppointments(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
