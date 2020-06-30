package br.com.vlemes.codeblog.service;

import br.com.vlemes.codeblog.model.Post;

import java.util.List;

public interface CodeBlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
