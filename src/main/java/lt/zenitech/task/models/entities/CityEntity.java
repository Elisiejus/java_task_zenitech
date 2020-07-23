package lt.zenitech.task.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "city")
public class CityEntity extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "city", orphanRemoval = true)
    private List<AddressEntity> addressEntity = new ArrayList<>();

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<AddressEntity> getAddressEntity() { return addressEntity; }

    public void setAddressEntity(List<AddressEntity> addressEntity) { this.addressEntity = addressEntity; }
}
