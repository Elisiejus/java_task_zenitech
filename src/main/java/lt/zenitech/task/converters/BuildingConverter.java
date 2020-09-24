package lt.zenitech.task.converters;

import static java.util.stream.Collectors.toList;

import lt.zenitech.task.models.dto.Address;
import lt.zenitech.task.models.dto.Building;
import lt.zenitech.task.models.entities.BuildingEntity;
import lt.zenitech.task.repositories.BuildingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuildingConverter {

    private AddressConverter addressConverter;
    private BuildingRepository buildingRepository;
    private PersonConverter personConverter;

    public BuildingConverter(AddressConverter addressConverter, BuildingRepository buildingRepository, PersonConverter personConverter) {
        this.addressConverter = addressConverter;
        this.buildingRepository = buildingRepository;
        this.personConverter = personConverter;
    }

    public BuildingEntity convertToEntity(Building building) {
        BuildingEntity result;
        if (building.getId() == null) {
            result = new BuildingEntity();
        } else {
            result = buildingRepository.findById(building.getId());
        }
        result.setAddress(addressConverter.convertToEntity(building.getAddress()));
        result.setMarketValue(building.getMarketValue());
        result.setPersonEntity(personConverter.convertToEntity(building.getPerson()));
        result.setPropertyType(building.getPropertyType());
        result.setSize(building.getSize());

        return result;
    }

    public Building convert(BuildingEntity buildingEntity) {
        if (buildingEntity == null) {
            return null;
        }
        Building result = new Building();
        result.setId(buildingEntity.getId());
        result.setAddress(addressConverter.convert(buildingEntity.getAddress()));
        result.setMarketValue(buildingEntity.getMarketValue());
        result.setPerson(personConverter.convert(buildingEntity.getPersonEntity()));
        result.setSize(buildingEntity.getSize());
        result.setPropertyType(buildingEntity.getPropertyType());
        return result;
}

    public List<Building> convert(List<BuildingEntity> buildingEntities) {
        return buildingEntities.stream().map(this::convert).collect(toList());
    }

}



