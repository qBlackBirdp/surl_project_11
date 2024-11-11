package com.hys.exam.surl_project_11.domain.article.article.service;

import com.hys.exam.surl_project_11.domain.article.article.entity.Article;
import com.hys.exam.surl_project_11.domain.article.article.repository.ArticleRepository;
import com.hys.exam.surl_project_11.domain.member.member.entity.Member;
import com.hys.exam.surl_project_11.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ArticleService {
    private final ArticleRepository articleRepository;

    public long count() {
        return articleRepository.count();
    }

    @Transactional
    public RsData<Article> write(Member member, String title, String body) {
        Article article = Article
                .builder()
                .title(title)
                .body(body)
                .author(member)
                .build();

        articleRepository.save(article);
        return RsData.of("%d번 게시글이 생성됨".formatted(article.getId()), article);
    }

    @Transactional
    public void delete(Article article) {
        articleRepository.delete(article);
    }

    public Optional<Article> findById(long id) {
        return articleRepository.findById(id);
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}