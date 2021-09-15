public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        int account = 100;
        int add = 1100;
        int totalBonus = 0;
        int finalAccount = add+account;
        if (add > 1000) {
            totalBonus = add/100;
        }
        System.out.println (totalBonus);
        System.out.println(finalAccount);
    }
}
