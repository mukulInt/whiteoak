package com.whiteoakindia.whiteoak.contact.serviceImpl;

import com.whiteoakindia.whiteoak.contact.daoservice.ContactDaoService;
import com.whiteoakindia.whiteoak.contact.dto.ContactDto;
import com.whiteoakindia.whiteoak.contact.entity.Contact;
import com.whiteoakindia.whiteoak.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDaoService contactDaoService;

    @Override
    public void addContact(ContactDto request) {
        Contact contact = new Contact(request);
        contactDaoService.saveContact(contact);
    }
}
