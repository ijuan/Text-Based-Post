package com.postserver.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import com.postserver.post.Post.Post;
@SpringBootApplication 
@RestController
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
		
	}
	@GetMapping
	public List<String> toople() {
		Post post = new Post("Hacker", "URGENT MESSAGE","Warning! A virus has entered your computer...");
		return List.of(post.toString());
	}
}
