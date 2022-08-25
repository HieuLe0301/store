import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        //Read in data from membersData.txt
        filesManager fm = new filesManager();
        ArrayList<Member> members = fm.readMembers();
        int ud = members.size();
        
        
        //initiate the i/o 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter: ");
        System.out.println("0: Exit");
        System.out.println("1: Register");
        System.out.println("2: Log in as Customer");
        System.out.println("3: Log in as Admin");
        System.out.print("Input: ");
        
        //switch on k
        int k = 0;
        /*
        * k = 0 : Login menu
        * k = 1 : Customer menu 
        * k = 2 : Admin menu
        * k = 3 : Register 
        * k = 4 : Log in as Customer
        * k = 5 : Log in as Admin
        * k = 6 : Customer menu
        * k = 7 : Admin menu
        */
        
        Customer customer = new Customer();
        // Member member = new Member();
        Admin admin = new Admin();
        
        
        int program_run = 1;
        while (program_run != 0) {
            if (k == 0) {                                                       //Login Menu
                int input = -2;
                int exit = 0;
                while (exit != 1){
                    if (!sc.hasNextInt()){
                        while (!sc.hasNextInt()){
                            System.out.println("Enter 0, 1, 2, or 3: ");
                            System.out.println("0: Exit");
                            System.out.println("1: Register");
                            System.out.println("2: Log in as Customer");
                            System.out.println("3: Log in as Admin");
                            System.out.print("Input: ");
                            sc.nextLine();
                        }
                    } else {
                        input = sc.nextInt();
                        if (input != 0 && input != 1 && input != 2 && input != 3){
                            System.out.println("Enter 0, 1, 2, or 3: ");
                            System.out.println("0: Exit");
                            System.out.println("1: Register");
                            System.out.println("2: Log in as Customer");
                            System.out.println("3: Log in as Admin");
                            System.out.print("Input: ");
                            sc.nextLine();
                        } else if (input==0) {
                            System.out.println("System exiting");
                            System.exit(1);
                        } else if (input == 1) {
                            k = 3;
                            exit = 1;
                        } else if (input==2) {
                            k = 4;
                            exit = 1;
                        } else {
                            k = 5;
                            exit = 1;
                        }
                    }
                }
            } else if (k==3) {
                sc.nextLine();
                System.out.println("Enter your username: ");
                String username = sc.nextLine();
                System.out.println("Enter your password: ");
                String password = sc.nextLine();

                customer.register(username, password, ud);
                program_run = 0;   
            }
            // } else if (k==4 && members.size() == 1){
            //     for (int i=0; i < members.size(); i++){
            //         System.out.println(members.get(i).getUsername());
            //         System.out.println(members.get(i).getPassword());
            //     }
            // } else if (k==4 && members.size() ==0){
            //     System.out.println("There is no user in database. Please log in: ");
            //     k = 3;
            // } else if (k==5){
            //     int exit = 0;
            //     int ct = 0;
            //     sc.nextLine();

            //     while (exit != 1) {
            //         System.out.println("Enter Admin username: ");
            //         String aUsername = sc.nextLine();
            //         System.out.println("Enter Admin password: ");
            //         String aPassword = sc.nextLine();
            //         if (!aUsername.equals(admin.getUsername()) || !aPassword.equals(admin.getPassword())){
            //             System.out.println("Wrong username or password!!");
            //             if (ct<3){
            //                 System.out.println("You have "+(ct+1)+" chances left to log in ");
            //                 ct += 1;
            //             } else {
            //                 System.out.println("System exiting for too many failed attempts to log in as Admin");
            //                 System.exit(1);
            //             }
            //         } else {
            //             System.out.println("Welcome Admin!");
            //             k = 7;
            //             exit = 1;
            //         }
            //     }
            // } else if (k==6){
            //     int i = -2;
            //     int exit = 0;
            //     while (exit != 1){
            //         if(!sc.hasNextInt()){
                        
            //         } else {
            //             i = sc.nextInt();
            //             if (i!= 0 && i!= 1 && i!= 2){

            //             } else {
            //                 switch (i){
            //                     case 0: k = 0;
            //                     case 1: k = 6;
            //                     case 2: k = 7;
            //                 }
            //                 exit = 1;
            //             }
            //         }
            //     }
            // } else if (k==7){
            //     System.out.println("This is the Admin Menu: ");
            //     program_run = 0;
            // }
        }
        
        //closing i/o
    }
}