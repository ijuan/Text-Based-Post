

public class Post {
private String sender;
private String title;
private String body;
public Post() {

}
public Post(String s, String t, String b) {
this.sender = s;
this.title = t;
this.body = b;
}
public String getBody() {
    return body;
}
public String getSender() {
    return sender;
}
public String getTitle() {
    return title;
}
public void setBody(String body) {
    this.body = body;
}
public void setSender(String sender) {
    this.sender = sender;
}
public void setTitle(String title) {
    this.title = title;
}
@Override
public String toString() {
return "Title: " + this.title + "\n" +
"Body:" + this.body + "\n" +
"Sent by:" + this.sender + "\n";


}

}
