package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.utils.Pagination;
import id.bootcamp.java310.pos.utils.Resp;
import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("api/category") // mapping URL secara umum
public class CategoryRestControllers {
	
	@Autowired
	private CategoryService cs;
 
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@GetMapping("/get")
	public Resp<List<CategoryDTO>> getAll(){ //Resp digunakan untuk mengemas pesan untuk code, message
		//Mengemas respons API
		int code =200;
		String message = "Sukses";
		List<CategoryDTO> data = cs.getAllCategories();
		
		Resp<List<CategoryDTO>> response = new Resp<>(); // untuk dilakukan return karena tipe data sudah sama dengan fungsi
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		

		return response;
		//Cara 1 dan 2
		//return cs.getAllCategories();
		
		//Cara 3 
		//return cs.getAll3();
		
		//Cara 4
		//return cs.getall4();
	}
	
	@GetMapping("/search")
	public Resp<List<CategoryDTO>> search(@RequestParam("keyword") String keyword){ //Resp digunakan untuk mengemas pesan untuk code, message
		//Mengemas respons API
		int code =200;
		String message = "Sukses";
		List<CategoryDTO> dataSearch = cs.search(keyword);
		
		Resp<List<CategoryDTO>> responseSearch = new Resp<>(); // untuk dilakukan return karena tipe data sudah sama dengan fungsi
		responseSearch.setCode(code);
		responseSearch.setMessage(message);
		responseSearch.setData(dataSearch);
		

		return responseSearch;
	}
	
	//Pagination
	@GetMapping("/pagination")
	public Resp<Pagination<List<CategoryDTO>>> pagination(@Param ("keyword") String keyword, @Param ("limit") int limit, @Param ("offset")  int page){ //Resp digunakan untuk mengemas pesan untuk code, message
		//Mengemas respons API
		int code =200;
		String message = "Sukses";
		Pagination<List<CategoryDTO>> data = cs.pagination(keyword,limit,page);
		
		Resp<Pagination<List<CategoryDTO>>> response = new Resp<>(); // untuk dilakukan return karena tipe data sudah sama dengan fungsi
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		

		return response;
	}
	
	
	@PostMapping("/insert")
	public Resp<Long>  inserCategory(@RequestBody CategoryDTO dto) {
		//try cathc untuk menerima throw dari service
		try {
			int code =200;
			String message = "Category Sukses Ditambahkan";
			Long data = cs.insert1(dto);
			
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
		
		
		//Cara INSERT 1 
		//return cs.insert1(dto);
		//Cara INSERT 2
		//Long hasil = cs.insert2(dto);
		//return hasil;
		//return cs.insert2(dto);
	}
	
	//localhost/api/category/update
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@PutMapping ("/update")
	public  Resp<Long> updateCategory(@RequestBody CategoryDTO dto) {
		try {
			int code =200;
			String message = "Data Sukses diubah";
			cs.update(dto); //perintah update harus dipanggil
			
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
		
		//cs.update(dto);
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	@DeleteMapping ("/delete")
	public Resp<Long> deleteCategory(@RequestParam("id") Long id) {
		try {
			int code =200;
			String message = "Data Sukses Dihapus";
			cs.delete(id); //perintah update harus dipanggil
			
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
