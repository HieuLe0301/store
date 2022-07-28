import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter: ");
        System.out.println("0: Exit");
        System.out.println("1: Register");
        System.out.println("2: Log in");
        System.out.print("Input: ");

        Scanner sc = new Scanner(System.in);
        
        int i = -2;
        int k = 0;
        /*
         * k = 0 : Login menu
         * k = 1 : Customer menu 
         * k = 2 : Admin menu
         * k = 3 : Register
         * k = 4 : Log in
         * k = 5 : 
         */
        
        int program_run = 1;
        
        
        while (program_run != 0) {
            if (k == 0) {                                                       //Login Menu
                int exit = 0;
                while (exit != 1){
                    if (!sc.hasNextInt()){
                        while (!sc.hasNextInt()){
                            System.out.println("Enter 0, 1, or 2: ");
                            System.out.println("0: Exit");
                            System.out.println("1: Register");
                            System.out.println("2: Log in");
                            System.out.print("Input: ");
                            sc.nextLine();
                        }
                    } else {
                        i = sc.nextInt();
                        if (i != 1 && i != 2 && i != 0){
                            System.out.println("Enter 0, 1, or 2: ");
                            System.out.println("0: Exit");
                            System.out.println("1: Register");
                            System.out.println("2: Log in");
                            System.out.print("Input: ");
                            sc.nextLine();
                        } else if (i==0) {
                            System.out.println("System exiting");
                            System.exit(1);
                        } else if (i == 1) {
                            k = 3;
                            exit = 1;
                        } else {
                            k = 4;
                            exit = 1;
                            program_run = 0;
                        }
                    }
                }
            } else if (k==3) {                                                  // Register
                try {
                    FileOutputStream fos = new FileOutputStream("usersData.txt",true);
                    System.out.println("Enter your username: ");
                    sc.nextLine();
                    String username = sc.nextLine();
                    System.out.println("Enter your password: ");
                    String password = sc.nextLine();
                    String data = "Hello World!";
                    BufferedReader br = new BufferedReader(new FileReader("usersData.txt"));
                    if (br.readLine() != null){
                        data = "\n"+username + "," + password;
                    } else {
                        data = username + "," + password;
                    }
                    br.close(); 
                    byte[] datab = data.getBytes();
                    fos.write(datab);
                    fos.close();
                    k = -1;
                    program_run = 0;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }




        }
        

        
        







        sc.close();
    }
}