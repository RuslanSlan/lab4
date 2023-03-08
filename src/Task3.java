public class Task3 {
    public static void main(String[] arg) {
        int n = 10;
        for (int i = 1; i < n/2+1; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }
}
