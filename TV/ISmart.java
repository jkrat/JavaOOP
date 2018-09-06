import java.util.ArrayList;
public interface ISmart {
    void browse(String site);
    void spy(ArrayList<String> history);
    void connect(String SSID, String password); 
}