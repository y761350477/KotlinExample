public class PersonClass {
    private final String name;
    private Boolean isMarried;

    public PersonClass(String name, Boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public Boolean getMarried() {
        return isMarried;
    }

    public void setMarried(Boolean married) {
        isMarried = married;
    }
}
