package org.yenicilh.questappexample.user.controller;


import com.oracle.svm.core.annotate.Delete;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.yenicilh.questappexample.user.dto.request.UserDtoRequest;
import org.yenicilh.questappexample.user.dto.response.UserDtoResponse;
import org.yenicilh.questappexample.user.entity.User;
import org.yenicilh.questappexample.user.mapper.UserDtoMapper;
import org.yenicilh.questappexample.user.service.UserService;

import java.util.List;

import static org.yenicilh.questappexample.user.constant.PathConstants.PATH_USER;
import static org.yenicilh.questappexample.user.constant.PathConstants.USER_ID;

@RestController
@RequestMapping(PATH_USER)
public class UserController {

    private final UserService userService;

    private final UserDtoMapper userDtoMapper;

    public UserController(UserService userService, UserDtoMapper userDtoMapper) {
        this.userService = userService;
        this.userDtoMapper = userDtoMapper;
    }

    @PostMapping
    public UserDtoResponse save(@RequestBody UserDtoRequest request) {

        User entity = userDtoMapper.toEntity(request);
        return userDtoMapper.toResponse(userService.save(entity));
    }
    @PutMapping(USER_ID)
    public UserDtoResponse update(@PathVariable Integer id, @RequestBody UserDtoRequest request) {
        User entity = userDtoMapper.toEntity(request);
        return userDtoMapper.toResponse(userService.update(id, entity));
    }

    @DeleteMapping(USER_ID)
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }

    @GetMapping(USER_ID)
    public UserDtoResponse get(@PathVariable Integer id) {
        return userDtoMapper.toResponse(userService.get(id));
    }

    @GetMapping
    public List<UserDtoResponse> getAll() {
        return userDtoMapper.toResponseList(userService.getAll());
    }



}
