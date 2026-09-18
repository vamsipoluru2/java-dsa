public class User {
    public static void main(String[] args) {
        Guest g = new Guest();
        g.read();

        Devloper d = new Devloper();
        d.read();
        d.write();

        Admin a = new Admin();
        a.read();
        a.write();
        a.execute();
    }
}
