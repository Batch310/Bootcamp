package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_customer_wallet_withdraw")
public class T_Customer_Wallet_Withdraw extends BaseProperties {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	private Long customer_id;
	
	private Long wallet_default_nominal_id;
	
	private Integer amount;
	
	@Column(length = 50)
	private String bank_name;
	
	@Column(length = 50)
	private String account_number;
	
	@Column(length = 255)
	private String account_name;
	
	private Integer otp;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getWallet_default_nominal_id() {
		return wallet_default_nominal_id;
	}

	public void setWallet_default_nominal_id(Long wallet_default_nominal_id) {
		this.wallet_default_nominal_id = wallet_default_nominal_id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	
	
}
