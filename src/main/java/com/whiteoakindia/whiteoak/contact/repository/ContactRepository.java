package com.whiteoakindia.whiteoak.contact.repository;

import com.whiteoakindia.whiteoak.contact.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Long> {
}
