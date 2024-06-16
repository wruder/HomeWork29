import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество вкладов");
        int numDeposits = scanner.nextInt();

        List<Deposit> deposits = new ArrayList<>();
        // ввод данных о вкладах пользователя
        for (int i = 0; i < numDeposits; i++) {
            System.out.println("\nВведите данные для вклада" + (i + 1) + ":");
            System.out.println("сумма вклада:");
            double amount = scanner.nextDouble();
            System.out.println("процентная ставка");

            double interestRate = scanner.nextInt();

            System.out.println("срок вклада в месяцах");
            int months = scanner.nextInt();

            //добавление в список обьекта вклада

            Deposit deposit = new Deposit(amount,interestRate, months);
            deposits.add(deposit);
            scanner.nextLine();
        }
        System.out.println("данные о вкладах и доходе");
        for (Deposit deposit : deposits)
        {
            System.out.println(deposit);
            double earnings = deposit.calculatorEarnings();
            System.out.println("доход от вклада:" + earnings);
        }

    }

}
