package day2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        int a[] = {1, 4, 6, 9, 10, 13, 14, 23};
        Scanner sc = new Scanner(System.in);
       System.out.println("nhap target: ");
        int target = sc.nextInt();
        System.out.println(target);
//        int target = 23;
        int b[] = new int[2];
        for (int i = 0; i < a.length; i++){
            int sodu = target - a[i];
            for (int j =0; j < a.length; j++){
                if (sodu == a[j]){
                    b[0]= a[i];
                    b[1]= a[j];
//                    System.out.println("2 so la tong cua target la: "+b[0]/+b[1]);
                }
                //else {
//                System.out.println("ko co 2 so phu hop");

                }
            System.out.println("2 so la tong cua target la: " + b[0] + "/" + b[1]);
            }
        }

    }

