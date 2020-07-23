package lt.zenitech.task.converters;

import lt.zenitech.task.models.dto.Person;
import lt.zenitech.task.models.entities.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Component
public class PersonConverter {

    public PersonEntity convertToEntity (Person person) {
        if (person == null) {
            return null;
        }
        PersonEntity result = new PersonEntity();
        result.setName(person.getName());
        result.setLast_name(person.getLast_name());
        return result;
    }
    public List<Person> convert (List<PersonEntity> personEntities) {
        return personEntities.stream().map(this::convert).collect(toList());
    }
    public Person convert (PersonEntity person) {
        return new Person(
                person.getId(),
                person.getName(),
                person.getLast_name()

        );
    }

}
