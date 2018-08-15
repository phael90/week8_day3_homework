package models;

public enum LevelType {
    VICKERWEAVING("Wicker weaving"),
    SWIMMING("Ultimate swimming"),
    FERRETWHISPERING("Ferret whispering");

    private final String name;
    LevelType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
