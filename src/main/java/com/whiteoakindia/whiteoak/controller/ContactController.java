package com.whiteoakindia.whiteoak.controller;


import com.whiteoakindia.whiteoak.dto.ContactDto;
import com.whiteoakindia.whiteoak.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact-details")
    public String getContactPage(Model model){
        ContactDto contactDto = new ContactDto();
        model.addAttribute("contactDto",contactDto);
        return "contact";
    }

    @PostMapping("/save-contact-details")
    public String saveContact(@ModelAttribute("contactDto") ContactDto contactDto){
       contactService.addContact(contactDto);
        return "redirect:/contact";
    }

    @GetMapping("/get-demo")
    public String getDemPage(){
        return "demo";
    }
}
