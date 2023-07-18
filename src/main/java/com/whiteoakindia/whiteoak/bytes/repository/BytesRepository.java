package com.whiteoakindia.whiteoak.bytes.repository;

import com.whiteoakindia.whiteoak.bytes.entity.Bytes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BytesRepository extends JpaRepository<Bytes,Long> {


    List<Bytes> findAllByStatus(Integer status);

    Optional<Bytes> findByIdAndStatus(Long id, Integer status);
}
