import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
public class Main {
public static void main(String[] args) {
 sendpost("DaVinci","im davinci!!","Im sad");
} 
public static void sendpost(String s, String b, String t) {
    try {
        URL url = new URL("http://127.0.0.1:8080/api/post");
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type","application/json; charset=UTF-8");
        byte[]json = ("{\"sender\":\""+s+"\",\"title\":\""+t+"\",\"body\":\""+b+"\"}").getBytes(StandardCharsets.UTF_8);
        int length = json.length;
        con.setFixedLengthStreamingMode(length);
        //con.connect();
        con.setDoOutput(true);
        OutputStream out = con.getOutputStream();
        out.write(json);
        BufferedReader decoder = new BufferedReader(
                new InputStreamReader(con.getInputStream())
            );
            System.out.println(decoder.readLine());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
    catch(Exception e) {
        System.out.println(e);
    }

  }

public static ArrayList<Post> getPosts() {
    try{

        ArrayList<String> q = new ArrayList<String>();
        
            URL url = new URL("http://127.0.0.1:8080/api/post");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader decoder = new BufferedReader(
                new InputStreamReader(con.getInputStream())
            );
            String potpie = decoder.readLine();
            while(potpie!= null){
                System.out.println(potpie);
                while (potpie.indexOf("{")!= -1) {
                    int open = potpie.indexOf("{");
                    int close = potpie.indexOf("}");
                    q.add(potpie.substring(open+1,close ));
                    System.out.println(potpie.substring(open,close +1));
                    potpie = potpie.substring(close +1);
                }
                potpie = decoder.readLine();
          }
          ArrayList<Post> postlist = new ArrayList<Post>();
          for (int i = 0;i < q.size();i++) {
            Post newpost = new Post();
            String[] moo = q.get(i).split(",");
             for (int u = 0;u < moo.length;u++) {
                if(moo[u].split(":")[0].contains("sender")) {
                    newpost.setSender(moo[u].split(":")[1]);
                }
                else if(moo[u].split(":")[0].contains("title")) {
                    newpost.setTitle(moo[u].split(":")[1]);
                }
                else if(moo[u].split(":")[0].contains("body")) {
                    newpost.setBody(moo[u].split(":")[1]);
                }
             }
             postlist.add(newpost);
            
          }
        return postlist;
        }catch(IOException e){
    System.out.println(e);
        }catch(Exception e){
        System.out.println(e);
        }
        return null;
    


}
}
