package id.bootcamp.java310.minipro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_customer_chat_history")
public class T_Customer_Chat_History extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long customer_chat_id;
	
	private String chat_content;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomer_chat_id() {
		return customer_chat_id;
	}

	public void setCustomer_chat_id(Long customer_chat_id) {
		this.customer_chat_id = customer_chat_id;
	}

	public String getChat_content() {
		return chat_content;
	}

	public void setChat_content(String chat_content) {
		this.chat_content = chat_content;
	}

	
	
	
	
}
