package com.foksman.jsonapi;

import com.foksman.jsonapi.controller.BlogPostController;
import com.foksman.jsonapi.entity.BlogPostEntity;
import com.foksman.jsonapi.entity.TagEntity;
import com.foksman.jsonapi.model.BlogPostResponseDto;
import com.foksman.jsonapi.service.BlogPostService;
import com.foksman.jsonapi.service.impl.BlogPostServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class BlogPostControllerTest {

    private BlogPostService blogPostService;
    private BlogPostController blogPostController;

    @BeforeEach
    void setup() {

        blogPostService = mock(BlogPostServiceImpl.class);
        blogPostController = new BlogPostController(blogPostService);
    }

    @Test
    void getAllCases_serviceIsValid_returnsIterableOfAsylumCaseResponseDto() {
        // GIVEN
//        String tag = "te";
//        BlogPostEntity blogPostEntity = new BlogPostEntity();
//
//        List<TagEntity> tags = Arrays.asList(new TagEntity(1,"hur",blogPostEntity), new TagEntity(2,"tech", blogPostEntity));
//
//        BlogPostResponseDto blogPostResponseDto = new BlogPostResponseDto(3,"Vasili", 5, 45, 4.0, 3, tags);
//
//        // WHEN
//
//        when(blogPostService.getPost(tag, null ,null)).thenReturn(List.of(blogPostResponseDto));
//        List<BlogPostResponseDto> result = blogPostController.getBlogPost(tag,null,null);
//
//        // THEN
//        assertTrue(result.iterator().hasNext());
//        verify(blogPostService).getPost(tag,null,null);

    }
}
