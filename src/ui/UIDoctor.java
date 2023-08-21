package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctor {
    public static ArrayList<Doctor> doctorsWithAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("Welcome Doctor@: " + UIMenu.loggedDoctor.getName());
            System.out.println("What would you want to do?");
            System.out.println("1. Add an available date");
            System.out.println("2. My scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    addAvailableAppointment();
                    response = 0;
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void addAvailableAppointment(){
        int response = 0;
        do{
            System.out.println();
            System.out.println(":: Add your available date");
            System.out.println("::    Select a month:");

            for(int i = 0; i < 3; i++){
                System.out.println((i + 1)+ ". "+ UIMenu.MONTHS[i]);
            }

            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response <4){
                int selectedMonth = response;
                System.out.println();
                System.out.println("Selected month: " + selectedMonth + ". " + UIMenu.MONTHS[selectedMonth-1]);
                System.out.println("Type your available date: [dd/mm/yyyy]");

                String date = sc.nextLine();

                System.out.println("Your new available date is: " + UIMenu.MONTHS[selectedMonth-1] + " "
                + date);

                System.out.println("1. Confirm");
                System.out.println("0. Return");

                int confirmDate = Integer.valueOf(sc.nextLine());

                if (confirmDate != 1) continue;
                response = 1;
                int confirmTime = 0;
                String time = "";
                do{
                    System.out.println("Confirm the available time [hh:mm]");
                    time = sc.nextLine();
                    System.out.println("Is the time: " + time + " correct?");
                    System.out.println("1. Save new available date (" + UIMenu.MONTHS[selectedMonth-1]
                    + " " + date + " " + time + ")");
                    System.out.println("0. Edit time");

                    confirmTime = Integer.valueOf(sc.nextLine());
                    if (confirmTime == 0) continue;
                    if (confirmTime == 1){
                       UIMenu.loggedDoctor.addAvailableDate(date, time);
                       addDoctorToDoctorsWithAvailableAppointments(UIMenu.loggedDoctor);
                       showDoctorMenu();
                    }

                } while (confirmTime != 1);

            } else if(response == 0){
                showDoctorMenu();
            }
        } while (response != 0);
    }

    private static void addDoctorToDoctorsWithAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableDates().size() > 0 && !doctorsWithAvailableAppointments.contains(doctor)){
            doctorsWithAvailableAppointments.add(doctor);
        }
    }


}
