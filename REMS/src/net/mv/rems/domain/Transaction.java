package net.mv.rems.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity
@Table(name = "TRANSACTION")
public class Transaction {
	
	@Id
	@Column(name = "TRANSACTION_ID")
	@SequenceGenerator(name ="transactionSeq", sequenceName = "TRANSACTION_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transactionSeq")
	private long id;
	private String description;
	@Column(name = "TRANSACTION_STATUS")
	private String status;
	private String state;
	private String city;
	private String address;
	private String zipCode;
	@Column(name="TRACKING_NUMBER")
	private long trackingNumber;
	@Column(name="RETURN_DATE")
	private Date returnDate;
	@Column(name="TRANSACTION_DATE")
	private Date orderDate;
	@Column(name="ARRIVAL_DATE")
	private Date arrivalDate;
	
	@ManyToOne
	@JoinColumn(name="EQUIPMENT_ID")
	private Equipment equipment;
	
	@OneToMany(mappedBy = "transaction")
	@Fetch(FetchMode.SELECT) 
	private List<Feedback> feedback;
	
	@ManyToOne
	@JoinColumn(name="RESEARCHER_ID")
	private Account researcher;
	
//	@ManyToOne
//	@JoinColumn(name="SUPPLIER_ID")
//	private Account supplier;
	
//	@Override
//	public String toString() {
//		return "Transaction [id=" + id + ", description=" + description
//				+ ", status=" + status + ", state=" + state + ", city=" + city
//				+ ", address=" + address + ", zipCode=" + zipCode
//				+ ", trackingNumber=" + trackingNumber + ", returnDate="
//				+ returnDate + ", orderDate=" + orderDate + ", arrivalDate="
//				+ arrivalDate + ", equipment=" + equipment + ", feedback="
//				+ feedback + ", researcher=" + researcher + ", supplier="
//				+ supplier + "]";
//	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", description=" + description
				+ ", status=" + status + ", state=" + state + ", city=" + city
				+ ", address=" + address + ", zipCode=" + zipCode
				+ ", trackingNumber=" + trackingNumber + ", returnDate="
				+ returnDate + ", orderDate=" + orderDate + ", arrivalDate="
				+ arrivalDate + ", equipment=" + equipment + ", feedback="
				+ feedback + ", researcher=" + researcher + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public long getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(long trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public List<Feedback> getFeedback() {
		return feedback;
	}

	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}

	public Account getResearcher() {
		return researcher;
	}

	public void setResearcher(Account researcher) {
		this.researcher = researcher;
	}

//	public Account getSupplier() {
//		return supplier;
//	}
//
//	public void setSupplier(Account supplier) {
//		this.supplier = supplier;
//	}
	

}
