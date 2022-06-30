package com.foksman.jsonapi.mapper;


import com.foksman.jsonapi.entity.BlogPostEntity;
import com.foksman.jsonapi.entity.TagEntity;
import com.foksman.jsonapi.model.BlogPostResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BlogPostMapper {

    List<BlogPostResponseDto> entitiesToResponseDtos(List<BlogPostEntity> blogPostEntities);

    List<String> map(List<TagEntity> value);

    String tagEntityToTagDto(TagEntity tag);

}
