package id.bootcamp.java310.pos.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.repositories.BiodataRepository;

@Service
public class BiodataService {

	@Autowired
	private BiodataRepository br;
	
	
	public ProfileDTO getProfile(Long user_id) {
		
		ProfileDTO getProfile = br.getProfile(user_id);
		
		return getProfile;
	}
	
	//proses menentukan lokasi file upload 
	public String upload(MultipartFile file, Long userId) { //multipart file, tipe data digunakan untuk mengirim file
		String absolutePath = new FileSystemResource("").getFile().getAbsolutePath();
		absolutePath += "\\uploads\\";
		
		String fileName = userId + ".jpg"; // membuat nama file menggunakan id dari user
		
		Path path = Paths.get(absolutePath+fileName); // menggabungkan lokasi dan nama file
		
		//mengganti file 
		try {
			Files.copy(file.getInputStream(),path, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//membuat url akses upload
		String hasilUpload = ServletUriComponentsBuilder
				.fromCurrentContextPath()
				.path("/images/")
				.path(fileName)
				.toUriString();
		
		Long biodataId = br.getBiodataIdFromuserId(userId);
		br.upload(hasilUpload, biodataId);
		
		return hasilUpload;
	}
	
}
