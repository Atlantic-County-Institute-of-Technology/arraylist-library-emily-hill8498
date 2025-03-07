import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        Library library = new Library();
        while (running) {
            System.out.println("Media Library:\n1. Play Media\n2. Skip Next Media\n3. Add Media\n4. Remove Media\n5. Sort Media Alphabetically\n6. Shuffle Media\n7. Find Media\n0. Quit");
            int choice = -1;
            while (!(choice >= 0 && choice <= 7)) { // while not valid menu option
                try { // i do not trust the user to type in a number
                    choice = new Scanner(System.in).nextInt();
                } catch (Exception e) {
                    choice = -1;
                }
            }
            switch (choice) {
                case 1 -> {
                    Media item = library.popTopItem();
                    if (item == null) {
                        System.out.println("Library is empty! Add some media.");
                        break;
                    }
                    System.out.print("Now playing: ");
                    System.out.println(item.getName());
                }
                case 2 -> {
                    Media item = library.popTopItem();
                    if (item == null) {
                        System.out.println("Library is empty! Add some media.");
                        break;
                    }
                    System.out.print("Skipped ");
                    System.out.println(item.getName());
                }
                case 3 -> {
                    System.out.print("Media Name: ");
                    String name = new Scanner(System.in).nextLine();
                    library.addItem(name);
                    System.out.println("Added " + name);
                }
                case 0 -> running = false;
            }

        }
    }
}
