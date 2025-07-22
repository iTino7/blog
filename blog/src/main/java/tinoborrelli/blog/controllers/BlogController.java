package tinoborrelli.blog.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {

    @GetMapping
    public String getExample() {
        return "ciao";
    }
}
