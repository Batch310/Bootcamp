package id.acc.landingpage.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.acc.landingpage.repositories.BrandRepository;
import id.acc.landingpage.repositories.PesananRepository;



@Service
public class PesananService {

	@Autowired // Mempermudah koneksi ke repository
	private PesananRepository pr;

	

	// Cara 4 & 5
//	public List<CategoryDTO> getAll4(){
//		//Cara 4
////		return cr.getAll4();
//		
//		//Cara 5
//		return cr.getAll5();
//	}
	
	

	// CREATE
	
	// Cara 2
//	public Long insert2(CategoryDTO dto) {
//		return cr.insert2(dto, new Date());
//	}

	
//	// Search
//	public List<CategoryDTO> search(String keyword) {
//		return cr.searchCategory(keyword);
//	}
//
//	// Pagination
//	public Pagination<List<CategoryDTO>> pagination(String keyword, int limit, int page) {
//		int totalData = cr.countTotalData(keyword);
//		
//		int offset = limit * (page-1);
//		List<CategoryDTO> data = cr.getPaginationCategory(keyword,limit,offset);
//		int itemPerPage = data.size();
//		
//		
//		Pagination<List<CategoryDTO>> pagination = 
//				new Pagination<>(totalData, page, itemPerPage, data);
//		 
//		return pagination;
//	}

}
