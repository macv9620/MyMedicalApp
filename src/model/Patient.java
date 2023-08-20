package model;

public class Patient extends User {

    private String birthday;
    private String blood;
    private double weight;
    private double height;

    public Patient(String name, String email){
        super(name, email);
    }

    @Override
    public String getName() {
        System.out.println("Polimorfismo desde model.Patient");
        return super.getName();
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getWeight(){
        return (this.weight + " Kg.");
    }

    public String getHeight() {
        return height + " m.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
