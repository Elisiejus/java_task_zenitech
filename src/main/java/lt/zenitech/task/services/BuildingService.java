package lt.zenitech.task.services;

import lt.zenitech.task.converters.BuildingConverter;
import lt.zenitech.task.models.dto.Building;
import lt.zenitech.task.models.entities.BuildingEntity;
import lt.zenitech.task.repositories.BuildingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BuildingService {

    private final BuildingRepository buildingRepository;
    private final BuildingConverter buildingConverter;

    public BuildingService(BuildingRepository buildingRepository, BuildingConverter buildingConverter) {
        this.buildingRepository = buildingRepository;
        this.buildingConverter = buildingConverter;
    }

    public List<Building> getAllBuildings() {
        List<BuildingEntity> buildingEntities = buildingRepository.findAll();
        return buildingConverter.convert(buildingEntities);
    }

    public Building getBuilding(Long id) {
        BuildingEntity buildingEntity = buildingRepository.findById(id);

        return buildingConverter.convert(buildingEntity);
    }

    public Building save(Building building) {
        BuildingEntity buildingEntity = buildingConverter.convertToEntity(building);
        BuildingEntity result = buildingRepository.save(buildingEntity);

        return buildingConverter.convert(result);
    }
    @Transactional
    public void delete (Long id) {
        buildingRepository.deleteOneById(id);
    }
}
