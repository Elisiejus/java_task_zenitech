package lt.zenitech.task.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity extends AbstractEntity{

    @Column(name = "street", length = 50, nullable = false)
    private String street;

    @Column(name = "number", nullable = false)
    private int number;

//    @JsonIgnore
//    @MapsId
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @OneToOne(cascade = {CascadeType.ALL}, mappedBy = "address", orphanRemoval = true)
    private BuildingEntity building;

    public BuildingEntity getBuilding() { return building; }

    public void setBuilding(BuildingEntity building) { this.building = building; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public CityEntity getCity() { return city; }

    public void setCity(CityEntity city) { this.city = city; }
}
