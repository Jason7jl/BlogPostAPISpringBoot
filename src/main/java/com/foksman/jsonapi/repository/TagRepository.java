package com.foksman.jsonapi.repository;

import com.foksman.jsonapi.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Integer> {

    TagEntity findTagEntityByName(String name);
}
