package br.com.vlemes.codeblog.utils;

import br.com.vlemes.codeblog.model.Post;
import br.com.vlemes.codeblog.repository.CodeBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeBlogRepository codeBlogRepository;

    //@PostConstruct
    public void savePosts() {

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAuthor("Vinícius Lemes");
        post1.setDate(LocalDate.now());
        post1.setTitle("Docker");
        post1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nibh sed pulvinar proin gravida hendrerit. At lectus urna duis convallis convallis tellus id. Maecenas ultricies mi eget mauris pharetra et. Mauris rhoncus aenean vel elit scelerisque. Scelerisque fermentum dui faucibus in ornare quam viverra orci sagittis. Sed elementum tempus egestas sed sed risus pretium. Non blandit massa enim nec dui nunc mattis. Habitant morbi tristique senectus et netus et. Vel pretium lectus quam id leo. Velit egestas dui id ornare arcu. Placerat duis ultricies lacus sed turpis tincidunt id aliquet. Enim facilisis gravida neque convallis. Eu ultrices vitae auctor eu augue ut lectus arcu. Mattis nunc sed blandit libero volutpat sed. Enim ut tellus elementum sagittis vitae. At consectetur lorem donec massa sapien faucibus et molestie ac. Quis lectus nulla at volutpat.");

        Post post2 = new Post();
        post2.setAuthor("Vinícius Lemes");
        post2.setDate(LocalDate.now());
        post2.setTitle("API Rest");
        post2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nibh sed pulvinar proin gravida hendrerit. At lectus urna duis convallis convallis tellus id. Maecenas ultricies mi eget mauris pharetra et. Mauris rhoncus aenean vel elit scelerisque. Scelerisque fermentum dui faucibus in ornare quam viverra orci sagittis. Sed elementum tempus egestas sed sed risus pretium. Non blandit massa enim nec dui nunc mattis. Habitant morbi tristique senectus et netus et. Vel pretium lectus quam id leo. Velit egestas dui id ornare arcu. Placerat duis ultricies lacus sed turpis tincidunt id aliquet. Enim facilisis gravida neque convallis. Eu ultrices vitae auctor eu augue ut lectus arcu. Mattis nunc sed blandit libero volutpat sed. Enim ut tellus elementum sagittis vitae. At consectetur lorem donec massa sapien faucibus et molestie ac. Quis lectus nulla at volutpat.");

        Post post3 = new Post();
        post3.setAuthor("Vinícius Lemes");
        post3.setDate(LocalDate.now());
        post3.setTitle("NodeJS + Express CRUD");
        post3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nibh sed pulvinar proin gravida hendrerit. At lectus urna duis convallis convallis tellus id. Maecenas ultricies mi eget mauris pharetra et. Mauris rhoncus aenean vel elit scelerisque. Scelerisque fermentum dui faucibus in ornare quam viverra orci sagittis. Sed elementum tempus egestas sed sed risus pretium. Non blandit massa enim nec dui nunc mattis. Habitant morbi tristique senectus et netus et. Vel pretium lectus quam id leo. Velit egestas dui id ornare arcu. Placerat duis ultricies lacus sed turpis tincidunt id aliquet. Enim facilisis gravida neque convallis. Eu ultrices vitae auctor eu augue ut lectus arcu. Mattis nunc sed blandit libero volutpat sed. Enim ut tellus elementum sagittis vitae. At consectetur lorem donec massa sapien faucibus et molestie ac. Quis lectus nulla at volutpat.");

        postList.add(post1);
        postList.add(post2);
        postList.add(post3);

        for (Post post : postList) {
            Post postSaved = codeBlogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
