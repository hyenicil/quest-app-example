package org.yenicilh.questappexample.post.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yenicilh.questappexample.post.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
