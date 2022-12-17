import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void isLeapYear(int year) {

        if (year % 4 == 0 || year % 400 == 0 && year / 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " не год является високосным.");
        }
    }

    public static void installApp(int clientDeviceYear, int clientOs) {

        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }

    public static void howMuchDays (int deliveryDistance) {
        int daysDelivery;
        if (deliveryDistance <= 20) {
            daysDelivery = 1;
            System.out.println("Потребуются дней: " + daysDelivery + " сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysDelivery = 2;
            System.out.println("Потребуются дней: " + daysDelivery+ ".");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysDelivery = 3;
            System.out.println("Потребуются дней: " + daysDelivery+ ".");
        } else {
            System.out.println("Свыше ста километров доставки нет.");
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) + 1;
        }
        return arr;
    }

    public static void task1() {

        /*Задача 1
        Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        Эту проверку вы уже реализовывали в задании по условным операторам.*/

        System.out.println("\nЗадача_1:");

        int year = 2024;
        isLeapYear(year);
    } //done

    public static void task2() {

        /*Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
        и для какой ОС (Android или iOS) установить пользователю.*/

        System.out.println("\nЗадача_2:");

        LocalDate.now();
        int clientOs = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        installApp(clientDeviceYear, clientOs);
    } //done

    public static void task3() {

      /*Возвращаемся к задаче на расчет дней доставки банковской карты.
       Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое
       количество дней доставки.*/

        System.out.println("\nЗадача_3:");

        int deliveryDistance = generateRandomArray()[0];
        howMuchDays(deliveryDistance);
    } //done

}