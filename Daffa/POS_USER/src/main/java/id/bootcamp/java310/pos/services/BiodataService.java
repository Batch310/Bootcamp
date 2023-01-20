package id.bootcamp.java310.pos.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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
		ProfileDTO profile = br.profile(user_id);
		return profile;
	}

	public String upload(MultipartFile file, Long userId) {
		String absolutePath = new FileSystemResource("").getFile().getAbsolutePath();
		absolutePath += "\\uploads\\";

		String fileName = userId + ".jpg";
		Path path = Paths.get(absolutePath + fileName);
		
		try {
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String hasilUnggah = ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(fileName).toUriString();
		
		Long biodataId = br.getBiodataIdFromUserId(userId);
		
		br.upload(hasilUnggah, biodataId);
		
		return hasilUnggah;
	}
}
