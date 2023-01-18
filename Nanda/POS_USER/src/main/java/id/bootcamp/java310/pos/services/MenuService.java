package id.bootcamp.java310.pos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.repositories.MenuRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository mr;
	
	public List<MenuDTO> menuBar(String roleCode) {
		List<MenuDTO> menuBar = mr.menuBar(roleCode);
		return menuBar;
	}
	
}
