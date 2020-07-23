package lt.zenitech.task.services;

import lt.zenitech.task.converters.AddressConverter;
import lt.zenitech.task.models.dto.Address;
import lt.zenitech.task.models.entities.AddressEntity;
import lt.zenitech.task.repositories.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressConverter addressConverter;
    private final AddressRepository addressRepository;

    public AddressService(AddressConverter addressConverter, AddressRepository addressRepository) {
        this.addressConverter = addressConverter;
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        List<AddressEntity> addressEntities = addressRepository.findAll();
        return addressConverter.convert(addressEntities);
    }
    public Address save (Address address) {
        AddressEntity addressEntity = addressConverter.convertToEntity(address);
        AddressEntity result = addressRepository.save(addressEntity);

        return addressConverter.convert(result);
    }

}
