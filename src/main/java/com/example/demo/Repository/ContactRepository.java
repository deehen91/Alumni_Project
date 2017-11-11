package com.example.demo.Repository;

import com.example.demo.Models.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long>{
}
