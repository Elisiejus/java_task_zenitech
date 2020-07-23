package lt.zenitech.task.models.dto;

public enum PropertyType {

    APARTMENT("APARTMENT"),

    HOUSE("HOUSE"),

    INDUSTRIAL("INDUSTRIAL"),

    COMMERCIAL("COMMERCIAL");

    private String value;

    PropertyType(String value) { this.value = value; }
}
