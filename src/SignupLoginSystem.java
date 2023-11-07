import java.util.Scanner;

public class SignupLoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        //Sign Up
        while(true){
            System.out.println("Sign Up");
            System.out.println("Enter username:");
            username = input.nextLine();
            System.out.println("Enter password (should have at least 8 character and @ included):");
            password = input.nextLine();
            if(password.length()>=8 && password.contains("@")){
                System.out.println("Created");
                break;
            }
            else{
                System.out.println("Password doesn't meet criteria. Please try again");
            }
        }

        String input_username, input_password;
        //Login
        System.out.println("Login");
        while(true){
            System.out.println("Enter username:");
            input_username = input.nextLine();
            if(input_username.equals(username)){
                break;
            }
            else{
                System.out.println("Incorrect Username");
            }
        }
        while(true){
            System.out.println("Enter password:");
            input_password = input.nextLine();
            if(input_password.equals(password)){
                System.out.println("Logged in.");
                break;
            }
            else{
                System.out.println("Incorrect Password");
            }
        }
    }
}
