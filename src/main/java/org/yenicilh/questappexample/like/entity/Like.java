package org.yenicilh.questappexample.like.entity;


import jakarta.persistence.*;
import org.yenicilh.questappexample.post.entity.Post;
import org.yenicilh.questappexample.user.entity.User;

import static org.yenicilh.questappexample.like.constant.EntityConstants.*;

@Entity
@Table(name = LIKES)
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = POST_ID)
    private Post post;

    @ManyToOne
    @JoinColumn(name = USER_ID)
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
