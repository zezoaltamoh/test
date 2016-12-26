package net.mv.rems.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "ACCOUNT_TYPE")
public class AccountType {
	
	@Id
	@Column(name = "ACCOUNT_TYPE_ID")
	@SequenceGenerator(name = "accountTypeSequence" , sequenceName = "ACCOUNT_TYPE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountTypeSequence")
	private long id;
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "accountType")
	//@Fetch(FetchMode.SELECT)
	private List<Account> accounts;
	
	
	@Override
	public String toString() {
		return "AccountType [id=" + id + ", accountType=" + accountType
				+ ", accounts=" + accounts + "]";
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	
}
