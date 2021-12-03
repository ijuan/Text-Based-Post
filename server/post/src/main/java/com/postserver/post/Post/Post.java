package com.postserver.post.Post;

public class Post {
private String sender;
private String title;
private String body;
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
@Override
public boolean equals(Object o) {
    System.out.println("Checking if Equal");
    boolean isEqual = false;
    if (o != null && o instanceof Post) {
        System.out.println(((Post)o).title);
        if (this.title.equals( ((Post)o).title) && this.body.equals( ((Post)o).body) && this.sender.equals( ((Post)o).sender)) {
            isEqual = true;
         }
    }
    return isEqual;
}
    
}
