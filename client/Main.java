import java.net.HttpURLConnection;
import java.net.URL;
public class Main {
public static void main(String[] args) {
    URL url = new URL("http://127.0.0.1:8080/api/host")
    HttpURLConnection con = (HttpURLConnection)url.openconnection();
    con.setRequestMethod("GET");
}    
}
