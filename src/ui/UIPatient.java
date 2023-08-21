package ui;

import java.util.Scanner;

public class UIPatient {
    public static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println();
            System.out.println("Welcome Patient " + UIMenu.loggedPatient.getName());
            System.out.println("What would you want to do?");
            System.out.println("1. Book an appointment");
            System.out.println("2. Check my appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);
    }

    private static void showAvailableAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println("::Book an appointment");
            System.out.println("::    Select a mont:");
        } while (response != 0);

    }
}
