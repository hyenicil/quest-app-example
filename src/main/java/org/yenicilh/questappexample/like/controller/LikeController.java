package org.yenicilh.questappexample.like.controller;


import com.oracle.svm.core.annotate.Delete;
import org.springframework.web.bind.annotation.*;
import org.yenicilh.questappexample.like.dto.request.LikeDtoRequest;
import org.yenicilh.questappexample.like.dto.response.LikeDtoResponse;
import org.yenicilh.questappexample.like.entity.Like;
import org.yenicilh.questappexample.like.mapper.LikeDtoMapper;
import org.yenicilh.questappexample.like.service.LikeService;

import java.util.List;

import static org.yenicilh.questappexample.like.constant.PathConstants.LIKE_ID;
import static org.yenicilh.questappexample.like.constant.PathConstants.LIKE_PATH;

@RestController
@RequestMapping(LIKE_PATH)
public class LikeController {

    private final LikeService likeService;

    private final LikeDtoMapper likeDtoMapper;

    public LikeController(LikeService likeService, LikeDtoMapper likeDtoMapper) {
        this.likeService = likeService;
        this.likeDtoMapper = likeDtoMapper;
    }

    @PostMapping
    public LikeDtoResponse save(@RequestBody LikeDtoRequest request){
        Like entity = likeDtoMapper.toEntity(request);
        return likeDtoMapper.toResponse(likeService.save(entity));
    }

    @PutMapping(LIKE_ID)
    public LikeDtoResponse update(@PathVariable Integer id, @RequestBody LikeDtoRequest request){
        Like entity = likeDtoMapper.toEntity(request);
        return likeDtoMapper.toResponse(likeService.update(id, entity));
    }

    @DeleteMapping(LIKE_ID)
    public void delete(@PathVariable Integer id){
        likeService.delete(id);
    }


    @GetMapping(LIKE_ID)
    public LikeDtoResponse get(@PathVariable Integer id){
        return likeDtoMapper.toResponse(likeService.get(id));
    }

    @GetMapping
    public List<LikeDtoResponse> getAll(){
        return likeDtoMapper.toResponseList(likeService.getAll());
    }

}
