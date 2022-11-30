package Model;

public class Accountant implements FinancialEmployee {
   
    private String FirstName;
    private String LastName;
    private String role; 
    
    public Accountant (String FirstName, String LastName, String role){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.role= role; 
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


    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
     public void calculates() {
        System.out.println("The accountant " + FirstName + " " + LastName + " calculates salary \n");
    } 
//@Override
    public void counts() {
        if (getRole() == "SalaryAwards") {
            System.out.println("The accountant " + getFirstName() + " " + getLastName() + " sets the sum of the award, depending on the work and reviews.\n");
        }
        if (getRole() == "Salary") {
            System.out.println("The accountant " +getFirstName() + " " + getLastName() + " sets the salary of employees.\n");
        }
    }
    public void isready(){
        if (getRole() == "SalaryAwards") {
            System.out.println("The accountant " +getFirstName() + " " + getLastName() + " is ready to distribute all the salaries  awards for the best drivers\n");
        }
        if (getRole() == "Salary") {
            System.out.println("The accountant " +getFirstName() + " " + getLastName() + " is ready to distribute salaries to each driver\n");
        }
    }
    @Override
    public void supports() {
    }

    @Override
    public void supports(String platform) {
        
        
    }

}