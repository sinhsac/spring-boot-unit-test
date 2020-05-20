package com.example.demo.components.article.api;

import com.example.demo.components.article.domain.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("getOneArticles")
@RequestMapping("/api/v1/articles")
public class GetOne {

    @GetMapping("/{id}")
    public Article getOne(@PathVariable("id") String id) {
        return new Article(String.format("article of id %s", id));
    }
}
