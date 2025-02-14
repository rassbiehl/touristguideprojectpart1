package tourism.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    @Autowired

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }


    public void addAttraction(TouristAttraction attraction) {
        touristRepository.addAttraction(attraction);
    }

    // Get all attractions
    public List<TouristAttraction> getAllAttractions() {
        return touristRepository.getAllAttractions();
    }

    // Get first 10 attractions
    public List<TouristAttraction> getFirstAttractions() {
        return touristRepository.getFirstAttractions();
    }

    //delete an attraction
    public boolean deleteAttraction(String name) {
        return touristRepository.deleteAttraction(name);
    }

    //get attraction by name
    public Optional<TouristAttraction> getAttractionByName(String name) {
        return touristRepository.getAttractionByName(name);
    }

    //update an attraction with new name and description by finding it with the name.
    public boolean updateAttraction(String name, String newName, String newDescription) {
        return touristRepository.updateAttraction(name, newName, newDescription);
    }

}
