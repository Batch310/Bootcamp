package id.bootcamp.java310.pos.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderHeaderDTO {
	private Double amount;
	private String create_by;
	private List<OrderDetailDTO> listOrderDetail;
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public List<OrderDetailDTO> getListOrderDetail() {
		return listOrderDetail;
	}
	public void setListOrderDetail(List<OrderDetailDTO> listOrderDetail) {
		this.listOrderDetail = listOrderDetail;
	}
}
