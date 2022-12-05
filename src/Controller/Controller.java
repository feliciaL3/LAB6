package Controller;
import Model.*;
import View.View;
import java.util.List;
import java.util.Random;

public class Controller {

    public Controller (View view){
        this.view=view;
    }

    private PartnershipsRepresentant pr1;
    private Passenger[] passenger;
    private Accountant accountant1;
    private Marketolog marketing1;
    private Director director;
    private View view;

    public Controller(Car[] car,Director director,Accountant accountant1,Driver[] driver, 
                      Passenger[] passenger, Marketolog marketing1,Mechanic mechanic1, View view){

        this.accountant1 = accountant1;
        this.marketing1 = marketing1;
        this.passenger = passenger;
        this.director = director;
        this.view = view;
    }
    
    public String getRandomCarModel (List<Car> CarArray){
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
    public void setaccountant1FirstName(String FirstName){
        accountant1.setFirstName(FirstName);
    }
    public String getaccountant1FirstName(){
        return accountant1.getFirstName();
    }
    public String getRandomDriverFirstName (List<Driver> DriverArray){
        return DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getFirstName();
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
    public void setpr1FirstName(String FirstName){
        pr1.setFirstName(FirstName);
    }
    public String getpr1FirstName(){
        return pr1.getFirstName();
    }
    public void setMarketing1FirstName(String FirstName){
        marketing1.setFirstName(FirstName);
    }
    public String getMarketing1FirstName(){
        return marketing1.getFirstName();
    }

    private static int getRandomNumberInRange ( int min, int max){
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
