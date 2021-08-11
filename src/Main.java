public class Main {
    public static void main(String[] args) {
        int costInKopecks = 20_00;
        int percent = 5;
        float amount = costInKopecks * percent / 100 / 100;
        System.out.println(amount);
    }
}