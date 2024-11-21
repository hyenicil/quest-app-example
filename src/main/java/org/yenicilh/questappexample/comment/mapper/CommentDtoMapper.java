package org.yenicilh.questappexample.comment.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.yenicilh.questappexample.comment.dto.request.CommentDtoRequest;
import org.yenicilh.questappexample.comment.dto.response.CommentDtoResponse;
import org.yenicilh.questappexample.comment.entity.Comment;
import org.yenicilh.questappexample.post.entity.Post;
import org.yenicilh.questappexample.post.mapper.PostDtoMapper;
import org.yenicilh.questappexample.user.mapper.UserDtoMapper;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.yenicilh.questappexample.comment.constant.MapperConstants.POST;
import static org.yenicilh.questappexample.comment.constant.MapperConstants.USER;

@Mapper(componentModel = SPRING, uses = {CommentDtoMapper.class, PostDtoMapper.class, UserDtoMapper.class},injectionStrategy = CONSTRUCTOR)
public interface CommentDtoMapper {

    @Mapping(source = POST, target = POST)
    @Mapping(source = USER, target = USER)
    Comment toEntity(CommentDtoRequest request);

    @Mapping(source = POST, target = POST)
    @Mapping(source = USER, target = USER)
    CommentDtoResponse toResponse(Comment entity);

    List<CommentDtoResponse> toResponseList(List<Comment> entities);

}
