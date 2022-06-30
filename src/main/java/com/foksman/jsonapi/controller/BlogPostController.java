package com.foksman.jsonapi.controller;

import com.foksman.jsonapi.model.PingResponseDto;
import com.foksman.jsonapi.model.BlogPostResponseDto;
import com.foksman.jsonapi.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BlogPostController {

    private final BlogPostService blogPostService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/ping")
    @ResponseStatus(HttpStatus.OK)
    public PingResponseDto getPing() {
        return blogPostService.getPing();
    }

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    public List<BlogPostResponseDto> getBlogPost(@RequestParam String tag, @RequestParam(required = false, defaultValue = "id") String sortBy, @RequestParam(required = false, defaultValue = "asc") String derection) {
        return blogPostService.getPost(tag, sortBy, derection);
    }

}
