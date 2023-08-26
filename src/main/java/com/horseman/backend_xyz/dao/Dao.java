package com.horseman.backend_xyz.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horseman.backend_xyz.model.DataModel;

public interface Dao extends JpaRepository<DataModel, Integer> {
    Optional<DataModel> findById(Integer id);
}
