package lt.zenitech.task.converters;

import lt.zenitech.task.models.dto.Address;
import lt.zenitech.task.models.entities.AddressEntity;
import lt.zenitech.task.repositories.AddressRepository;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class AddressConverter {

    private final CityConverter cityConverter;

    public AddressConverter(CityConverter cityConverter) {
        this.cityConverter = cityConverter;
    }

    public AddressEntity convertToEntity(Address address) {
        if (address == null) {
            return null;
        }

        AddressEntity result = new AddressEntity();
        result.setId(address.getId());
        result.setStreet(address.getStreet());
        result.setNumber(address.getNumber());
        result.setCity(cityConverter.convertToEntity(address.getCity()));

        return result;
    }

    public List<Address> convert(List<AddressEntity> addressEntities) {
        return addressEntities.stream().map(this::convert).collect(toList());
    }

    public Address convert(AddressEntity address) {

        if (address == null) {
            return null;
        }
        Address result = new Address();
        result.setId(address.getId());
        result.setStreet(address.getStreet());
        result.setNumber(address.getNumber());
        result.setCity(cityConverter.convert(address.getCity()));

        return result;
    }
}

