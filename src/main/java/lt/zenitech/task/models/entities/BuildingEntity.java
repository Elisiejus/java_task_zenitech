package lt.zenitech.task.models.entities;

import lt.zenitech.task.models.dto.PropertyType;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

import java.math.BigDecimal;

@Entity
@Table(name = "building")
public class BuildingEntity extends AbstractEntity {

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JoinColumn(name = "address_id", nullable = false)
    private AddressEntity address;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "person_id", nullable = false)
    private PersonEntity person;

    @Column(name = "size", nullable = false)
    private int size;

    @Column(name = "market_value", nullable = false)
    private BigDecimal marketValue;

    @Column(name = "property_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PropertyType propertyType;

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) { this.address = address; }

    public PersonEntity getPersonEntity() { return person; }

    public void setPersonEntity(PersonEntity personEntity) { this.person = personEntity; }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    public BigDecimal getMarketValue() { return marketValue; }

    public void setMarketValue(BigDecimal marketValue) { this.marketValue = marketValue; }

    public PropertyType getPropertyType() { return propertyType; }

    public void setPropertyType(PropertyType propertyType) { this.propertyType = propertyType; }

}

