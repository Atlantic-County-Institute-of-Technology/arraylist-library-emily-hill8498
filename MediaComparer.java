import java.util.Comparator;

public class MediaComparer implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
