package org.yenicilh.questappexample.user.service;

import org.springframework.stereotype.Service;
import org.yenicilh.questappexample.user.entity.User;
import org.yenicilh.questappexample.user.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User save(User entity) {
        return userRepository.save(entity);
    }

    public User update(Integer id, User entity) {
        User tempEntity = get(id);
        entity.setId(tempEntity.getId());
        return save(entity);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public User get(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
