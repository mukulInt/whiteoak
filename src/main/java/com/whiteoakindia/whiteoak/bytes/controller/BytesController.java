package com.whiteoakindia.whiteoak.bytes.controller;


import com.whiteoakindia.whiteoak.bytes.dto.BytesAttachmentResponseDto;
import com.whiteoakindia.whiteoak.bytes.dto.BytesResponseDto;
import com.whiteoakindia.whiteoak.bytes.service.BytesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bytes")
public class BytesController {


    private BytesService bytesService;

    public BytesController(BytesService bytesService) {
        this.bytesService = bytesService;
    }

    @GetMapping
    public List<BytesResponseDto> getAllBytes(){
        return bytesService.getAllBytes();
    }

    @GetMapping("/{id}")
    public BytesResponseDto getBytesById(@PathVariable("id") Long id){
        return bytesService.getByteById(id);
    }

//    @GetMapping("/attachment/{id}")
//    public BytesAttachmentResponseDto getBytesAttachment(@PathVariable("id") Long id){
//        return bytesService.getAttachmentByBytesId(id);
//    }
}
