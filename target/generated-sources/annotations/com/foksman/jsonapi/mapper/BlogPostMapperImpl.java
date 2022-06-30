package com.foksman.jsonapi.mapper;

import com.foksman.jsonapi.entity.BlogPostEntity;
import com.foksman.jsonapi.model.BlogPostResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-29T21:44:35-0700",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.12 (Amazon.com Inc.)"
)
@Component
public class BlogPostMapperImpl extends BlogPostMapper {

    @Override
    public List<BlogPostResponseDto> entitiesToResponseDtos(List<BlogPostEntity> blogPostEntities) {
        if ( blogPostEntities == null ) {
            return null;
        }

        List<BlogPostResponseDto> list = new ArrayList<BlogPostResponseDto>( blogPostEntities.size() );
        for ( BlogPostEntity blogPostEntity : blogPostEntities ) {
            list.add( blogPostEntityToBlogPostResponseDto( blogPostEntity ) );
        }

        return list;
    }

    protected BlogPostResponseDto blogPostEntityToBlogPostResponseDto(BlogPostEntity blogPostEntity) {
        if ( blogPostEntity == null ) {
            return null;
        }

        BlogPostResponseDto blogPostResponseDto = new BlogPostResponseDto();

        if ( blogPostEntity.getId() != null ) {
            blogPostResponseDto.setId( blogPostEntity.getId() );
        }
        blogPostResponseDto.setAuthor( blogPostEntity.getAuthor() );
        blogPostResponseDto.setAuthorId( blogPostEntity.getAuthorId() );
        blogPostResponseDto.setLikes( blogPostEntity.getLikes() );
        blogPostResponseDto.setPopularity( blogPostEntity.getPopularity() );
        blogPostResponseDto.setReads( blogPostEntity.getReads() );
        blogPostResponseDto.setTags( map( blogPostEntity.getTags() ) );

        return blogPostResponseDto;
    }
}
