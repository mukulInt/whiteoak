package com.whiteoakindia.whiteoak.bytes.serviceimpl;

import com.whiteoakindia.whiteoak.bytes.daoservice.BytesAttachmentDaoService;
import com.whiteoakindia.whiteoak.bytes.daoservice.BytesDaoService;
import com.whiteoakindia.whiteoak.bytes.dto.BytesAttachmentResponseDto;
import com.whiteoakindia.whiteoak.bytes.dto.BytesResponseDto;
import com.whiteoakindia.whiteoak.bytes.entity.Bytes;
import com.whiteoakindia.whiteoak.bytes.entity.BytesAttachment;
import com.whiteoakindia.whiteoak.bytes.service.BytesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class BytesServiceImpl implements BytesService {


    private BytesDaoService bytesDaoService;


    private BytesAttachmentDaoService bytesAttachmentDaoService;



    public BytesServiceImpl(BytesDaoService bytesDaoService,BytesAttachmentDaoService bytesAttachmentDaoService) {
        this.bytesDaoService = bytesDaoService;
        this.bytesAttachmentDaoService=bytesAttachmentDaoService;
    }

    @Override
    public List<BytesResponseDto> getAllBytes() {

        List<Bytes> allBytesFromDb = getAllBytesFromDb();

        return convertEntityListToDtoList(allBytesFromDb);
    }

    @Override
    public BytesResponseDto getByteById(Long id) {

        Optional<Bytes> bytesById = getBytesById(id);

        if(bytesById.isEmpty()){
            throw  new RuntimeException("Invalid Byte Id");
        }

        return convertToBlogResponseDto(bytesById.get(),false);
    }

//    @Override
//    public BytesAttachmentResponseDto getAttachmentByBytesId(Long id) {
//
//        Optional<BytesAttachment> bytesAttachment = getBytesAttachmentByIdFromDB(id);
//
//        if(Objects.isNull(bytesAttachment)){
//            throw new RuntimeException("No attachment found");
//        }
//
//        return convertEntityToResponseDto(bytesAttachment.get());
//    }


    private List<Bytes> getAllBytesFromDb(){
        return bytesDaoService.getAllBytes();
    }

    private Optional<Bytes> getBytesById(Long id){
        return bytesDaoService.getBytesById(id);
    }


    private List<BytesResponseDto> convertEntityListToDtoList(List<Bytes> bytesList){
        return bytesList.stream().map(bytes -> convertToBlogResponseDto(bytes,true)).collect(Collectors.toList());
    }


    private BytesResponseDto convertToBlogResponseDto(Bytes bytes,boolean isListResponse){
        return new BytesResponseDto(bytes,isListResponse);
    }

//    private Optional<BytesAttachment> getBytesAttachmentByIdFromDB(Long id){
//        return bytesAttachmentDaoService.getBytesAttachmentById(id);
//    }
//
//
//    private BytesAttachmentResponseDto convertEntityToResponseDto(BytesAttachment bytesAttachment){
//        return new BytesAttachmentResponseDto(bytesAttachment);
//    }
}
