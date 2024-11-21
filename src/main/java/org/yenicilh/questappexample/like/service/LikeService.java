package org.yenicilh.questappexample.like.service;

import org.springframework.stereotype.Service;
import org.yenicilh.questappexample.like.entity.Like;
import org.yenicilh.questappexample.like.repository.LikeRepository;

import java.util.List;

@Service
public class LikeService {

    private final LikeRepository likeRepository;

    public LikeService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public Like save(Like entity) {
        return likeRepository.save(entity);
    }

    public Like update(Integer id, Like entity) {
        Like tempEntity = get(id);
        entity.setId(tempEntity.getId());
        return save(entity);
    }

    public void delete(Integer id) {
        likeRepository.deleteById(id);
    }

    public Like get(Integer id) {
        return likeRepository.findById(id).orElse(null);
    }

    public List<Like> getAll() {
        return likeRepository.findAll();
    }
}
