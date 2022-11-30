package Model;

public class Passenger implements PhoneOwner{
    public static String AcceptedTheOffer;
    private String FirstName;
    private String LastName;
    private String phone_number;
    public Passenger(String FirstName, String LastName,String phone_number) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.phone_number = phone_number;
    }

    //@Override
    public void calls(String passenger, String phone_number) {
    }
    //@Override
    public void calls(String car, String car_type,String car_color ) {
        System.out.println("Passenger " + FirstName + " is calling from "+ phone_number + "  to get  info about disponibility of  "+ car_type + " "+ car_color + ".");
    }

    /**
     * @param dissapointed
     * @param satisfied
     */
    public void goodBye(boolean dissapointed, boolean satisfied){
        if( dissapointed){
            System.out.println("CustomerServiceRepresentant: " + FirstName + "We are so sorry for not providing you " +
                               "a high-level service. Hope, you will give us another chance.");
            setReputation(-1);
        }
        else {
            System.out.println("CustomerServiceRepresentant: Hope you had a great time. Waiting for your next trip.");
            setReputation(1);
        }};
    private void setReputation(int i) {
    }

    public void getsToDestination(boolean happy, String driver, String FirstName){
        if (happy){
        System.out.println("Passenger " +" " +getFirstName() + " has arrived to the destination happy.");
         System.out.println(FirstName + " got tips.");}
        else {
            System.out.println( "Passenger" + " " + getFirstName() + " has arrived to the destination unhappy."); 
        } 
    } 
    
    public static void AcceptedTheOffer(String FirstName ,String car, String car_type, String carmodel) {
        System.out.println( "Passenger" +" " + FirstName +" "+ "agreed with price offer and  is ready to be picked up by the  car "+ carmodel + " " + car_type +" .");
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }


    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public static String getAcceptedTheOffer() {
        return AcceptedTheOffer;
    }

    public static void setAcceptedTheOffer(String acceptedTheOffer) {
        AcceptedTheOffer = acceptedTheOffer;
    }

}