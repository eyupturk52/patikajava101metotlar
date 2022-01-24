import java.util.Scanner;
public class main {
    static void palindrom(int a){
        int temp=a;
        int reversenumber=0;
        int kalan;
        while(temp!=0){
            kalan=temp%10;
            reversenumber=(reversenumber*10)+kalan;
            temp/=10;
        }
        if(reversenumber==a){
            System.out.println("girdiginiz sayı palindrom sayıdır.");
        }
        else{
            System.out.println("girdiginiz sayı palindrom sayı degildir.");
        }
    }
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayı giriniz:");
        a= input.nextInt();
        palindrom(a);
    }
}
