import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printLeapYear(int year) {

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    } //проверка на високосный год

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
    } //метод какую версию приложения установить

    public static int howMuchDays (int deliveryDistance) {

        int daysDelivery;

        if (deliveryDistance <= 20) {
            daysDelivery = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysDelivery = 2;
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysDelivery = 3;
            } else {
            daysDelivery = -1;
            }
        return daysDelivery;
    } //конвертация километры в сутки

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101) + 1;
        }
        return arr;
    } // рандомный массив километров

    public static int[] generateRandomYear() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2102) + 1;
        }
        return arr;
    } // рандомный год метод

    public static void task1() {

        /*Задача 1
        Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        Эту проверку вы уже реализовывали в задании по условным операторам.*/

        System.out.println("\nЗадача_1:");

        int year = generateRandomYear()[44];

        printLeapYear(year);
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
        int daysDelivery = howMuchDays(deliveryDistance);

            if (daysDelivery <= 3 && daysDelivery != -1) {
            System.out.println("Потребуется дней для доставки: " + daysDelivery + ".");
            } else {
            System.out.println("Доставка невозможна.");
            }
    } //done
}
