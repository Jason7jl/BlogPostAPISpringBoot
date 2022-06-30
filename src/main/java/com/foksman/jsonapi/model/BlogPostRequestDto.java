package com.foksman.jsonapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BlogPostRequestDto {

    private String tag;
    private String sortBy;
    private String direction;


}
