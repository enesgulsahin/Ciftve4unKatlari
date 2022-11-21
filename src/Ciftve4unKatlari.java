import java.util.Scanner;
public class Ciftve4unKatlari {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        int total = 0;
        do {
            System.out.print("Bir sayı giriniz : ");
            number = inp.nextInt();
            if(number % 4 == 0 && number % 2 == 0){
                total += number;
            }
        } while(number % 2 == 0);

        System.out.print("Toplam : " + total);


    }
}