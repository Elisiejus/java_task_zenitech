package lt.zenitech.task.models.dto;

public class Address {

    private Long id;
    private String street;
    private int number;
    private City city;

    public Address(Long id, String street, int number, City city) {
        this.street = street;
        this.number = number;
        this.id = id;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() { return street; }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public City getCity() { return city; }

    public void setCity(City city) { this.city = city; }
}
