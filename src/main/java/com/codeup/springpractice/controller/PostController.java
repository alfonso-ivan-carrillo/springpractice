package com.codeup.springpractice.controller;

import com.codeup.springpractice.Post;
import com.codeup.springpractice.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao){
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String index(Model model){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(2, "title2", "body2"));
        posts.add(new Post(3, "title3", "body3"));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable long id, Model model){
//        model.addAttribute("singlePost", postDao.getById(id) );
        Post singlePost = new Post(1, "new", "test");
        model.addAttribute("singlePost", singlePost);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "<h1>View the form for creating a post</h1>";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreate(){
        return "<h1>Create a new post</h1>";
    }

}
