public class Main {
    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            Library librarby = new Library();
            librarby.addItem("Among Us");
            librarby.addItem("Among Us 2");
            librarby.removeItem("Among Us");
            System.out.println(librarby.popTopItem().getName());

            running = false;
        }
    }
}
