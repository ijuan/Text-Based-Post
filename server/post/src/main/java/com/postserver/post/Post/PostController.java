package com.postserver.post.Post;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import com.postserver.post.Post.PostService;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> savepost(@RequestBody Post p) {
		switch (this.ps.createPost(p)) {
		case 0:	
			return new ResponseEntity<String>("Congrats! Your Post Was Successful",HttpStatus.CREATED);
		case -1:
			return new ResponseEntity<String>("Uh Oh! Not All The Fields Were Entered!",HttpStatus.EXPECTATION_FAILED);
		case 2:
			return new ResponseEntity<String>("Uh Oh! There Was A Duplicate Entry!",HttpStatus.CONFLICT);
		default:
			return new ResponseEntity<String>("Uh Oh! Something Went Wrong!",HttpStatus.BAD_REQUEST);
		}
	}
		
		
	
}
