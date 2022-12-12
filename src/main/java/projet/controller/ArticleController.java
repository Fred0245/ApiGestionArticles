package projet.controller;

import java.util.List;
import projet.models.Article;
import projet.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Article")
@CrossOrigin(origins = "*")
public class ArticleController {
	
	@Autowired
    private ArticleService articleService;
	
	
	  @RequestMapping(value = "/getAll", method = RequestMethod.GET)
	    public List<Article> getAllArticles() {
	        return articleService.getAllArticles();
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	    public Article getOneArticle(@PathVariable int id) {
	        return articleService.getArticleById(id);
	    }

	    
	    @RequestMapping(value = "/findByDesignation", method = RequestMethod.GET)
	    public Article getArticleByDesignation(@PathVariable String designation){
	        return articleService.findArticleByDesignation(designation);
	    }

	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public Article addArticle(@RequestBody Article article) {
	        return articleService.CreateArticle(article);
	    }

	    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	    public ResponseEntity<Article> updateArticle(@RequestBody Article article,@PathVariable  int id) {
	        return articleService.updateArticle(article,id);
	    }

	    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	    public String deleteProduct(@PathVariable int id) {
	        return articleService.deleteArticle(id);
	    }

	

	
	
	
	
}
