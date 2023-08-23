package day41_fileInputStream;

import java.util.Scanner;

public class MultibleExceptions {
    public static void main(String[] args) {
        String  str="Java Candır";
        int[] arr={3,5,7,8,2,5,9,0};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir index numarası giriniz");

        try {
            int girilenindex=scanner.nextInt();
            System.out.println(str.charAt(girilenindex));
            System.out.println(arr[girilenindex]);
        } catch (RuntimeException e) {
            System.out.println("kod çalıştırılırken bir hata ile karşılaşıldı.");
            e.printStackTrace();
        }
    }
}
