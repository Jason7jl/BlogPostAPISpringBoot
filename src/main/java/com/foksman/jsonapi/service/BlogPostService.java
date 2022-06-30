package com.foksman.jsonapi.service;

import com.foksman.jsonapi.model.PingResponseDto;
import com.foksman.jsonapi.model.BlogPostResponseDto;

import java.util.List;

public interface BlogPostService {
    PingResponseDto getPing();

    List<BlogPostResponseDto> getPost(String tag, String sortBy, String derection);
    List<BlogPostResponseDto> getPost();
}
