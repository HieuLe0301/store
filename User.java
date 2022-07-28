public class User {
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
}
