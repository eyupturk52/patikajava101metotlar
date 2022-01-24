import java.util.Scanner;
public class main {
    static int azalt(int a,int number){
        if(a>0){
            a=a-5;
            System.out.print(" "+a);
            return azalt(a,number);
        }
        else{
           return arttır(a,number);
        }
    }
    static int arttır(int a,int number){
        if(a==number){
            return 1;
        }
        else{
            a=a+5;
            System.out.print(" "+a);
            return arttır(a,number);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("bir tane değer giriniz:");
        a= input.nextInt();
        System.out.print(a);
        int number=a;
        azalt(a,number);
    }
}
