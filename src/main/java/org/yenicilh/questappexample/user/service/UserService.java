package org.yenicilh.questappexample.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.yenicilh.questappexample.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


}
