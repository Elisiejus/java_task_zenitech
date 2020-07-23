package lt.zenitech.task.services;

import lt.zenitech.task.converters.CityConverter;
import lt.zenitech.task.models.dto.City;
import lt.zenitech.task.models.entities.CityEntity;
import lt.zenitech.task.repositories.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityConverter cityConverter;
    private final CityRepository cityRepository;

    public CityService(CityConverter cityConverter, CityRepository cityRepository) {
        this.cityConverter = cityConverter;
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        List<CityEntity> cityEntities = cityRepository.findAll();
        return cityConverter.convert(cityEntities);
    }

    public City save(City city) {
        CityEntity cityEntity = cityConverter.convertToEntity(city);
        CityEntity result = cityRepository.save(cityEntity);

        return cityConverter.convert(result);
    }
}
