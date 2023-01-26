package id.bootcamp.java310.pos.services;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.repositories.BiodataRepository;

@Service
public class BiodataService {
	@Autowired
	private BiodataRepository br;

	public ProfileDTO profile(Long userId) {

		ProfileDTO dataProfile = br.profile(userId);
		return dataProfile;
	}

	public String upload(MultipartFile file, Long userId) {
		String absolutePath = new FileSystemResource("").getFile().getAbsolutePath();		
		absolutePath += "\\uploads\\";
		
		String fileName = userId + ".jpg";
		Path path = Paths.get(absolutePath + fileName);
		
		try {
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		String hasilUpload = ServletUriComponentsBuilder
				.fromCurrentContextPath()
				.path("/image/")
				.path(fileName)
				.toUriString();
		
		Long biodataId = br.getbiodataIdFromUserId(userId);
		br.upload(hasilUpload,biodataId);
		
		return hasilUpload;
	}
}
