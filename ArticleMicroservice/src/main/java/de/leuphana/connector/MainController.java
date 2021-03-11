package de.leuphana.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.component.behaviour.CustomerRepository;
import de.leuphana.component.structure.Article;

@RestController
@RequestMapping(path = "/article-maincontroller")
public class MainController {

	@Autowired
	private CustomerRepository articleRepository;
	
	@RequestMapping("/")
	  public String home() {
	    return "Hello Docker World";
	  }

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody int addNewArticle(@RequestParam String name, @RequestParam String manufactor,
			@RequestParam float price) {

		Article article = new Article(name, manufactor, price);
		articleRepository.save(article);

		// Check persistence
		article = articleRepository.findById((int) article.getArticleId());

		return article.getArticleId();
	}

	@GetMapping(path = "/getArticleById/{articleId}")
	public @ResponseBody Article getArticleById(@RequestParam int articleId) {
		return articleRepository.findById(articleId);
	}
	
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Article> getAllArticles() {
		return articleRepository.findAll();
	}

}
