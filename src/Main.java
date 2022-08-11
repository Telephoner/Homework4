public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("\n");
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println("\n\nЗадание 2\n");
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница - " + friday + " число. Необходимо подготовить отчет");

        }
        System.out.println("\nЗадание 3\n");

        int currentYear = 2022;
        int start = 79;
        int stop = currentYear + 100;
        for (int year = start + 79; year < stop; year = year + 79)  {
            if (year >= currentYear - 200) {
                System.out.println(year);
            }
        }
    }
}