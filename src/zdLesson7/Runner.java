package zdLesson7;

public class Runner {
    public static void main(String[] args) {
        Bank client1 = new Bank(Client.Fiz, 2);
        Bank client2 = new Bank(Client.Fiz, 5);
        Bank client3 = new Bank(Client.Yr, 3);
        Bank client4 = new Bank(Client.Yr, 0);

        client1.toString();
        client1.vero9tn();
        client2.vero9tn();
        client3.vero9tn();
        client4.vero9tn();

    }

}
