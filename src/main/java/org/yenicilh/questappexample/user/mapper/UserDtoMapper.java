package org.yenicilh.questappexample.user.mapper;

import org.mapstruct.Mapper;
import org.yenicilh.questappexample.user.dto.request.UserDtoRequest;
import org.yenicilh.questappexample.user.dto.response.UserDtoResponse;
import org.yenicilh.questappexample.user.entity.User;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING, uses = {UserDtoMapper.class}, injectionStrategy = CONSTRUCTOR)
public interface UserDtoMapper {

    User toEntity(UserDtoRequest request);

    UserDtoResponse toResponse(User entity);

    List<UserDtoResponse> toResponseList(List<User> userList);
}
