public class Account {

    private int value;

    public Account(int value) {
        this.value = value;
    }

     public int withdraw(int toWithdraw) {
         System.out.println("Jestem w środku" + Thread.currentThread().getId());
//mąż i żona wypłacają pieniądze z konta jednocześnie
        if (value >= toWithdraw) {
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
            }

            value -= toWithdraw;
            return toWithdraw;
        } else {
            return 0;
        }
    }
}
