package net.mv.rems.domain;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="FEEDBACK")
public class Feedback {
	
	@Id
	@Column(name = "FEEDBACK_ID")
	@SequenceGenerator(name= "feedback_SEQ", sequenceName = "FEEDBACK_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feedback_SEQ")
	private long id;
	@Column(name = "FEEDBACK_MESSAGE")
	private String message;
	@Column(name = "FEEDBACK_TIME")
	private Timestamp feedbackTime;
	
	@ManyToOne
	@JoinColumn(name = "TRANSACTION_ID")
	private Transaction transaction;
	
	@ManyToMany(mappedBy = "feedbackList")
	@Fetch(FetchMode.SELECT)
	private List<Account> usersList;

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", message=" + message
				+ ", feedbackTime=" + feedbackTime + ", transaction="
				+ transaction + ", usersList=" + usersList + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getFeedbackTime() {
		return feedbackTime;
	}

	public void setFeedbackTime(Timestamp feedbackTime) {
		this.feedbackTime = feedbackTime;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public List<Account> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<Account> usersList) {
		this.usersList = usersList;
	}
	

}
