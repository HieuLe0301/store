public class Admin extends Member{
    private String username = "Admin";
    private String password = "Supr3m3admin";
    private Boolean isAdmin = true;

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}
