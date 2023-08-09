import java.util.Scanner;

public class suhu{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nilai Celcius: ");
        Double celcius = input.nextDouble();
        System.out.println("1.Reamur");
        System.out.println("2. Fahrenheit");
        int Pilihan = input.nextInt();

        Double Hasil;
        switch (Pilihan){
            case 1:
                 Hasil= 0.8 * celcius;
                 System.out.println("Konversi Celcius ke Reamur: " +Hasil);
            case 2:    
                Hasil= (1.8 * celcius) + 32;
                System.out.println("Konversi Celcius ke Fahrenheit: " +Hasil);
        }
    }
}