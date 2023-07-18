package com.whiteoakindia.whiteoak.bytes.repository;

import com.whiteoakindia.whiteoak.bytes.entity.BytesAttachment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BytesAttachmentRepository extends JpaRepository<BytesAttachment,Long> {


    Optional<BytesAttachment> findByIdAndStatus(Long id,Integer status);

}
