package net.mv.rems.domain;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.type.ImageType;

@Entity
@Table(name = "CATEGORY")
public class Category {
	
	@Id
	@Column(name="CATEGORY_ID")
	@SequenceGenerator(name="categorySeq", sequenceName="CATEGORY_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categorySeq")
	private long id;
	@Column(name="CATEGORY_NAME")
	private String categName;
	@Column(name="CATEGORY_DESCRIPTION")
	private String categDescription;
	private ImageType image;
	
	@OneToMany(mappedBy="category")
	@Fetch(FetchMode.SELECT)
	private List<Equipment> equipment;

	@Override
	public String toString() {
		return "Category [id=" + id + ", categName=" + categName
				+ ", categDescription=" + categDescription + ", image=" + image
				+ ", equipment=" + equipment + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategName() {
		return categName;
	}

	public void setCategName(String categName) {
		this.categName = categName;
	}

	public String getCategDescription() {
		return categDescription;
	}

	public void setCategDescription(String categDescription) {
		this.categDescription = categDescription;
	}

	public ImageType getImage() {
		return image;
	}

	public void setImage(ImageType image) {
		this.image = image;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}
	

}
