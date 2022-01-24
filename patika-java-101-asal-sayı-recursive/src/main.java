import java.util.Scanner;
public class main {
    static int asal(int a,int b){
        if(b==1) {
            return 1;
        }
        else{
            if(a%b==0){
                return 0;
            }
            else{
             return   asal(a,(b-1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("bir sayı giriniz");
        a= input.nextInt();
        int b=a-1;
        int  c=asal(a,b);
        if(c == 1){
            System.out.println(a+ "sayısı asaldır.");
        }
        else{
            System.out.println(a+ "sayısı asal değildir.");
        }

    }
}
