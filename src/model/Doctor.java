package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;
    public Doctor(String name, String email, String speciality){
        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String getName() {
        System.out.println("Polimorfismo desde model.Doctor");
        return super.getName();
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
