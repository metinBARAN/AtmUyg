import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName,password;
        int right=3;
        int select;
        double balance=2000;


        while (right>0){
        Scanner inp=new Scanner(System.in);
        System.out.println("Kullanici adinizi giriniz: ");
        userName=inp.nextLine();
        System.out.println("Parolanizi giriniz: ");
        password=inp.nextLine();



        if(userName.equals("patika")&&password.equals("dev12")){
            System.out.println("Merhaba xxx xxx bankasina hosgeldiniz: ");
           do {
               System.out.println("1-Para Yatirma\n"+
                                  "2-Para Cekme\n"+
                                  "3-Bakiye Ogrenme\n"+
                                  "4-Cikis");
               System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
               select=inp.nextInt();


               if (select==1){
                   System.out.print("Para miktari: ");
                   int price=inp.nextInt();
                   balance+=price;
               }
               else if(select==2){
                   System.out.print("Para miktari: ");
                   int price=inp.nextInt();
                   if(price>balance){
                       System.out.println("Bakiye yetersiz.");
                   }else {
                       balance-=price;
                   }
               }else if (select==3){

                   System.out.println("Bakiye: "+balance);

               }

           }while (select!=4);
            System.out.println("Tekrar gorusmek uzere. Iyi gunler ");

            break;
        }else {
            right--;
            System.out.println("Hatali kullanici adi veya sifre. Lutfen tekrar deneyiniz: ");
            if (right == 0) {
                System.out.println("Hesabiniz bloke edilmistir. Lutfen en kisa zamanda banka ile iletişime geciniz:");
            } else {
                System.out.println("Kalan hakkiniz: " + right);
            }

        }
        }
    }
}
