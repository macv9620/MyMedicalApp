package exceptions;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Inicia programa");
        try {
            metodo1();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Finaliza programa");
    }

    public static void metodo1() throws CustomException{
        System.out.println("Inicio método1");
        metodo2();
        System.out.println("Fin método1");
    }

    public static void metodo2() throws CustomException{
        System.out.println("Inicio método2");
        System.out.println("Selecciona una opción:");
        System.out.println("1. Continuar programa");
        System.out.println("2. Lanzar error SIN control try/catch (runtime)");
        System.out.println("3. Lanzar error CON control try/catch (runtime)");
        System.out.println("4. Lanzar Heredado de Exception");
        Scanner sc = new Scanner(System.in);
        int response = 0;
        //Control de error cuando usuario ingresa un dato que no es entero
        try {
        response = Integer.valueOf(sc.nextLine());
        }catch (Exception e){
            System.out.println("Error no custom en bloque try catch");
            System.out.println(e);
        }
        switch (response){
            case 1:
                break;
            case 2:
                throw new CustomRunTimeException("Excepción no controlada en try/catch");
            case 3:
                try {
                    throw new CustomRunTimeException("Excepción controlada en try/catch");
                } catch (CustomRunTimeException e){
                    System.out.println("El error fue atrapado");
                    System.out.println("Mensaje del error: " + e.getMessage());
                }
                break;
            case 4:
                throw new CustomException("Mensaje de error heredado de Exception");
        }
        metodo3();
        System.out.println("Fin método2");
    }

    public static void metodo3(){
        System.out.println("Inicio método3");
        System.out.println("Fin método3");
    }


}
