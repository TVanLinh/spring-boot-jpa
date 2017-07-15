package service;

import entities.Article;

import java.util.List;

/**
 * Created by linhtran on 13/07/17.
 */
public interface IArticleService {
    List<Article> getAllArticles();

    Article getArticleById(int articleId);

    boolean addArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);
    List<Article> getArticles(int offset, int limit);
}
