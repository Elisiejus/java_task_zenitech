package lt.zenitech.task.models.dto;

import com.sun.istack.NotNull;

import javax.persistence.Id;

public class Person {

    @Id
    @NotNull
    private Long id;
    private String name;
    private String last_name;

    public Person(Long id, String name, String last_name) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }
}
