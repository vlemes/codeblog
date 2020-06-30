package br.com.vlemes.codeblog.service.serviceImpl;

import br.com.vlemes.codeblog.model.Post;
import br.com.vlemes.codeblog.repository.CodeBlogRepository;
import br.com.vlemes.codeblog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    @Override
    public List<Post> findAll() {
        return codeBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeBlogRepository.save(post);
    }
}
