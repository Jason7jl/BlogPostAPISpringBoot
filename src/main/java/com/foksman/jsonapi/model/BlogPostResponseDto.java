package com.foksman.jsonapi.model;

import com.foksman.jsonapi.entity.TagEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogPostResponseDto {

      private int id;
      private String author;
      private int authorId;
      private int likes;
      private double popularity;
      private int reads;
      private List<String> tags;

}
