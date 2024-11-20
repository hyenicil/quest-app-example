package org.yenicilh.questappexample.user.mapper;

import org.yenicilh.questappexample.user.dto.request.UserDtoRequest;
import org.yenicilh.questappexample.user.dto.response.UserDtoResponse;
import org.yenicilh.questappexample.user.entity.User;


public interface UserDtoMapper {

    User toEntity(UserDtoRequest request);

    UserDtoResponse toResponse(User entity);
}
