package Model;

public interface PhoneOwner extends Person {

    void calls(String passenger, String phone_number);
    void calls(String car, String car_type , String car_color);
}