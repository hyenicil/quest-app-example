package org.yenicilh.questappexample.post.entity;

import jakarta.persistence.*;
import org.yenicilh.questappexample.user.entity.User;

import static org.yenicilh.questappexample.post.constant.EntityConstants.BLOGS;
import static org.yenicilh.questappexample.post.constant.EntityConstants.*;


@Entity
@Table(name = BLOGS)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = USER_ID)
    //@OnDelete(action = OnDeleteAction.CASCADE) Bir use rdilindiginde sende bunlari sil demek/
    private User user;

    @Column(name = TITLE)
    private String title;

    @Lob
    @Column(name = TEXT)
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
