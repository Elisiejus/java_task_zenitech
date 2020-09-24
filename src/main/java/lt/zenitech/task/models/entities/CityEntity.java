package lt.zenitech.task.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "city")
public class CityEntity extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "city", orphanRemoval = true)
    private Set<AddressEntity> addressEntity = new HashSet<>();

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Set<AddressEntity> getAddressEntity() { return addressEntity; }

    public void setAddressEntity(Set<AddressEntity> addressEntity) { this.addressEntity = addressEntity; }
}
