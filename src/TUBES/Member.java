package TUBES;

public class Member extends User{
    
    public Member(String userID, String userName){
        super(userID, userName, "member");
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Role: Member");    
    }
    
    public void settChecklistOn(){
        
    }
    
    public void settChecklistOff(){
        
    }
}
