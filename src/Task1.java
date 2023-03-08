public class Task1 {
    public static void main(String[] arg) {
        int i;

        System.out.println("Вивід через for:");
        for (i = 500; i <= 650; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println("\nВивід через while:");
        i = 500;
        while (i <= 650) {
            System.out.print(i + " ");
            i += 10;
        }

        System.out.println("\nВивід через do-while:");
        i = 500;
        do {
            System.out.print(i + " ");
            i += 10;
        } while (i <= 650);
    }
}
