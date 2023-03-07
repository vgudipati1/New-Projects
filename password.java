/*Phase 1 of program that crosschecks inputed passwords with "database" of files using method calls, decision making statements, and loops.
*/



import java.util.Scanner;
public class password { 
    //makeshift password database
    static String[] passwordDatabase =
    {"Sailaja1970", "Algernon2003!", 
    "Algernon624!", "Sailaja1970!"};
    
    
    public static void main(String []args){
        Scanner username = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        System.out.println("Please enter Username:");
        //phase 1 don't worry about checking username and if they point to a password
        String userName = username.nextLine();
        System.out.println("Username you entered is: " + userName);
        
        
        System.out.println("Please enter Password:");
        String passWord = password.nextLine();

        if(passwordAccepted(passWord)== true){
            System.out.println("Password is accepted  \n Access Granted!");
        } else{
            System.out.println("Incorrect password \n Access denied!");
        }
        
        
        
        
        //close resourse leaks
        username.close(); 
        password.close();

    } 
        
    //Method to check if password is one of the acceptable passwords in our database
    static boolean passwordAccepted(String passWord){
        boolean isAccepted = false;
        for (int i = 0; i < 4 ; i++){
        if(passWord.equals(passwordDatabase[i])){
            isAccepted = true;
        }
        
        }
        //return isAccepted;
        return isAccepted; 
    }
    

}
