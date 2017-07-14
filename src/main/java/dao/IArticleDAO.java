package dao;

import entities.Article;

import java.util.List;

/**
 * Created by linhtran on 13/07/17.
 */
public interface IArticleDAO {
    List<Article> getAllArticles();

    Article getArticleById(int articleId);

    void addArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(int articleId);

    boolean articleExists(String title, String category);
}
