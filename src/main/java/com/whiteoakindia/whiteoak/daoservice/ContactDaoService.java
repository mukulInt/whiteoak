package com.whiteoakindia.whiteoak.daoservice;

import com.whiteoakindia.whiteoak.entity.Contact;
import com.whiteoakindia.whiteoak.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ContactDaoService {

    @Autowired
    private ContactRepository contactRepository;


    public Contact saveContact(Contact contact){
        return contactRepository.save(contact);
    }

}
