package com.foksman.jsonapi.service.impl;

import com.foksman.jsonapi.controller.exception.BadRequestException;
import com.foksman.jsonapi.entity.BlogPostEntity;
import com.foksman.jsonapi.entity.TagEntity;
import com.foksman.jsonapi.mapper.BlogPostMapper;
import com.foksman.jsonapi.model.PingResponseDto;
import com.foksman.jsonapi.model.BlogPostResponseDto;
import com.foksman.jsonapi.repository.BlogPostRepository;
import com.foksman.jsonapi.repository.TagRepository;
import com.foksman.jsonapi.service.BlogPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogPostServiceImpl implements BlogPostService {

    private final BlogPostRepository blogPostRepository;
    private final BlogPostMapper blogPostMapper;
    private final TagRepository tagRepository;

    @Override
    @Cacheable()
    public List<BlogPostResponseDto> getPost() {
        List<BlogPostEntity> blogPostEntities = blogPostRepository.findAll();

        return blogPostMapper.entitiesToResponseDtos(blogPostEntities);
    }


    @Override
    public PingResponseDto getPing() {
        return new PingResponseDto();
    }

    @Override
    public List<BlogPostResponseDto> getPost(String tag, String sortBy, String direction) {


        validateRequestParam(tag);

        Sort sort = (sortBy == null) ? Sort.by("id") : Sort.by(sortBy);

        if (direction.equals("desc")) sort.descending();

        TagEntity tagEntity = tagRepository.findTagEntityByName(tag);

        List<BlogPostEntity> blogPostEntities = blogPostRepository.findByTagsContaining(tagEntity, sort);

        return blogPostMapper.entitiesToResponseDtos(blogPostEntities);

    }

    public void validateRequestParam(String tag) {

        if (tag == null) throw new BadRequestException("Error: Required field was null!");
    }
}
