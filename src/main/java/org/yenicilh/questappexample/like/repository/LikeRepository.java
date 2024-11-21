package org.yenicilh.questappexample.like.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yenicilh.questappexample.like.entity.Like;

public interface LikeRepository extends JpaRepository<Like, Integer> {
}
