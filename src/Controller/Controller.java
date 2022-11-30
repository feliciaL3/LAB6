package Controller;
import Model.*;
import View.View;
import java.util.List;
import java.util.Random;

public class Controller {
    private CustomerServiceRepresentant CustomerServiceRepresentant1;
    private CustomerServiceRepresentant CustomerServiceRepresentant2;
    private CustomerServiceRepresentant CustomerServiceRepresentant3;
    private PartnershipsRepresentant pr1;
    private PartnershipsRepresentant pr2;
    private Director AsociatedDirector;
    private Accountant accountant1;
    private Accountant accountant2;
    private Passenger[] passenger;
    private Marketolog marketing1;
    private Marketolog marketing2;
    private Marketolog marketing3;
    private Mechanic mechanic1;
    private Mechanic mechanic2;
    private Director director;
    private Driver[] driver;
    private View view;
    private Car[] car;

    public Controller(Car[] car,Director director,Director AsociatedDirector,Accountant accountant1,Accountant accountant2,Driver[] driver, 
                      Passenger[] passenger, PartnershipsRepresentant pr1, PartnershipsRepresentant pr2,
                      Marketolog marketing1,Marketolog marketing2, Marketolog marketing3,
                      CustomerServiceRepresentant CustomerServiceRepresentant1, CustomerServiceRepresentant CustomerServiceRepresentant2, CustomerServiceRepresentant CustomerServiceRepresentant3,
                      Mechanic mechanic1, Mechanic mechanic2, View view){
        this.CustomerServiceRepresentant1 = CustomerServiceRepresentant1;
        this.CustomerServiceRepresentant2 = CustomerServiceRepresentant2;
        this.CustomerServiceRepresentant3 = CustomerServiceRepresentant3;
        this.AsociatedDirector = AsociatedDirector;
        this.accountant1 = accountant1;
        this.accountant2 = accountant2;
        this.marketing1 = marketing1;
        this.marketing2 = marketing2;
        this.marketing3 = marketing3;
        this.passenger = passenger;
        this.director = director;
        this.driver = driver;
        this.view = view;
        this.car = car;
        this.pr1 = pr1;
        this.pr2 = pr2;
    }
    
    public String getRandomCarModelFirstName (List<Car> CarArray){
        return CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getcar_model();
    }
    public String getRandomCarType (List<Car> CarArray){
        return CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getcar_type();
    }
    public String getRandomCarPrice (List<Car> CarArray){
        return CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getcar_price();
    }
    public void setCarModel(String model, int i){
        car[i].setcar_model(model);
    }
    public String getCarModel(int i){
        return car[i].getcar_model();
    }
    public void setCarType(String type, int i){
        car[i].setcar_type(type);
    }
    public String getCarType(int i){
        return car[i].getcar_type();
    }
    public void setCarPrice(String price, int i){
        car[i].setcar_price(price);
    }
    public String getCarPrice(int i){
        return car[i].getcar_price();
    }


    public void setDirectorFirstName(String FirstName){
        director.setFirstName(FirstName);
    }
    public String getDirectorFirstName(){
        return director.getFirstName();
    }
    public void setDirectorLastName(String LastName){
        director.setFirstName(LastName);
    }
    public String getDirectorLastName(){
        return director.getLastName();
    }
    public void setAsociatedDirectorFirstName(String FirstName){
        AsociatedDirector.setFirstName(FirstName);
    }
    public String getAsociatedDirectorFirstName(){
        return AsociatedDirector.getFirstName();
    }
    public void setAsociatedDirectorLastName(String LastName){
        AsociatedDirector.setLastName(LastName);
    }
    public String getAsociatedDirectorLastName(){
        return AsociatedDirector.getLastName();
    }
    public void setaccountant1FirstName(String FirstName){
        accountant1.setFirstName(FirstName);
    }
    public String getaccountant1FirstName(){
        return accountant1.getFirstName();
    }
    public void setaccountant1LastName(String LastName){
        accountant1.setLastName(LastName);
    }
    public String getaccountant1LastName(){
        return accountant1.getLastName();
    }
    public void setaccountant1Role(String role){
        accountant1.setRole(role);
    }
    public String getaccountant1Role(){
        return accountant1.getRole();
    }
    public void setaccountant2FirstName(String FirstName){
        accountant2.setFirstName(FirstName);
    }
    public String getaccountant2FirstName(){
        return accountant2.getFirstName();
    }
    public void setaccountant2LastName(String LastName){
        accountant2.setLastName(LastName);
    }
    public String getaccountant2LastName(){
        return accountant2.getLastName();
    }
    public void setaccountant2Role(String role){
        accountant2.setRole(role);
    }
    public String getaccountant2Role(){
        return accountant2.getRole();
    }
 

    public String getRandomDriverFirstName (List<Driver> DriverArray){
        return DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getFirstName();
    }
    public void setDriverFirstName(String FirstName, int i){
        driver[i].setFirstName(FirstName);
    }
    public String getDriverFirstName(int i){
        return driver[i].getFirstName();
    }
    public void setDriverLastName(String LastName, int i){
        driver[i].setLastName(LastName);
    }
    public String getDriverLastName(int i){
        return driver[i].getLastName();
    }
    public void setDriverAge(int age, int i){
        driver[i].setAge(age);
    }
    public int getDriverAge(int i){
        return driver[i].getAge();
    }
    public void setDriverDrivingYears(int driving_Years, int i){
        driver[i].setdriving_Years(driving_Years);
    }
    public int getDriverDrivingYears(int i){
        return driver[i].getdriving_years();
    }
    public void setDriverisAmable(boolean isAmable, int i){
        driver[i].setisAmable(isAmable);
    }
    public boolean getDriverisAmable(int i){
        return driver[i].isAmable();
    }
    public void setDriverHasGeoSkills(boolean hasGeographicalSkiils, int i){
        driver[i].sethasGeographicalSkills(hasGeographicalSkiils);
    }
    public boolean getDriverHasGeoSkills(int i){
        return driver[i].hasGeographicalSkiils();
    }
    public void setDriverisProfessionist(boolean isProfessionist, int i){
        driver[i].setisProfessionist(isProfessionist);
    }
    public boolean getDriverisProfessionist(int i){
        return driver[i].isProfessionist();
    }
    public void setDriverWorkExperience(int work_exp, int i){
        driver[i].setWork_exp(work_exp);
    }
    public int getDriverWorkExperience(int i){
        return driver[i].getWork_exp();
    }


    public String getRandomPassengerPhoneNumber(List<Passenger> PassengerArray) {
        return PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size() - 1)).getPhone_number();
    }
    public void setPassengerFirstName(String FirstName, int i){
        passenger[i].setFirstName(FirstName);
    }
    public String getPassengerFirstName(int i){
        return passenger[i].getFirstName();
    }
    public void setPassengerLastName(String LastName, int i){
        passenger[i].setLastName(LastName);
    }
    public String getPassengerLastName(int i){
        return passenger[i].getLastName();
    }
    public void setPassengerPhoneNumber(String phone_number, int i){
        passenger[i].setPhone_number(phone_number);
    }
    public String getPassengerPhoneNumber(int i){
        return passenger[i].getPhone_number();
    }
 

    public void setpr1FirstName(String FirstName){
        pr1.setFirstName(FirstName);
    }
    public String getpr1FirstName(){
        return pr1.getFirstName();
    }
    public void setpr1LastName(String LastName){
        pr1.setLastName(LastName);
    }
    public String getpr1LastName(){
        return pr1.getLastName();
    }
    public void setpr2FirstName(String FirstName){
        pr2.setFirstName(FirstName);
    }
    public String getpr2FirstName(){
        return pr2.getFirstName();
    }
    public void setpr2LastName(String LastName){
        pr2.setLastName(LastName);
    }
    public String getpr2LastName(){
        return pr2.getLastName();
    }
   

    public void setMarketing1FirstName(String FirstName){
        marketing1.setFirstName(FirstName);
    }
    public String getMarketing1FirstName(){
        return marketing1.getFirstName();
    }
    public void setMarketing1LastName(String LastName){
        marketing1.setLastName(LastName);
    }
    public String getMarketing1LastName(){
        return marketing1.getLastName();
    }
    public void setMarketing2FirstName(String FirstName){
        marketing2.setFirstName(FirstName);
    }
    public String getMarketing2FirstName(){
        return marketing2.getFirstName();
    }
    public void setMarketing2LastName(String LastName){
        marketing2.setLastName(LastName);
    }
    public String getMarketing2LastName(){
        return marketing2.getLastName();
    }
    public void setMarketing3FirstName(String FirstName){
        marketing3.setFirstName(FirstName);
    }
    public String getMarketing3FirstName(){
        return marketing3.getFirstName();
    }
    public void setMarketing3LastName(String LastName){
        marketing3.setLastName(LastName);
    }
    public String getMarketing3LastName(){
        return marketing3.getLastName();
    }
    public String getRandomCustomerServiceRepresentantFirstName (List<CustomerServiceRepresentant> CustomerServiceRepresentantArray) {
        return CustomerServiceRepresentantArray.get(getRandomNumberInRange(0, CustomerServiceRepresentantArray.size() - 1)).getFirstName();
    }

    public void setCustomerServiceRepresentant1FirstName(String FirstName){
        CustomerServiceRepresentant1.setFirstName(FirstName);
    }
    public String getCustomerServiceRepresentant1FirstName(){
        return CustomerServiceRepresentant1.getFirstName();
    }
    public void setCustomerServiceRepresentant1LastName(String LastName){
        CustomerServiceRepresentant1.setLastName(LastName);
    }
    public String getCustomerServiceRepresentant1LastName(){
        return CustomerServiceRepresentant1.getLastName();
    }
    public void setCustomerServiceRepresentant2FirstName(String FirstName){
        CustomerServiceRepresentant2.setFirstName(FirstName);
    }
    public String getCustomerServiceRepresentant2FirstName(){
        return CustomerServiceRepresentant2.getFirstName();
    }
    public void setCustomerServiceRepresentant2LastName(String LastName){
        CustomerServiceRepresentant2.setLastName(LastName);
    }
    public String getCustomerServiceRepresentant2LastName(){
        return CustomerServiceRepresentant2.getLastName();
    }
    public void setCustomerServiceRepresentant3FirstName(String FirstName){
        CustomerServiceRepresentant3.setFirstName(FirstName);
    }
    public String getCustomerServiceRepresentant3FirstName(){
        return CustomerServiceRepresentant3.getFirstName();
    }
    public void setCustomerServiceRepresentant3LastName(String LastName){
        CustomerServiceRepresentant3.setLastName(LastName);
    }
    public String getCustomerServiceRepresentant3LastName(){
        return CustomerServiceRepresentant3.getLastName();
    }


    public void setMechanic1FirstName(String FirstName){
        mechanic1.setFirstName(FirstName);
    }
    public String getMechanic1FirstName(){
        return mechanic1.getFirstName();
    }
    public void setMechanic1LastName(String LastName){
        mechanic1.setLastName(LastName);
    }
    public String getMechanic1LastName(){
        return mechanic1.getLastName();
    }
    public void setMechanic1Age(int age){
        mechanic1.setAge(age);
    }
    public int getMechanic1Age(){
        return mechanic1.getAge();
    }
    public void setMechanic1PhoneNumber(String phone_number, int i){
        mechanic1.setPhone_number(phone_number);
    }
    public String getMechanic1PhoneNumber(int i){
        return mechanic1.getPhone_number();
    }
    public void setMechanic2FirstName(String FirstName){
        mechanic2.setFirstName(FirstName);
    }
    public String getMechanic2FirstName(){
        return mechanic2.getFirstName();
    }
    public void setMechanic2LastName(String LastName){
        mechanic2.setLastName(LastName);
    }
    public String getMechanic2LastName(){
        return mechanic2.getLastName();
    }
    public void setMechanic2Age(int age){
        mechanic2.setAge(age);
    }
    public int getMechanic2Age(){
        return mechanic2.getAge();
    }
    public void setMechanic2PhoneNumber(String phone_number, int i){
        mechanic2.setPhone_number(phone_number);
    }
    public String getMechanic2PhoneNumber(int i){
        return mechanic2.getPhone_number();
    }


    private static int getRandomNumberInRange ( int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
