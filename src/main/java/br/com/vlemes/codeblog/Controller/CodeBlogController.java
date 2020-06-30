package br.com.vlemes.codeblog.Controller;

import br.com.vlemes.codeblog.model.Post;
import br.com.vlemes.codeblog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeBlogController {

    @Autowired
    CodeBlogService codeBlogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView modelAndView = new ModelAndView("posts");
        List<Post> postList = codeBlogService.findAll();
        modelAndView.addObject("posts", postList);
        return modelAndView;
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public ModelAndView getPostById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView("postDetails");
        Post post = codeBlogService.findById(id);
        modelAndView.addObject("post", post);
        return modelAndView;
    }
}
