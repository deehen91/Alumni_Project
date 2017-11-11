package com.example.demo.Repository;

import com.example.demo.Models.Alumni;
import org.springframework.data.repository.CrudRepository;

public interface AlumniRepository extends CrudRepository<Alumni, Long> {
}
