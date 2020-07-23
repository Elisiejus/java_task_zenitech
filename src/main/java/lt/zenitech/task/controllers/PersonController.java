package lt.zenitech.task.controllers;

import lt.zenitech.task.models.dto.Person;
import lt.zenitech.task.services.PersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/persons")
public class PersonController {

    PersonService personService;

    public PersonController(PersonService personService) { this.personService = personService; }

    @GetMapping("/all")
    public List<Person> getAllPersons() { return personService.getAllPersons();}
}

