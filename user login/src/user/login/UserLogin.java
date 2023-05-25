package user.login;

import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
  
//takes username and password from use
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your user name: ");
        String username = scan.next();
        System.out.print("Please enter your password: ");
        String password = scan.next();
//if username and password are correct the user is logged in.
        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("you are logged in.");
//If they are incorrect user can reset the password            
        } else {
            System.out.println("your information is incorrect.");
            System.out.println("do you want to reset your password: \n1-yes \n2-no");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.print("enter your new password: ");
                String newPassword = scan.next();
                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Could not create password ,please enter another password");
                } else {
                    System.out.println("create password successfully");
                    password = newPassword;
                }
            }

        }

    }

}
