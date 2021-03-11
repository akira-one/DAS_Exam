package de.leuphana.component.structure;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import de.leuphana.component.structure.Article;

@Entity
@Table(name = "DB_ORDERPOSITION")
public class OrderPosition {

	private static int lastId = 0;
	private int positionId;
	private int articleQuantity;
			
//	private Article article;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "articleId")
	private int articleId;

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public void setPositionId(int positonId) {
		this.positionId = positonId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getPositionId() {
		return positionId;
	}

//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "articleId")
//	public Article getArticle() {
//		return article;
//	}
//
//	public void setArticle(Article article) {
//		this.article = article;
//	}

	public int getArticleQuantity() {
		return articleQuantity;
	}

	public void setArticleQuantity(int articleQuantity) {
		this.articleQuantity = articleQuantity;
	}

}