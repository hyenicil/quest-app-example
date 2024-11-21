package org.yenicilh.questappexample.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yenicilh.questappexample.comment.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
