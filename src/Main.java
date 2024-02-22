import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Yıl ve burc değişkenlerimizi tanımladık
        int birthyear;
        String burc = "";

        //Kullanıcıdan yıl bilgisi aldık
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        birthyear = input.nextInt();

        //doğum yılının 12'e bölümünden kalana göre hayvan burçlarını eşitledik
        switch (birthyear % 12) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:

        }
        System.out.println("Çin Zodyağı Burcunuz : " + burc); //kalana göre hayvanı ekrana yazdırdık

    }
}