package com.hys.exam.surl_project_11.domain.article.article.repository;

import com.hys.exam.surl_project_11.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article, Long> {
}
