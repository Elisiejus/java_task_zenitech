package lt.zenitech.task.converters;

import lt.zenitech.task.models.dto.City;
import lt.zenitech.task.models.entities.CityEntity;
import lt.zenitech.task.repositories.CityRepository;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class CityConverter {

    private final CityRepository cityRepository;

    public CityConverter(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public CityEntity convertToEntity(City city) {
        CityEntity result;
        if (city.getId() == null) {
            result = new CityEntity();
        } else {
            result = cityRepository.findById(city.getId());
        }
        result.setName(city.getName());

        return result;
    }

    public List<City> convert(List<CityEntity> cityEntities) {
        return cityEntities.stream().map(this::convert).collect(toList());
    }

    public City convert(CityEntity city) {
        return new City(
                city.getId(),
                city.getName()
        );
    }
}
