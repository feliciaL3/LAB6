package Model;

public class Marketolog implements FinancialEmployee {
    private String FirstName;
    private String LastName;

    public Marketolog (String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
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


     public void promovates() {
        System.out.println("The marketolog " + FirstName + " " + LastName + " makes different offers for loyal customers\n");
    } 
    //@Override
    public void supports() {
    }
    public void supports(String platform){
        if (platform.equals("Facebook")){
            System.out.printf("The Marketolog  %s %s makes publicity  for"+ ConsoleColors.WHITE_BOLD+ " TaxiLUX "+ ConsoleColors.RESET+ " Company through Facebook." +
                "%n", getFirstName(), getLastName());}
        if (platform.equals("TV")){
            System.out.printf("The marketolog %s %s makes publicity  for TaxiLUX Companythrough TV." +
                "%n", getFirstName(), getLastName());}
        if (platform.equals("street")){
            System.out.printf("The Marketolog %s %s makes publicity  for TaxiLUX Companyin the street." +
                "%n", getFirstName(), getLastName());}
    }
}