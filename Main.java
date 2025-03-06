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
                running = false;
            }
        }
    }
}
