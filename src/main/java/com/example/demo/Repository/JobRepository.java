package com.example.demo.Repository;

import com.example.demo.Models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
}
