package id.acc.landingpage.restcontrollers;

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

import id.acc.landingpage.dto.BrandDTO;
import id.acc.landingpage.entities.Brand;
import id.acc.landingpage.services.BrandService;
import id.acc.landingpage.utils.Resp;



@RestController
@RequestMapping("/api/brand") // Mapping URL secara umum
public class BrandRestControllers {

	@Autowired
	private BrandService bs;

	// localhost/api/category/get
	@GetMapping("/get")
	public Resp<List<BrandDTO>> getAllBrand() {
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<BrandDTO> data = bs.getAllBrand();
//		List<CategoryDTO> data = cs.getAll();

		Resp<List<BrandDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
		// Cara 1, 2

		// Cara 3
		// return cs.getAll3();

		// Cara 4, 5
		// return cs.getAll45();
	}

	

//	@GetMapping("/search")
//	public Resp<List<CategoryDTO>> search(@RequestParam("keyword") String keyword) {
//		int code = 200;
//		String message = "sukses";
//		List<CategoryDTO> dataSearch = cs.search(keyword.trim()); // trim " k e " -> "k e"
//		Resp<List<CategoryDTO>> responseSearch = new Resp<>();
//		responseSearch.setCode(code);
//		responseSearch.setMessage(message);
//		responseSearch.setData(dataSearch);
//
//		return responseSearch;
//
//	}

	
}
