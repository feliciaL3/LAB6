package Model;

public class Car implements TaxiCompany {
    private String car_model;
    private String car_type;
    private String car_color;
    private String car_price;

    public Car(String car_model, String car_type, String car_color, String car_price) {
        this.car_model = car_model;
        this.car_type = car_type;
        this.car_color = car_color;
        this.car_price = car_price;
    }

    public void setcar_model(String car_model) {
        this.car_model = car_model;
    }
    public void setcar_type(String car_type) {
        this.car_type = car_type;
    }
    public void setcar_color(String car_color) {
        this.car_color = car_color;
    }
    public void setcar_price(String car_price) {
    }


    public String getcar_type() {
        return car_type;
    }
    public String getcar_model() {
        return car_model;
    }
    public String getcar_color() {
        return car_color;
    }
    public String getcar_price(){
        return car_price;
    }

    public void isFree() {
        System.out.println("\n" + car_model + " " + car_color + " is free right now.\n");
    }
    public void isDamaged() {
        System.out.println(car_model + " " + car_color + "  is in an accident\n");
    }
    public void isFull() {
        System.out.println(car_model + " " + car_color + " is full\n");
    }
    public void isParking() {
        System.out.println(car_model + " " + car_color + " is parking.\n");
    }
    public void isParked() {
        System.out.println(car_model + " " + car_color + " is parked.\n");
    }
    public void isMoving() {
        System.out.println(car_model + " " + car_color + " is moving.\n");
    }
    public void isinTrafficJam() {
        System.out.println(car_model + " " + car_color + " is in traffic jam.\n");
    }

    public void isFunctional(boolean isFunctional){
        if (isFunctional){
            System.out.println("The car" + getcar_model() + " is functional and has no problem");
        }
        if (!isFunctional){
            System.out.println("The car " + getcar_model() + "  is not functional, must go to mechanic");}
    }

    public Object getprice() {
        return null;
    }
}