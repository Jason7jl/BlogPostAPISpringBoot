package com.foksman.jsonapi.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "posts")
public class  BlogPostEntity implements Serializable {

    @Id
    private Integer id;
    private String author;
    private int authorId;
    private int likes;
    private double popularity;
    private int reads;
    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TagEntity> tags;


}
