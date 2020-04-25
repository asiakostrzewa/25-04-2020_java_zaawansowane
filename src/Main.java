import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Account shared = new Account(1000);
        AccountHolder wife = new AccountHolder("Małgosia", shared);
        AccountHolder husband = new AccountHolder("Jaś", shared);

        //oboje mąż i żona chcą wypłacić 1000 zł jednocześnie

        List<AccountHolder> holders = new ArrayList<>();
        holders.add(wife);
        holders.add(husband);

        //właściciel konta będzie próbował wypłacić 1000 zł
        for (AccountHolder holder : holders) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    int withdraw = holder.withdraw(1000);
                    System.out.println(holder.getName() + " " + withdraw + " " + Thread.currentThread().getId());
                }
            });
            t.start();
        }
    }
}
