package com.whiteoakindia.whiteoak.bytes.daoservice;

import com.whiteoakindia.whiteoak.bytes.entity.Bytes;
import com.whiteoakindia.whiteoak.bytes.repository.BytesRepository;
import com.whiteoakindia.whiteoak.common.utils.ActiveInactiveStatusUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class BytesDaoService {


    private BytesRepository bytesRepository;


    private ActiveInactiveStatusUtils activeInactiveStatusUtils;


    public BytesDaoService(BytesRepository bytesRepository,ActiveInactiveStatusUtils activeInactiveStatusUtils) {
        this.bytesRepository = bytesRepository;
        this.activeInactiveStatusUtils=activeInactiveStatusUtils;
    }


    public List<Bytes> getAllBytes(){
        return bytesRepository.findAllByStatus(activeInactiveStatusUtils.getActiveStatus());
    }


    public Optional<Bytes> getBytesById(Long id){
        return bytesRepository.findByIdAndStatus(id,activeInactiveStatusUtils.getActiveStatus());
    }
}
