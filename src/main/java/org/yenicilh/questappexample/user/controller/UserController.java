package org.yenicilh.questappexample.user.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yenicilh.questappexample.user.dto.request.UserDtoRequest;
import org.yenicilh.questappexample.user.dto.response.UserDtoResponse;
import org.yenicilh.questappexample.user.mapper.UserDtoMapper;
import org.yenicilh.questappexample.user.service.UserService;

import static org.yenicilh.questappexample.user.constant.PathConstants.PATH_USER;

@RestController
@RequestMapping(PATH_USER)
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserDtoMapper userDtoMapper;

    public UserDtoResponse save(@RequestBody UserDtoRequest request) {

    }

}
