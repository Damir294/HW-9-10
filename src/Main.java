public class Main {
    public static void main(String[] args) {

        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays );
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        }
    }
}