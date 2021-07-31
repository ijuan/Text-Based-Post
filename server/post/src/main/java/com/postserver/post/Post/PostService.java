package com.postserver.post.Post;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class PostService {
    private List<Post> database;

public PostService() {
    this.database = new ArrayList<Post>();
    this.database.add(new Post("Chuck","Type 3 Diabetes","Top 10 Foods you should never eat"));
    this.database.add(new Post("Kevin","My Diabetic Uncle","His name is Chuck and struggles with Type 3 Diabetes"));

}
public List<Post> getpost() {
    return this.database;
}
public int createPost(Post p) {
    if (p.getSender().equals("") || p.getBody().equals("") || p.getTitle().equals("")) {
        return -1;
    }
    else {
        System.out.println("Contains is running");
    if (!database.contains(p)) {
        database.add(p);
        return 0;
    }
    else {
        return 2;
    }
    }
}
}
