package com.foksman.jsonapi.mapper;


import com.foksman.jsonapi.entity.BlogPostEntity;
import com.foksman.jsonapi.entity.TagEntity;
import com.foksman.jsonapi.model.BlogPostResponseDto;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public abstract class BlogPostMapper {

    public abstract List<BlogPostResponseDto> entitiesToResponseDtos(List<BlogPostEntity> blogPostEntities);

    List<String> map(List<TagEntity> value) {
        return value.stream().map(TagEntity::getName).collect(Collectors.toList());
    }

}
