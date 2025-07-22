package tinoborrelli.blog.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tinoborrelli.blog.entities.Blog;
import tinoborrelli.blog.services.BlogPostService;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogController {
    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<Blog> getExample() {
        return this.blogPostService.getBlogs();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog addBlogPost(@RequestBody Blog blog) {
        return this.blogPostService.addBlog(blog);
    }

    @GetMapping("/{id}")
    public Blog updateBlogPost(@PathVariable("id") int id, @RequestBody Blog blog) {
        return this.blogPostService.updateBlog(id, blog);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBlog(@PathVariable("id") int id) {
        this.blogPostService.deleteBlog(id);
    }

}
