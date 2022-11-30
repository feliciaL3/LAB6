package Model;

public class HumanResourcesRepresentant implements AnotherWorkers {
   
    private String FirstName;
    private String LastName;
    private boolean response ;
    public HumanResourcesRepresentant(String FirstName, String LastName, boolean boolea){
        this.FirstName= FirstName;
        this.LastName= LastName;
        this.response= boolea; 
    }

  
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public boolean getresponse() {
        return response;
    }


    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setresponse (boolean response) {
        this.response= response;
    }

  
    public void hiring() {
        System.out.println("Human Resources Representant " +FirstName+ " is here to employ you.\n");
    }
    //@Override
    public void calls(String car, String car_type){
    }
  
}