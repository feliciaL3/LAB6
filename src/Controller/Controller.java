package Controller;
import Model.*;
import View.View;
import java.util.List;
import java.util.Random;

public class Controller {
    private CustomerServiceRepresentant CustomerServiceRepresentant1;
    private PartnershipsRepresentant pr1;
    private Director AsociatedDirector;
    private Accountant accountant1;
    private Passenger[] passenger;
    private Marketolog marketing1;
    private Mechanic mechanic1;
    private Director director;
    private Driver[] driver;
    private View view;
    private Car[] car;

    public Controller(Car[] car,Director director,Accountant accountant12,Accountant accountant1,HumanResourcesRepresentant humanResourcesRepresentant,Driver[] driver, 
                      Passenger[] passenger, PartnershipsRepresentant pr1, Marketolog marketing1,
                      CustomerServiceRepresentant CustomerServiceRepresentant1, 
                      Mechanic mechanic1, View view){
        this.CustomerServiceRepresentant1 = CustomerServiceRepresentant1;
        this.AsociatedDirector = AsociatedDirector;
        this.accountant1 = accountant1;
        this.marketing1 = marketing1;
        this.passenger = passenger;
        this.director = director;
        this.driver = driver;
        this.view = view;
        this.car = car;
        this.pr1 = pr1;
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
    public String getRandomCustomerServiceRepresentantFirstName (List<CustomerServiceRepresentant> CustomerServiceRepresentantArray) {
        return CustomerServiceRepresentantArray.get(getRandomNumberInRange(0, CustomerServiceRepresentantArray.size() - 1)).getFirstName();
    }
    public void setCustomerServiceRepresentant1FirstName(String FirstName){
        CustomerServiceRepresentant1.setFirstName(FirstName);
    }
    public String getCustomerServiceRepresentant1FirstName(){
        return CustomerServiceRepresentant1.getFirstName();
    }
    public void setMechanic1FirstName(String FirstName){
        mechanic1.setFirstName(FirstName);
    }
    public String getMechanic1FirstName(){
        return mechanic1.getFirstName();
    }
   

    private static int getRandomNumberInRange ( int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}