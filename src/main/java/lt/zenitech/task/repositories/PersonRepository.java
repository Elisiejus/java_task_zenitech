package lt.zenitech.task.repositories;

import lt.zenitech.task.models.entities.PersonEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<PersonEntity, Long> {

    List<PersonEntity> findAll();

}
