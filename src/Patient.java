public class Patient {
    private String name;
    private String email;
    private String address;
    private String proneNumber;
    private String birthday;
    private String blood;
    private double weight;
    private double height;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProneNumber() {
        return proneNumber;
    }

    public void setProneNumber(String proneNumber) {
        this.proneNumber = proneNumber;
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
