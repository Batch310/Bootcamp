package id.acc.landingpage.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.acc.landingpage.dto.BrandDTO;
import id.acc.landingpage.dto.TypeDTO;
import id.acc.landingpage.repositories.BrandRepository;
import id.acc.landingpage.repositories.TypeRepository;



@Service
public class TypeService {

	@Autowired // Mempermudah koneksi ke repository
	private TypeRepository tr;
	
	public List<TypeDTO> getAllType(){
		return tr.getAllType();
	}

}
