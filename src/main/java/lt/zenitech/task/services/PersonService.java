package lt.zenitech.task.services;

import lt.zenitech.task.converters.PersonConverter;
import lt.zenitech.task.models.dto.Person;
import lt.zenitech.task.models.entities.PersonEntity;
import lt.zenitech.task.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonConverter personConverter;
    private final PersonRepository personRepository;

    public PersonService(PersonConverter personConverter, PersonRepository personRepository) {
        this.personConverter = personConverter;
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        List<PersonEntity> personEntities = personRepository.findAll();
        return personConverter.convert(personEntities);
    }
}
