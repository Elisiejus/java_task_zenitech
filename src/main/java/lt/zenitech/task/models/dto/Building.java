package lt.zenitech.task.models.dto;

import com.sun.istack.NotNull;

import javax.persistence.Id;
import java.math.BigDecimal;

public class Building {

    @Id
    @NotNull
    private Long id;

    private Person person;

    private Address address;

    private int size;

    private BigDecimal marketValue;

    private PropertyType propertyType;

    public Building(Long id, Address address, Person person, int size, BigDecimal marketValue, PropertyType propertyType) {
        this.id = id;
        this.address = address;
        this.person = person;
        this.size = size;
        this.marketValue = marketValue;
        this.propertyType = propertyType;
    }

    public Building() { }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() { return address; }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() { return person; }

    public void setPerson(Person person) { this.person = person; }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    public PropertyType getPropertyType() { return propertyType; }

    public void setPropertyType(PropertyType propertyType) { this.propertyType = propertyType; }
}
