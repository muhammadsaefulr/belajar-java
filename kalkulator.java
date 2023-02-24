import java.util.*;

public class maiin{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        int pilihan;
        double num1, num2, result;
        boolean ulang = true;
    
        while(ulang) {
            System.out.println("\n.............................\n");
            System.out.println("Kalkulator Sederhana");
            System.out.println("1. Pengurangan");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pembagian");
            System.out.println("4. perkalian");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();

            if(pilihan == 1){
                System.out.print("Masukan Nilai pertama : ");
                num1 = input.nextDouble();
                System.out.print("Masukan Nilai kedua : ");
                num2 = input.nextDouble();
                result = num1 - num2;
                System.out.print("Maka Hasilnya Adalah : " + result);
            } else if (pilihan == 2){
                System.out.print("Masukan Nilai pertama : ");
                num1 = input.nextDouble();
                System.out.print("Masukan Nilai kedua : ");
                num2 = input.nextDouble();
                result = num1 + num2;
                System.out.print("Maka Hasilnya Adalah : " + result);
            } else if (pilihan == 3){
                System.out.print("Masukan Nilai pertama : ");
                num1 = input.nextDouble();
                System.out.print("Masukan Nilai kedua : ");
                num2 = input.nextDouble();
                result = num1 / num2;
                System.out.print("Maka Hasilnya Adalah : " + result);
            } else if(pilihan == 4){
                System.out.print("Masukan Nilai pertama : ");
                num1 = input.nextDouble();
                System.out.print("Masukan Nilai kedua : ");
                num2 = input.nextDouble();
                result = num1 * num2;
                System.out.print("Maka Hasilnya Adalah : " + result);
            } else if (pilihan == 5){
                System.out.print("Terimakasih telah menggunakan program :) \n");
                ulang = false;
            } else {
                System.out.print("Input yang anda masukan salah, silahkan coba lagi !");
            }
        }
    }
}
