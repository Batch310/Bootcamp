package id.bootcamp.java310.dog_service.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.dog_service.services.MigrateDataFromDogAPI;

@RestController
public class DataMigrationController {

    private final MigrateDataFromDogAPI migrateDataFromDogAPI;

    public DataMigrationController(MigrateDataFromDogAPI migrateDataFromDogAPI) {
        this.migrateDataFromDogAPI = migrateDataFromDogAPI;
    }

    @GetMapping("/migrate-from-dog-api")
    public void migrateData() {
        migrateDataFromDogAPI.run();
    }
}
