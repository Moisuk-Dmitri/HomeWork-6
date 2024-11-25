public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        double sumOfSavingsBank = 0;
        int monthNumber = 0;

        while (sumOfSavingsBank < 2459000) {
            sumOfSavingsBank += 15000;
            sumOfSavingsBank *= 1.01;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + sumOfSavingsBank + " рублей");
        }

        System.out.println("Task 2");

        int i = 0;
        while(i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 3");

        int population = 12_000_000;

        for (i = 0; i < 10; i++) {
            population += (17 * (population / 1000)) - (8 * (population / 1000));
            System.out.println("Год " + (i + 1) +", численность населения составляет " + population);
        }

        System.out.println("Task 4");

        sumOfSavingsBank = 15000;
        monthNumber = 0;

        while (sumOfSavingsBank < 12000000) {
            monthNumber++;
            sumOfSavingsBank *= 1.07;
            System.out.printf("Месяц %s, сумма накоплений равна %8.15f рублей\n", monthNumber, sumOfSavingsBank);
        }

        System.out.println("Task 5");

        sumOfSavingsBank = 15000;
        monthNumber = 0;

        while (sumOfSavingsBank < 12000000) {
            monthNumber++;
            sumOfSavingsBank *= 1.07;
            if (monthNumber % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %8.15f рублей\n", monthNumber, sumOfSavingsBank);
            }
        }

        System.out.println("Task 6");

        sumOfSavingsBank = 15000;

        for (i = 1; i <= 108; i++) {
            sumOfSavingsBank *= 1.07;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %8.15f рублей\n", i, sumOfSavingsBank);
            }
        }

        System.out.println("Task 7");

        for (i = 4; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Task 8");

        int yearBeforePresent = 1824;
        int yearPastPresent = 2124;

        for (i = 0; i <= yearPastPresent; i += 79) {
            if (i >= yearBeforePresent) {
                System.out.println(i);
            }
        }
    }
}
