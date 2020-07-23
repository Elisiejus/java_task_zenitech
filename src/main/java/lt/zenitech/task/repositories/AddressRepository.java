package lt.zenitech.task.repositories;

import lt.zenitech.task.models.entities.AddressEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AddressRepository extends Repository<AddressEntity, Long> {

    List<AddressEntity> findAll();

    AddressEntity findById(Long id);

    AddressEntity save(AddressEntity addressEntity);

}
