public class Main {
    public static void main(String[] args) {
        int expense = 100;
        int bonus;
        int replenishment = 1100;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int balance = expense + replenishment + bonus;
        System.out.println(balance);

    }
}