package lt.zenitech.task.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class PersonEntity extends AbstractEntity {

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "last_name", nullable = false, length = 50)
    private String last_name;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "person")
    private Set<BuildingEntity> buildingEntity = new HashSet<>();

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public Set<BuildingEntity> getBuildingEntity() { return buildingEntity; }

    public void setBuildingEntity(Set<BuildingEntity> buildingEntity) {
        this.buildingEntity = buildingEntity;
    }
}
