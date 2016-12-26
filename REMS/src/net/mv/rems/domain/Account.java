package net.mv.rems.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "ACCOUNT")
public class Account {
	
	@Id
	@Column(name = "ACCOUNT_ID")
	@SequenceGenerator(name = "accountSequence" , sequenceName = "ACCOUNT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountSequence")
	private long id;
	private String fName;
	private String lName;
	private String username;
	private String password;
	private String email;
	private String address;
	private String state;
	private String city;
	
	@Column(name = "ZIP_CODE")
	private long zipCode;
	
	@Column(name = "PHONE_NUMBER")
	private long phoneNum;
	
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_TYPE_ID")
	private AccountType accountType;
	
	@OneToMany(mappedBy="account")
	@Fetch(FetchMode.SELECT)
	List<Equipment> equipment;
	
	@ManyToMany
	@JoinTable(name = "ACCOUNT_FEEDBACK" ,joinColumns = {@JoinColumn(name="ACCOUNT_ID")},
				inverseJoinColumns = {@JoinColumn(name = "FEEDBACK_ID")})
	@Fetch(FetchMode.SELECT)
	private List<Feedback> feedbackList;
	
	@OneToMany(mappedBy="researcher")
	@Fetch(FetchMode.SELECT)
	List<Transaction> researcherTransactionsList;
	
//	@OneToMany(mappedBy="supplier")
//	@Fetch(FetchMode.SELECT)
//	List<Transaction> supplierTransactionsList;


	@Override
	public String toString() {
		return "Account [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", username=" + username + ", password=" + password
				+ ", email=" + email + ", address=" + address + ", state="
				+ state + ", city=" + city + ", zipCode=" + zipCode
				+ ", phoneNum=" + phoneNum + ", accountType=" + accountType
				+ ", equipment=" + equipment + ", feedbackList=" + feedbackList
				+ ", researcherTransactionsList=" + researcherTransactionsList
				//+ ", supplierTransactionsList=" + supplierTransactionsList
				+ "]";
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public List<Equipment> getEquipment() {
		return equipment;
	}



	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}


	public List<Feedback> getFeedbackList() {
		return feedbackList;
	}


	public void setFeedbackList(List<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}

	
	public List<Transaction> getResearcherTransactionsList() {
		return researcherTransactionsList;
	}


	public void setResearcherTransactionsList(
			List<Transaction> researcherTransactionsList) {
		this.researcherTransactionsList = researcherTransactionsList;
	}


//	public List<Transaction> getSupplierTransactionsList() {
//		return supplierTransactionsList;
//	}
//
//
//	public void setSupplierTransactionsList(
//			List<Transaction> supplierTransactionsList) {
//		this.supplierTransactionsList = supplierTransactionsList;
//	}
	
}
