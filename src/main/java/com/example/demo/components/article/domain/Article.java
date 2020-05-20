package com.example.demo.components.article.domain;

import java.util.UUID;

public class Article {
    public String id;
    public String title;

    public Article() {
        id = UUID.randomUUID().toString();
    }

    public Article(String title) {
        id = UUID.randomUUID().toString();
        this.title = title;
    }
}
