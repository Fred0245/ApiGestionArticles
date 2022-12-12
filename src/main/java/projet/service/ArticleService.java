package projet.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import projet.models.Article;
import projet.repository.ArticleRepository;

@Service
public class ArticleService {
	

	@Autowired
	private ArticleRepository ArticleRepository;
	

	public List<Article> getAllArticles(){
		return ArticleRepository.findAll();
	}
	

	public Article CreateArticle(Article article){
		return ArticleRepository.save(article);
	}
	
	public Article getArticleById(int id) {
        return ArticleRepository.findById(id).orElse(null);
    }
	
	public ResponseEntity<Article> updateArticle(Article article, int id) {
		Article existingArticle = ArticleRepository.findById(id).orElse(null);
        existingArticle.setDesignation(article.getDesignation());
        existingArticle.setQuantite(article.getQuantite());
        existingArticle.setDescription(article.getDescription());
        existingArticle.setPrixUnitaire(article.getPrixUnitaire());
        ArticleRepository.save(existingArticle);
        return ResponseEntity.ok().body(existingArticle);
    }
	
	public String deleteArticle(int id) {
        ArticleRepository.deleteById(id);
        return "Article supprimé avec succès !";
    }
	
	public Article findArticleByDesignation(String designation){
        return ArticleRepository.findArticleByDesignation(designation);
    }

	
	

}
