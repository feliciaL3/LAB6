package Model;

public class Director implements Person {

    private String FirstName;
    private String LastName;

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
    public Director(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void ownsABusiness() {
        System.out.println(getFirstName() + " " + getLastName() + " owns the  taxi company " + TaxiCompany.CompanyName + ".");
    }
    public void improvesCompany() {
        System.out.println("Director " + getFirstName() + " " + getLastName() + " is improving the taxi company "+ TaxiCompany.CompanyName + ".");
    }
    public void  isLeaving() {
        System.out.println(getFirstName() + " " + getLastName() + " is leaving taxi company " + TaxiCompany.CompanyName + " for some time.");
    }

   
}