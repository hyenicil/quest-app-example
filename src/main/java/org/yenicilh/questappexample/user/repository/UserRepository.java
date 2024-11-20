package org.yenicilh.questappexample.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yenicilh.questappexample.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
