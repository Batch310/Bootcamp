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

import com.fasterxml.jackson.annotation.JsonInclude;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.VariantService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
@RequestMapping("api/variant")
public class VariantRestControllers {

	@Autowired
	private VariantService vs;
	
	@GetMapping("/get")
	public Resp<List<VariantDTO>> getAll(){
		
		int code =200;
		String message = "Sukses";
		List<VariantDTO> data = vs.getAllVariants();
		
		Resp<List<VariantDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		

		return response;
				
	}
	
	@PostMapping("/insert")
	public Resp<Long>  insertVariant(@RequestBody VariantDTO vro) {
		
		try {
			int code =200;
			String message = "Varian berhasil ditambahkan";
			Long data = vs.insert(vro);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(data);
			

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); //"11- err"
			String[] split = exceptionMessage.split("-"); //memisahkan pesan "11 - initial sudah dipakai"
			int code = Integer.parseInt(split[0]); //11
			String message = split[1];//"Initial sudah dipakai"
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
		
		
		
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@PutMapping ("/update")
	public Resp<Long> updateVariant(@RequestBody VariantDTO vro) {
		
	
		
		try {
			int code =200;
			String message = "Varian berhasil diubah";
			vs.update(vro);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			

			return response;
			
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); //"11- err"
			String[] split = exceptionMessage.split("-"); //memisahkan pesan "11 - initial sudah dipakai"
			int code = Integer.parseInt(split[0]); //11
			String message = split[1];//"Initial sudah dipakai"
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
		
		
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@DeleteMapping ("/delete")
	public Resp<Long> deleteVariant(@RequestParam("id") Long id) {
		
		try {
			int code =200;
			String message = "Varian berhasil dihapus";
			vs.delete(id);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); //"11- err"
			String[] split = exceptionMessage.split("-"); //memisahkan pesan "11 - initial sudah dipakai"
			int code = Integer.parseInt(split[0]); //11
			String message = split[1];//"Initial sudah dipakai"
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
		
		
		
	}
	
}
