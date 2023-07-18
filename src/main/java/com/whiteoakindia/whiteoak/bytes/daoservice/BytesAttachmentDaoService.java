package com.whiteoakindia.whiteoak.bytes.daoservice;


import com.whiteoakindia.whiteoak.bytes.entity.BytesAttachment;
import com.whiteoakindia.whiteoak.bytes.repository.BytesAttachmentRepository;
import com.whiteoakindia.whiteoak.utils.ActiveInactiveStatusUtils;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BytesAttachmentDaoService {



    private BytesAttachmentRepository bytesAttachmentRepository;


    private ActiveInactiveStatusUtils activeInactiveStatusUtils;


    public BytesAttachmentDaoService(BytesAttachmentRepository bytesAttachmentRepository, ActiveInactiveStatusUtils activeInactiveStatusUtils) {
        this.bytesAttachmentRepository = bytesAttachmentRepository;
        this.activeInactiveStatusUtils = activeInactiveStatusUtils;
    }

    public Optional<BytesAttachment> getBytesAttachmentById(Long id){
        return bytesAttachmentRepository.findByIdAndStatus(id,activeInactiveStatusUtils.getActiveStatus());
    }

}
