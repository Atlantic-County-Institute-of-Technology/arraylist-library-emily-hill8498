// media class because we may want to store more data about a media piece than just it's name
public class Media {
    private String name;
    public Media(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
