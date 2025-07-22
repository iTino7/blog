package tinoborrelli.blog.services;


import org.springframework.stereotype.Service;
import tinoborrelli.blog.entities.Blog;
import tinoborrelli.blog.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public Blog addBlog(Blog blog) {
        blog.setId(new Random().nextInt(1000));
        blog.setCover("https://picsum.photos/200/300");
        blogs.add(blog);
        return blog;
    }

    public Blog getBlog(int id) {
        Blog found = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) found = blog;
        }
        if (found == null) throw new NotFoundException(id);
        return found;
    }

    public Blog updateBlog(int id, Blog blogPost) {
        Blog blog = getBlog(id);
        blog.setTitle(blogPost.getTitle());
        blog.setCategory(blogPost.getCategory());
        blog.setContent(blog.getContent());
        blog.setCover(blogPost.getCover());
        return blog;
    }

    public void deleteBlog(int id) {
        Blog found = null;
        for (Blog blog : this.blogs) {
            if (blog.getId() == id) found = blog;
        }
        if (found == null) throw new NotFoundException(id);
        this.blogs.remove(found);
    }
}
