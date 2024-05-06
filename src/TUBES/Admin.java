package TUBES;
public class Admin extends User {
    public Admin (String userID, String userName){
        super(userID, userName, "admin");
    }
    
    public void addTask(Task){
        
    }
    
    public void deleteTask(Task){
        
    }
    
    public void addActivity(ToDo){
        
    }
    
    public void deleteAct(ToDo){
        
    }
    
    public void printInfo(){
        super.printInfo();
        System.out.println("Role: Admin");
    }
    
    public void progresUpdate(String){
        
    }
    
}