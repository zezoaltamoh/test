package net.mv.rems.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.type.ImageType;

@Entity
@Table(name="EQUIPMENT")
public class Equipment {
	
	@Id
	@Column(name ="EQUIPMENT_ID")
	@SequenceGenerator(name = "equipmentSEQ", sequenceName ="EQUIPMENT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipmentSEQ")
	private long id;
	@Column(name = "EQUIPMENT_NAME")
	private String equipName;
	@Column(name="ITEMS_IN_STOCK")
	private long quantity;
	private double price;
	private String condition;
	private String status;
	private ImageType image;
	
	@ManyToOne
	@JoinColumn(name="ACCOUNT_ID")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	
	@OneToMany(mappedBy = "equipment")
	@Fetch(FetchMode.SELECT)
	private List<Transaction> transactions;
	
	
	@Override
	public String toString() {
		return "Equipment [id=" + id + ", equipName=" + equipName
				+ ", quantity=" + quantity + ", price=" + price
				+ ", condition=" + condition + ", status=" + status
				+ ", image=" + image + ", account=" + account + ", category="
				+ category + ", transactions=" + transactions + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ImageType getImage() {
		return image;
	}

	public void setImage(ImageType image) {
		this.image = image;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	

}
