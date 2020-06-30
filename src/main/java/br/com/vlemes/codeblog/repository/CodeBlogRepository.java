package br.com.vlemes.codeblog.repository;

import br.com.vlemes.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
