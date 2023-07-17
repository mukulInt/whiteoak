package com.whiteoakindia.whiteoak.serviceImpl;

import com.whiteoakindia.whiteoak.daoservice.ContactDaoService;
import com.whiteoakindia.whiteoak.dto.ContactDto;
import com.whiteoakindia.whiteoak.entity.Contact;
import com.whiteoakindia.whiteoak.service.ContactService;
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
