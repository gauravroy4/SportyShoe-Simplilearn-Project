package com.gaurav.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "REPORT_TBL")
public class Report implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int reportId;
	@Column
	String purchasedBy;
	@Column
	String productId;
	@Column
	String category;
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date purchaseDate;
	
	
	public int getPurchaseId() {
		return reportId;
	}
	public void setPurchaseId(int purchaseId) {
		this.reportId = purchaseId;
	}
	public String getPurchasedBy() {
		return purchasedBy;
	}
	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
