package com.example.demo.components.article.api;

import com.example.demo.components.article.domain.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("getAllArticles")
@RequestMapping("/api/v1/articles")
public class GetAll {

    @GetMapping
    public List<Article> getAll() {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article("Article 001"));
        articles.add(new Article("Article 002"));
        articles.add(new Article("Article 003"));
        articles.add(new Article("Article 004"));
        articles.add(new Article("Article 005"));
        return articles;
    }
}
