package org.yenicilh.questappexample.post.controller;


import org.springframework.web.bind.annotation.*;
import org.yenicilh.questappexample.post.dto.request.PostDtoRequest;
import org.yenicilh.questappexample.post.dto.response.PostDtoResponse;
import org.yenicilh.questappexample.post.entity.Post;
import org.yenicilh.questappexample.post.mapper.PostDtoMapper;
import org.yenicilh.questappexample.post.service.PostService;

import java.util.List;

import static org.yenicilh.questappexample.post.constant.PathConstants.USER_ID;
import static org.yenicilh.questappexample.post.constant.PathConstants.PATH_POST;

@RestController
@RequestMapping(PATH_POST)
public class PostController {

    private final PostService postService;

    private final PostDtoMapper postDtoMapper;


    public PostController(PostService postService, PostDtoMapper postDtoMapper) {
        this.postService = postService;
        this.postDtoMapper = postDtoMapper;
    }

    @PostMapping
    public PostDtoResponse save(@RequestBody PostDtoRequest request) {
        Post entity = postDtoMapper.toEntity(request);
        return postDtoMapper.toResponse(postService.save(entity));
    }

    @PutMapping(USER_ID)
    public PostDtoResponse update(@PathVariable Integer id, @RequestBody PostDtoRequest request) {
        Post entity = postDtoMapper.toEntity(request);
        return postDtoMapper.toResponse(postService.update(id, entity));
    }

    @DeleteMapping(USER_ID)
    public void delete(@PathVariable Integer id) {
        postService.delete(id);
    }

    @GetMapping(USER_ID)
    public PostDtoResponse get(@PathVariable Integer id) {
        return postDtoMapper.toResponse(postService.get(id));
    }

    @GetMapping
    public List<PostDtoResponse> getAll() {
        return postDtoMapper.toResponseList(postService.getAll());
    }

}
