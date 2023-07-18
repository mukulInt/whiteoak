package com.whiteoakindia.whiteoak.bytes.service;

import com.whiteoakindia.whiteoak.bytes.dto.BytesAttachmentResponseDto;
import com.whiteoakindia.whiteoak.bytes.dto.BytesResponseDto;

import java.util.List;

public interface BytesService {

    List<BytesResponseDto> getAllBytes();

    BytesResponseDto getByteById(Long id);


//    BytesAttachmentResponseDto getAttachmentByBytesId(Long id);

}
