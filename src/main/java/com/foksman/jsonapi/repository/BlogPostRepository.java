package com.foksman.jsonapi.repository;

import com.foksman.jsonapi.entity.BlogPostEntity;
import com.foksman.jsonapi.entity.TagEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository <BlogPostEntity, Integer> {

    List<BlogPostEntity> findByTagsContaining(TagEntity tag, Sort sort);
}
