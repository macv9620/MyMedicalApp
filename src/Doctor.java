import javax.print.Doc;

public class Doctor {
    int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Ejecutando constructor");
    }

    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println(id);
    }
}
