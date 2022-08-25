import java.util.*;
import java.io.*;

public class filesManager {
    public ArrayList<Member> readMembers() throws Exception{
        String line;
        ArrayList<Member> members = new ArrayList<>();
        Member m = new Member();
        BufferedReader br = new BufferedReader(new FileReader("customersData.txt"));
        while ((line = br.readLine()) != null) {
            m.setUsername(line.split(",")[0]);  
            m.setPassword(line.split(",")[1]);  
            members.add(m);
        }
        br.close();
        return members;
    }
}
