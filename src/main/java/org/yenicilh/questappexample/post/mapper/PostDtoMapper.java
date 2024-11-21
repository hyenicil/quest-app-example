package org.yenicilh.questappexample.post.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.yenicilh.questappexample.post.dto.request.PostDtoRequest;
import org.yenicilh.questappexample.post.dto.response.PostDtoResponse;
import org.yenicilh.questappexample.post.entity.Post;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.yenicilh.questappexample.post.constant.MapperConstants.USER;

@Mapper(componentModel = SPRING, uses = {PostDtoMapper.class}, injectionStrategy = CONSTRUCTOR)
public interface PostDtoMapper {

    @Mapping(source = USER, target = USER)
    Post toEntity(PostDtoRequest request);

    @Mapping(source = USER, target = USER)
    PostDtoResponse toResponse(Post entity);

    List<PostDtoResponse> toResponseList(List<Post> entities);
}
