package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        return super.getName();
    }

    ArrayList<AvailableAppointments> availableDates = new ArrayList<>();
    public void addAvailableDate(String date, String time){
        availableDates.add(new AvailableAppointments(date, time));
    }

    public ArrayList<AvailableAppointments> getAvailableDates(){
        return availableDates;
    };

    public static class AvailableAppointments{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        AvailableAppointments(String date, String time) {

            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
            System.out.println("New date available added successfully " + "[" + date + " " + time + "]");
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
