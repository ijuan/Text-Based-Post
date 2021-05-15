package com.postserver.post.Post;
import java.util.ArrayList;
public class PostService {
    private ArrayList<Post> database;

public PostService() {
    this.database = new ArrayList<Post>();
    this.database.add(new Post("Chuck","Type 3 Diabetes","Top 10 Foods you should never eat"));
    this.database.add(new Post("Kevin","My Diabetic Uncle","His name is Chuck and struggles with Type 3 Diabetes"));
}
}

