import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int nbr1,nbr2,select;

        Scanner input=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        nbr1=input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        nbr2=input.nextInt();

        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz;\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapılmak istenen işlem :");
        select=input.nextInt();

        switch (select){
            case 1 : System.out.println("Toplama = "+(nbr1+nbr2));
            break;
            case 2 : System.out.println("Çıkarma = "+(nbr1-nbr2));
            break;
            case 3 : System.out.println("Çarpma = "+(nbr1*nbr2));
            break;
            case 4 :
                if(nbr2!=0)
                    System.out.println("Bölme = "+(nbr1/nbr2));
                else
                    System.out.println("Bir sayı sıfıra bölünemez!");
            break;
            default:System.out.println("Geçerli bir seçim yapılmadı.");
            break;
        }
    }
}
