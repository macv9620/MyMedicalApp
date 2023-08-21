package ui;

import model.Doctor;
import model.Patient;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
    public static Doctor loggedDoctor;
    public static Patient loggedPatient;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Login as a:");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    Auth(1);
                    response = 0;
                    break;
                case 2:
                    Auth(2);
                    response = 0;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void Auth(int userType) {

        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        doctors.add(new Doctor("Daniela Cortes", "d@mail.com", "Ped"));
        doctors.add(new Doctor("Mariano Castro", "mariano@mail.com", "Onc"));
        doctors.add(new Doctor("Paula Sandoval", "paula@mail.com", "Obs"));

        ArrayList<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("Mateo Vasco", "mateo@mail.com"));
        patients.add(new Patient("Juliana Castaño", "juliana@mail.com"));
        patients.add(new Patient("Dario Garcia", "dario@mail.com"));

        boolean canAccess = false;

        do{
            if (userType == 1) {
                System.out.println("[Doctor] Please type your email:");
                Scanner sc = new Scanner(System.in);
                String email = sc.nextLine();

                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        canAccess = true;
                        loggedDoctor = d;
                        System.out.println("ShowDoctorMenu");
                        UIDoctor.showDoctorMenu();
                    }
                }
                if (!canAccess){
                    System.out.println("Email doesn't exist");
                }
            }
            if (userType == 2) {
                System.out.println("[Patient] Please type your email:");
                Scanner sc = new Scanner(System.in);
                String email = sc.nextLine();

                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        canAccess = true;
                        loggedPatient = p;
                        UIPatient.showPatientMenu();
                    }
                }
                if (!canAccess){
                    System.out.println("Email doesn't exist");
                }
            }
        } while (!canAccess);

    }

    static void testShowPatientMenu(){
        int response = 0;
        do {
            System.out.println("¡Welcome!");
            System.out.println("What would you want to do?");
            System.out.println("1. Book an appointment");
            System.out.println("2. Check my appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for(int i = 1; i < 4; i++){
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

}