package id.bootcamp.java310.pos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.repositories.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository mr;
	
	public List<MenuDTO> getMenu(String roleCode){
		return mr.getMenu(roleCode);
	}
}
