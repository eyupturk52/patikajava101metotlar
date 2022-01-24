import java.util.Scanner;
public class main {
    static int  ushesabı(int taban,int us){
       if(us>=1){
           return taban*ushesabı(taban,(us-1));
       }
       else{
           return 1;
       }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int taban,us;
        int sonuc;

            System.out.print("tabanı giriniz:");
            taban= input.nextInt();
            System.out.println("ussu giriniz:");
            us= input.nextInt();
            sonuc=ushesabı(taban,us);
        System.out.println("sonuc:" +sonuc);
    }
}
