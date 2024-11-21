package org.yenicilh.questappexample.comment.entity;

import jakarta.persistence.*;
import org.yenicilh.questappexample.post.entity.Post;
import org.yenicilh.questappexample.user.entity.User;

import static org.yenicilh.questappexample.comment.constant.EntityConstants.*;

@Entity
@Table(name = COMMENTS)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = POST_ID)
    private Post post;

    @ManyToOne
    @JoinColumn(name = USER_ID )
    private User user;

    @Lob
    @Column(name = TEXT)
    private String text;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
