package day2;

public class Bai3 {
    public static void main(String[] agrs ){
        int a[] = {1, 4, 6, 9, 10};
        for (int i= 0; i< a.length; i++){
            if (a[i] %2 == 0){
                System.out.println("so chan: "+ a[i]);
            }else {
                System.out.println("so le :"+ a[i]);
            }
        }
    }
}
