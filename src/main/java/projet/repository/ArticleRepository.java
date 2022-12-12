package projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.models.Article;


@Repository
public interface ArticleRepository extends JpaRepository <Article, Integer> {
	Article findArticleByDesignation(String designation);
}
