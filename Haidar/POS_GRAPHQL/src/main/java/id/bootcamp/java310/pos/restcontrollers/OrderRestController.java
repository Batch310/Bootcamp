package id.bootcamp.java310.pos.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.OrderHeaderDTO;
import id.bootcamp.java310.pos.services.OrderService;	
import id.bootcamp.java310.pos.utils.Responses;

@RestController
@RequestMapping("api/order")
public class OrderRestController {
	
	@Autowired
	private OrderService os;
	
	@PostMapping("/insert")
	public Responses<String> insertOrder(@RequestBody OrderHeaderDTO dto){
		Responses<String> response = new Responses<>();
		response.setCode(200);
		response.setMessage("Sukses");
		response.setData(os.insertOrder(dto));
		
		return response;
	}
	
}
