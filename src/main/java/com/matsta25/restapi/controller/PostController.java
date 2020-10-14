package com.matsta25.restapi.controller;

import com.matsta25.restapi.dto.PostDto;
import com.matsta25.restapi.model.Post;
import com.matsta25.restapi.service.PostService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<PostDto> getPosts(@RequestParam(required = false) int page, Sort.Direction sort) {
        int pageNumber = page > 0 ? page : 0;
        return PostDtoMapper.mapToPostDtos(postService.getPosts(pageNumber, sort));
    }

    @GetMapping("/posts/comments")
    public List<Post> getPostsWithComments(@RequestParam(required = false) int page , Sort.Direction sort) {
        int pageNumber = page > 0 ? page : 0;
        return postService.getPostsWithComments(pageNumber, sort);
    }


    @GetMapping("/posts/{id}")
    public Post getSinglePosts(@PathVariable long id) {
        return postService.getSinglePost(id);
    }
}
