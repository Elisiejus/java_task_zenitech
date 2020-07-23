package lt.zenitech.task.repositories;

import lt.zenitech.task.models.entities.BuildingEntity;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface BuildingRepository extends Repository<BuildingEntity, Long> {

    List<BuildingEntity> findAll();

    BuildingEntity findById(Long id);

    BuildingEntity save(BuildingEntity buildingEntity);

    void deleteOneById(Long id);

}

