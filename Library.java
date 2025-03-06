import java.util.ArrayList;
import java.util.Random;

public class Library {
    ArrayList<Media> media_library = new ArrayList<Media>();

    public Library() {
        return;
    }

    public void addItem(Media item) {
        media_library.addLast(item);
    }

    public void addItem(String item) {
        media_library.addLast(new Media(item));
    }

    public void removeItem(String item) {
        int index = indexOf(item);
        if (index >= 0) {
            media_library.remove(index);
        }
    }

    public Media popTopItem() {
        Media item = media_library.getFirst();
        media_library.removeFirst();
        return item;
    }

    public Media readTopItem() {
        return media_library.getFirst();
    }

    public void shuffle() {
        Random rand = new Random();         // modern fisher-yates implemented from wikipedia (https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#The_modern_algorithm)
        for (int i=media_library.size()-1; i>0; i--) {
            int randIndex = rand.nextInt(i);
            Media storedMedia = media_library.get(i);
            media_library.set(i, media_library.get(randIndex));
            media_library.set(randIndex, storedMedia);
        }
    }

    private int indexOf(String item_name) { //need this function to look up index by name
        for (int i = 0; i < media_library.size(); i++) {
            if (media_library.get(i).getName().equals(item_name)) {
                return i;
            }
        }
        return -1; // return -1 if item not found
    }
}
