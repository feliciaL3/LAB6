package Model;

public class Driver implements CarEmployee {
    private String FirstName;
    private String LastName;
    private  int age;
    int driving_years;
    boolean isAmable;
    boolean isProfessionist;
    boolean hasGeographicalSkills;
    int work_exp;

    public Driver(String FirstName, String LastName, int age,
    int driving_years ,boolean isAmable, boolean isProfessionist,
    boolean hasGeographicalSkiils, int work_exp) {
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.age = age;
    this.driving_years = driving_years;
    this.isAmable= isAmable();
    this.isProfessionist = isProfessionist;
    this.hasGeographicalSkills = hasGeographicalSkiils;
    this.work_exp = work_exp;
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
    public void setdriving_Years(int driving_years) {
        this.driving_years = driving_years;
    }
    public void setisAmable(boolean isAmable) {
        this.isAmable = isAmable;
    }
    public void setisProfessionist(boolean isProfessionist) {
        this.isProfessionist = isProfessionist;
    }
    public void sethasGeographicalSkills(boolean hasGeographicalSkills) {
        this.hasGeographicalSkills = hasGeographicalSkills;
    }
    public void setWork_exp(int work_exp) {
        this.work_exp = work_exp;
    }

    public  String getFirstName() {
        return FirstName;
    }
    public String getLastName (){
        return LastName;
    }
    public int getAge() {
        return age;
    }
    public int getdriving_years() {
        return driving_years;
    }
    public boolean isAmable() {
        return isAmable;
    }
    public boolean isProfessionist() {
        return isProfessionist;
    }
    public boolean hasGeographicalSkiils() {
        return hasGeographicalSkills;
    }
    public int getWork_exp() {
        return work_exp;
    }
    

    public void works() {
        System.out.println("Driver "  + getFirstName() +" " + "works right now and can't take another passenger");
    }
    public void isDriving(String car, String car_model, String car_type, String car_color) {
        System.out.println("Driver "  + getFirstName() + " " +  " is driving a  " + car_model + " " + car_type + " " + car_color +  " " + ".\n");
    }
    public void isWaiting() {
        System.out.println("Driver " + getFirstName()  + " is waiting for the passenger"+ ".\n");
    }
    public void isOnBreak(String FirstName) {
        System.out.println("The Driver "  + getFirstName() + " has a pause right now  and can't take orders."  );
    }
}