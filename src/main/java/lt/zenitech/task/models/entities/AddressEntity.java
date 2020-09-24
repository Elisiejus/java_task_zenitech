package lt.zenitech.task.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity extends AbstractEntity{

    @Column(name = "street", length = 50, nullable = false)
    private String street;

    @Column(name = "number", nullable = false)
    private int number;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private CityEntity city;

    @OneToOne(mappedBy = "address")
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
