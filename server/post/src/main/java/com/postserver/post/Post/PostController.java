package com.postserver.post.Post;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.postserver.post.Post.PostService;
@RestController
@RequestMapping("api/post")
public class PostController {
	private final PostService ps;
	@Autowired
	public PostController(PostService postservice) {
		this.ps = postservice;
	}
    @GetMapping
	public List<Post> toople() {
		return this.ps.getpost();
		
	}
}
