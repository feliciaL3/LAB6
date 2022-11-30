package Model;

public class Mechanic implements CarEmployee {
    private String FirstName;
    private String LastName;
    private int age;
    private String phone_number;

    public Mechanic(String FirstName, String LastName, int age, String string) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.phone_number = string;
    }
    

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone_number() {
        return phone_number;
    }


    public void quitJob(){
        System.out.println("Mechanic is leaving this job");
    }
    public void repairs(String car, String car_model, String type) {
        System.out.println("Mechanic " + FirstName + " " + LastName + " is repairing the car  " + car_model + " " + type + ".");
    }
    public void isOnBreak(String FirstName) {
        System.out.println("Mechanic " + getFirstName() + " " + LastName + " is now on break.");
    }
}
