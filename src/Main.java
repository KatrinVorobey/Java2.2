public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        int bonus;
        if (payment > 1000)
            bonus = payment / 100;
        else
            bonus = 0;
        int sum = balance + payment + bonus;
        System.out.println("The sum is: " + sum);
        System.out.println("The bonus is: " + bonus);
    }
}
