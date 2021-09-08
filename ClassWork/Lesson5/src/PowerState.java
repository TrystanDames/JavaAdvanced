public enum PowerState {
    ON("The power usage is high"),
    OFF("The power is off"),
    SUSPEND("The power surge is low");

    private String description;
    private PowerState(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }
}
