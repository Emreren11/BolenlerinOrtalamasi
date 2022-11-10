import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int no,sumLenght=0;
        int sum=0;

        System.out.print("Bir sayı giriniz: ");
        no=inp.nextInt();
        System.out.print("\n3 ve 4 bölünen sayılar:");
        for (int i=1; i<=no; i++)
        {
            if (i%3==0 && i%4==0)
            {
                sumLenght++;
                sum+=i;
                System.out.print(i+", ");
            }
        }
        System.out.println("\nBu sayıların ortalaması: "+(sum/sumLenght));
    }
}