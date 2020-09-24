package lt.zenitech.task.controllers;

import lt.zenitech.task.models.dto.City;
import lt.zenitech.task.services.CityService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/all")
    public List<City> getAllCities() { return cityService.getAllCities(); }

    @PostMapping
    public City save (@RequestBody City city) { return cityService.save(city); }

}
