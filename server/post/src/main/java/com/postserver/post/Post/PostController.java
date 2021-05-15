package com.postserver.post.Post;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("api/post")
public class PostController {
    @GetMapping
	public List<String> toople() {
		Post post = new Post("Hacker", "URGENT MESSAGE","Warning! A virus has entered your computer...");
		return List.of(post.toString());
	}
}
