public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Rok 2020");

        if (2020 % 4 < 1) {
            System.out.println("jest rokiem przestępnym");
        } else {
            System.out.println("nie jest rokiem przestępnym");
        }
    }
}