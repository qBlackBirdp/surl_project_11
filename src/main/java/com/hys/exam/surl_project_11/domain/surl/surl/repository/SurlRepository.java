package com.hys.exam.surl_project_11.domain.surl.surl.repository;

import com.hys.exam.surl_project_11.domain.surl.surl.entity.Surl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SurlRepository extends JpaRepository<Surl, Integer> {

    Optional<Surl> findById(Long id);
}
