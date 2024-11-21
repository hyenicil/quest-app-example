package org.yenicilh.questappexample.comment.service;

import org.springframework.stereotype.Service;
import org.yenicilh.questappexample.comment.entity.Comment;
import org.yenicilh.questappexample.comment.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment save(Comment entity) {
        return commentRepository.save(entity);
    }

    public Comment update(Integer id, Comment entity) {
        Comment tempEntity = get(id);
        entity.setId(tempEntity.getId());
        return commentRepository.save(entity);
    }

    public void delete(Integer id) {
        commentRepository.deleteById(id);
    }

    public Comment get(Integer id) {
        return commentRepository.findById(id).orElse(null);
    }

    public List<Comment> getAll() {
        return commentRepository.findAll();
    }
}
