public class Main {

    public static void main (String args[]) {
        System.out.println("Hello Java! ");
        try {
            Thread.sleep(10000); // Заказ задержки выполнения на 10 секунд
            System.out.println("Delay's over!"); // Дополнительный код после задержки
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt(); // Прерывание задержки после истечения 10 секунд
        }
    }
}
