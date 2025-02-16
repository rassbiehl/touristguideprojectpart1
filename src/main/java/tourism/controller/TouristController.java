package tourism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/attractions")

public class TouristController {
    private final TouristService touristService;

    @Autowired
    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping
    public String getAttractions(@RequestParam(value = "search", required = false) String search, Model model) {
        List<TouristAttraction> filteredAttractions = new ArrayList<>(touristService.getFirstAttractions()); /* by standard it's the first
        10 attractions that will be shown on the html side. */

        if (search != null && !search.isEmpty()) { // if the search bar is not empty the html file will search for what contains search-url-attribute
            filteredAttractions.clear();
            for (TouristAttraction attraction : touristService.getAllAttractions()) {
                if (attraction.getName().toLowerCase().contains(search.toLowerCase())) {
                    filteredAttractions.add(attraction);
                }
            }
        }
        model.addAttribute("attractions", filteredAttractions);
        return "attractions";

    }

    @GetMapping("/viewattraction/{name}")
    public String getAttractionByName(@PathVariable String name, Model model) {
        Optional<TouristAttraction> foundAttraction = touristService.getAttractionByName(name);

        if (foundAttraction.isPresent()) {
            model.addAttribute("viewAttraction", foundAttraction.get());
        } else {
            model.addAttribute("errorMessage", "Attraction not found");
        }

        return "viewAttraction"; // Loads viewAttraction.html
    }

    @PostMapping("/add")
    public String addAttraction(@ModelAttribute TouristAttraction newAttraction) {
        touristService.addAttraction(newAttraction);
        return "redirect:/attractions#attractions";
    }
    @GetMapping("/addattraction")
    public String getAddAttraction() {
        return "addattraction";
    }


    @PostMapping("/delete/{name}")
    public String deleteAttraction(@PathVariable String name, RedirectAttributes redirectAttributes) {
        boolean x = touristService.deleteAttraction(name);

        if (x) {
            redirectAttributes.addFlashAttribute("message", name + " has been successfully deleted.");
        } else {
            redirectAttributes.addFlashAttribute("message", name + " could not be found and has not been deleted.");
        }

        return "redirect:/attractions#attractions";
    }


    @PostMapping("/update/{name}")
    public String updateAttraction(@PathVariable String name, @ModelAttribute TouristAttraction updatedAttraction, RedirectAttributes redirectAttributes) {
        boolean updated = touristService.updateAttraction(name, updatedAttraction.getName(), updatedAttraction.getDescription());

        redirectAttributes.addFlashAttribute("updated", updated);

        if (updated) {
            redirectAttributes.addFlashAttribute("message", name + " is updated to: " + updatedAttraction.getName());
            return "redirect:/attractions/viewattraction/" + updatedAttraction.getName();
        } else {
            redirectAttributes.addFlashAttribute("message", "Attraction was not updated. Use letters and not symbols.");
            return "redirect:/attractions/viewattraction/" + name;
        }
    }
}