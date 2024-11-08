package com.hys.exam.surl_project_11.domain.article.article.repository;

import com.hys.exam.surl_project_11.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArticleRepository extends JpaRepository<Article, Long> {

    //    @Query("SELECT a FROM Article a WHERE a.id IN :ids ORDER BY a.title DESC, a.id ASC")
    //    List<Article> findByIdsOrderByTitleDescIdAsc(@Param("ids") List<Long> ids);
    List<Article> findByIdInOrderByTitleDescIdAsc(List<Long> ids);

    //    @Query("SELECT a FROM Article a WHERE a.title LIKE %:keyword%")
    //    List<Article> findByTitleLike(@Param("keyword") String keyword);
    List<Article> findByTitleContaining(String keyword);


    //    @Query("SELECT a FROM Article a WHERE a.title = :title AND a.body = :body")
    //    List<Article> findByTitleAndBody(@Param("title") String title, @Param("body") String body);
    List<Article> findByTitleAndBody(String title, String body);
}
