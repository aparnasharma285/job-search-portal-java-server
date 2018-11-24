package com.example.projectserver.repositories;

import com.example.projectserver.models.JobType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface JobTypeRepository extends JpaRepository<JobType,Integer> {

    @Query("select j from JobType j where j.name=:name")
    Optional<JobType> findJobTypeByName (@Param("name") String name);
}
