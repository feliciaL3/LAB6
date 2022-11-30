package Model;

public class CustomerServiceRepresentant implements AnotherWorkers {
   
    private String FirstName;
    private String LastName;
    boolean response;

    public CustomerServiceRepresentant(String FirstName, String LastName){
        this.FirstName= FirstName;
        this.LastName= LastName;
    }

  

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }


    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

  
    public void isHelping() {
        System.out.println( "CustomerService Representant " + FirstName+ " is here to help you.\n");
    }
    public void calls() {
        System.out.println("CustomerService Representant " + FirstName + " is calling a passenger for a review.\n");
    }


    public void calls(String passenger, int phone_number, boolean response) {
        if (response) {
            System.out.printf("Customer Service Representant %s %s answers to %s and try to find  a car for the customer." +
                " %n", getFirstName(), getLastName(), phone_number);}
        if (!response){
            System.out.printf("Customer Service Representant %s %s  answers  to %s and anounce  the customer if the care is available" +
                    " %n", getFirstName(), getLastName(), phone_number);
        }
    }
}