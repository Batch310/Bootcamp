package id.bootcamp.java310.pos.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.OrderDetailDTO;
import id.bootcamp.java310.pos.dto.OrderHeaderDTO;
import id.bootcamp.java310.pos.entities.OrderDetailEntity;
import id.bootcamp.java310.pos.entities.OrderHeaderEntity;
import id.bootcamp.java310.pos.repositories.OrderDetailRepository;
import id.bootcamp.java310.pos.repositories.OrderHeaderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderHeaderRepository ohr;

	@Autowired
	private OrderDetailRepository odr;

	public String insertOrder(OrderHeaderDTO dto) {
		//Get Latest ID
		Long latestId = ohr.getLatestId();
		if(latestId == null) {
			latestId = 1l;
		} else {
			latestId++;
		}
		String formatLatestId = String.format("%04d", latestId);
				
		//Format Reference
		String format = "yyMM-" + formatLatestId;
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String reference = "SLS-" + sdf.format(new Date());
		
		//Insert Order Header
		OrderHeaderEntity orderHeaderEntity = new OrderHeaderEntity();
		orderHeaderEntity.setReference(reference);
		orderHeaderEntity.setActive(true);
		orderHeaderEntity.setAmount(dto.getAmount());
		orderHeaderEntity.setCreated_by(Long.parseLong(dto.getCreate_by()));
		orderHeaderEntity.setCreated_on(new Date());
		
		OrderHeaderEntity hasilOrderHeader = ohr.save(orderHeaderEntity);
		
		//Insert Multiple Detail
		List<OrderDetailEntity> orderDetailEntityList = new ArrayList<>();
		
		for (OrderDetailDTO orderDetailDTO: dto.getListOrderDetail()) {
			OrderDetailEntity orderDetailEntity = new OrderDetailEntity();
			orderDetailEntity.setHeaderId(hasilOrderHeader.getId());
			orderDetailEntity.setProductId(orderDetailDTO.getProductId());
			orderDetailEntity.setQuantity(orderDetailDTO.getQuantity());
			orderDetailEntity.setPrice(orderDetailDTO.getPrice());
			orderDetailEntity.setActive(true);
			orderDetailEntity.setCreated_by(Long.parseLong(orderDetailDTO.getCreate_by()	));
			orderDetailEntity.setCreated_on(new Date());
			
			orderDetailEntityList.add(orderDetailEntity);
		}
		
		odr.saveAll(orderDetailEntityList);
		
		return reference;
	}
}
