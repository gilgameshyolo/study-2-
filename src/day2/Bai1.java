package day2;

public class Bai1 {
    public static void main(String[] agrs) {
        int[] a = {1, 4, 6, 9, 10};
        int sum = 0;
        for (int i= 0; i < a.length; i++){
            sum = sum + a[i];
            System.out.println("thu tu cac so trong mang :"+a[i]);
//            System.out.println("tong lan luot la: " +sum);
        }
        System.out.println("tong la: " +sum);
    }
}
