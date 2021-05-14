import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int accAmount = 100; // Сумма на счету
        int enominator = 100; // Делитель для рассчета бонуса
        int bonus;
        int less = 200; // С чем сравниваем
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму пополнения в рублях: ");
        int refill = in.nextInt();
        int accAmountTarget;
        accAmountTarget = refill + accAmount;
        in.close();
        bonus = refill / enominator;
        if (accAmountTarget <= less) {
            System.out.println("Ваш счет равен: " + accAmountTarget);
            System.out.println("Бонус не начисляется");
        } else {
            System.out.println("Ваш счет в рублях равен: " + (bonus + accAmountTarget));
            System.out.println("Из них бонусные рубли: " + bonus);
        }

    }
}
