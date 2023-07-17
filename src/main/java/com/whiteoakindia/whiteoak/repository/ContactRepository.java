package com.whiteoakindia.whiteoak.repository;

import com.whiteoakindia.whiteoak.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Long> {
}
