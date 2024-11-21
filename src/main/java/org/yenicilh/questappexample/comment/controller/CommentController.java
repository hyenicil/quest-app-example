package org.yenicilh.questappexample.comment.controller;

import org.springframework.web.bind.annotation.*;
import org.yenicilh.questappexample.comment.dto.request.CommentDtoRequest;
import org.yenicilh.questappexample.comment.dto.response.CommentDtoResponse;
import org.yenicilh.questappexample.comment.entity.Comment;
import org.yenicilh.questappexample.comment.mapper.CommentDtoMapper;
import org.yenicilh.questappexample.comment.repository.CommentRepository;
import org.yenicilh.questappexample.comment.service.CommentService;
import org.yenicilh.questappexample.user.service.UserService;

import java.util.List;

import static org.yenicilh.questappexample.comment.constant.PathConstants.COMMENT_ID;
import static org.yenicilh.questappexample.comment.constant.PathConstants.COMMENT_PATH;

@RestController
@RequestMapping(COMMENT_PATH)
public class CommentController {

    private final CommentService commentService;

    private final CommentDtoMapper commentDtoMapper;
    private final UserService userService;

    public CommentController(CommentService commentService, CommentDtoMapper commentDtoMapper, UserService userService) {
        this.commentService = commentService;
        this.commentDtoMapper = commentDtoMapper;
        this.userService = userService;
    }

    @PostMapping
    public CommentDtoResponse save(@RequestBody CommentDtoRequest request) {
        Comment entity = commentDtoMapper.toEntity(request);
        return commentDtoMapper.toResponse(commentService.save(entity));
    }

    @PutMapping(COMMENT_ID)
    public CommentDtoResponse update(@PathVariable Integer id, @RequestBody CommentDtoRequest request) {
        Comment entity = commentDtoMapper.toEntity(request);
        return commentDtoMapper.toResponse(commentService.update(id, entity));
    }

    @DeleteMapping(COMMENT_ID)
    public void delete(@PathVariable Integer id) {
        commentService.delete(id);
    }

    @GetMapping(COMMENT_ID)
    public CommentDtoResponse get(@PathVariable Integer id) {
        return commentDtoMapper.toResponse(commentService.get(id));
    }

    @GetMapping
    public List<CommentDtoResponse> getAll() {
        return commentDtoMapper.toResponseList(commentService.getAll());
    }

}
