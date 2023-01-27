package id.bootcamp.java310.dogservice.services;

import id.bootcamp.java310.dogservice.entities.Breeds;
import id.bootcamp.java310.dogservice.entities.DogImages;
import id.bootcamp.java310.dogservice.repositories.BreedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServices {

    public List<DogImages> returnOddSizeOfImages(List<DogImages> dogImages) {
        int sizes = dogImages.size();
        if (sizes == 0) return dogImages;
        if (sizes % 2 == 0) return dogImages.subList(0, sizes - 1);
        return dogImages;
    }

}
