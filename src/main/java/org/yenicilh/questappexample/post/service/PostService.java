package org.yenicilh.questappexample.post.service;


import org.springframework.stereotype.Service;
import org.yenicilh.questappexample.post.entity.Post;
import org.yenicilh.questappexample.post.repository.PostRepository;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post save(Post entity) {
        return postRepository.save(entity);
    }

    public Post update(Integer id, Post entity) {
        Post tempEntity = get(id);
        entity.setId(tempEntity.getId());
        return save(entity);
    }

    public void delete(Integer id) {
        postRepository.deleteById(id);
    }

    public Post get(Integer id) {
        return postRepository.getReferenceById(id);
    }

    public List<Post> getAll() {
        return postRepository.findAll();
    }
}
