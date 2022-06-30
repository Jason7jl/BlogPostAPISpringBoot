package com.foksman.jsonapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "tags")
public class TagEntity implements Serializable {

    @Id
    private Integer id;
    private String name;
    @ManyToOne
    @JsonBackReference
    private BlogPostEntity post;

}
