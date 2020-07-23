package lt.zenitech.task.repositories;

import lt.zenitech.task.models.entities.CityEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CityRepository extends Repository<CityEntity, Long> {

    List<CityEntity> findAll();

    CityEntity findById(Long id);

    CityEntity save (CityEntity cityEntity);

}
