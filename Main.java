public class Main {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            Library librarby = new Library();
            librarby.addItem("Bmong Us");
            librarby.addItem("Among Us 2");
            librarby.sortAlphabet();
            System.out.println(librarby.toString());

            running = false;
        }
    }
}
