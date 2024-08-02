package com.jetbrains.ray.photoz.clone.repository;

import com.jetbrains.ray.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
