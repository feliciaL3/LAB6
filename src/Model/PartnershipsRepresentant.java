package Model;

public class PartnershipsRepresentant implements AnotherWorkers {
    
    private String FirstName;
    private String LastName;

    public PartnershipsRepresentant(String FirstName, String LastName){
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
    

    
    public void colaborate() {
        System.out.println("Parnerships Representant " +FirstName + " wants to colaborate.\n");
    }
    public void helpfinances() {
        System.out.println("Partneships Representant "+FirstName + " wants to help the taxi company  with some  money for new cars.");
    
}
}