package com.postserver.post.Post;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.postserver.post.Database;
@Service
public class PostService {


public PostService() {
    Database.addPost(new Post("Chuck","Type 3 Diabetes","Top 10 Foods you should never eat"));
    Database.addPost(new Post("Kevin","My Diabetic Uncle","His name is Chuck and struggles with Type 3 Diabetes"));

}
public List<Post> getpost() {
    return Database.getPosts();
}
public int createPost(Post p) {
    if (p.getSender().equals("") || p.getBody().equals("") || p.getTitle().equals("")) {
        return -1;
    }
    else {
        System.out.println("Contains is running");
    if (!Database.containsPost(p)) {
        Database.addPost(p);
        return 0;
    }
    else {
        return 2;
    }
    }
}
}
