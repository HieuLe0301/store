import java.util.*;
import java.io.*;

public class Customer {
    private String username;
    private String password;
    private Boolean isAdmin = false;

    public void setUsername(String un) {
        this.username = un;
    }
    public void setPassword(String pw) {
        this.password = pw;
    }
    public void setIsAdmin(boolean b) {
        this.isAdmin = b;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public Boolean getIsAdmin(){
        return this.isAdmin;
    }

    public int register (String username_, String password_,int ud) throws Exception{
        FileOutputStream fos = new FileOutputStream("customersData.txt",true);
        String data = "Hello World!";
        if (ud==0){
            data = username_ + "," + password_;
        } else {
            data = "\n"+username_ + "," + password_;
        }
        byte[] datab = data.getBytes();
        fos.write(datab);
        fos.close();
        return -1;
    }

}
