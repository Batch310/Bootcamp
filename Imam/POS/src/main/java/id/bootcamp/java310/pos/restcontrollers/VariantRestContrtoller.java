package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.VariantService;
import id.bootcamp.java310.pos.utills.Resp;

@RestController
@RequestMapping("/api/variant")
public class VariantRestContrtoller {

	@Autowired
	private VariantService vs;
	
	//READ
	@GetMapping("/get")
	public Resp<List<VariantDTO>> getAllku(){
		
		//Mengemas Response API
				int code = 200;
				String message = "Sukses";
				List<VariantDTO> data = vs.getAllku();
				
				Resp<List<VariantDTO>> response = new Resp<>();
				response.setCode(code);
				response.setMessage(message);
				response.setData(data);
			
				return response;
		//return vs.getAll();	
	}
	
	//INSERT
	@PostMapping("/insert")
	public Resp<Long> insertVariant(@RequestBody VariantDTO dto) {
		
	
		try {
			//Mengemas Response API
			int code = 200;
			String message = "Variant berhasil Ditambahkan";
			Long data = vs.insertVar(dto);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(data);
		
			return response; 

		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-Message error"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;

		}
		
		
		
		
		
		
		
		
	}
	
	//UPDATE
	@PutMapping("/update")
	public Resp<Long> updateVariant(@RequestBody VariantDTO dto) {
		
		try {

			//Mengemas Response API
			int code = 200;
			String message = "Variant berhasil diubah";
			
			//Jangan lupa dipanggil!!!
			vs.updateVar(dto);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
		
			return response; 

		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-Message error"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;

		}

		
		
		
		
	}
	
	//DELETE
	@DeleteMapping("/delete")
	public Resp<Long> deleteVariant(@RequestParam("id")Long id) {
		
	 	
		
		try {
			//Mengemas Response API
			int code = 200;
			String message = "Variant berhasil dihapus";
			
			//Jangan lupa dipanggil!!!
			vs.deleteVar(id);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
		
			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-Message error"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;

		}
		
		
		
		
		
		
		
	}
}
