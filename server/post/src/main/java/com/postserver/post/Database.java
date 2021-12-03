package com.postserver.post;
import com.postserver.post.Account.Account;
import java.util.ArrayList;
import com.postserver.post.Post.Post;


public class Database {
    private static ArrayList<Account> accounts = new ArrayList<Account>();
    private static ArrayList<Post> posts = new ArrayList<Post>();
    public static ArrayList<Account> getAccounts() {
        return accounts;
    }
    public static ArrayList<Post> getPosts() {
        return posts;
    }
    public static void addAccount(Account won) {
        accounts.add(won);
    }
    public static void addPost(Post poop) {
        posts.add(poop);
    }
    public static boolean containsPost(Post con) {
        return posts.contains(con);
    }
}

