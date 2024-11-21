package org.yenicilh.questappexample.like.mapper;

import org.mapstruct.Mapper;
import org.yenicilh.questappexample.like.dto.request.LikeDtoRequest;
import org.yenicilh.questappexample.like.dto.response.LikeDtoResponse;
import org.yenicilh.questappexample.like.entity.Like;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING, uses = {LikeDtoMapper.class}, injectionStrategy = CONSTRUCTOR)
public interface LikeDtoMapper {

    Like toEntity (LikeDtoRequest request);

    LikeDtoResponse toResponse (Like entity);

    List<LikeDtoResponse> toResponseList(List<Like> entities);
}
