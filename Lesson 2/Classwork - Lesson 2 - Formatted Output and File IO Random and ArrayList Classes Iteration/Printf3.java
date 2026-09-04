public class Printf3 {
    public static void main(String[] args) {
        double x = 5.0, y = 123.55, z = -10.25, w = -9.97821, j = 6.18, k = 218;
        System.out.printf("%.3f\n", 0.0);
        System.out.printf("%7.3f\n", y);
        System.out.printf("%7.3f\n", z);
        System.out.printf("%#7.0f\n", z);
        System.out.printf("%(7.3f %(7.3f %(7.2f %(7.2f\n", w, y, z, x);
        System.out.printf("%-7.3f%-7.3f%-7.3f%-7.3f\n", 0.0, y, z, x);
        System.out.printf("%+012.4f %+012.4f %+012.4f %+012.4f\n", 0.0, y, w, z);
        System.out.printf("%(+012.0f %(+012.4f %(+012.4f %(+012.4f\n", 0.5, y, z, x);
        System.out.printf("%7.1f %7.1f\n", 1.75, 1.850);

        //notes for programs
        System.out.printf("%(+06.0f this is %%(+06.0f\n%(+06.6f this is %%(+06.6f\n", j, j);
        System.out.printf("%(+06.0f this is %%(+06.0f\n%(+06.6f this is %%(+06.6f\n", k, k);

    }
}