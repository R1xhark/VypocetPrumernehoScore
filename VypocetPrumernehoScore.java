import java.util.InputMismatchException;
import java.util.Scanner;

public class VypocetScore {

    public static void main(String[]args){
    PrumerneScore();
    }
    public static void PrumerneScore(){

        Scanner skenuj=new Scanner(System.in);
        System.out.println("Zadejte pocet studentu co psali test");
        int pocetStudentu=skenuj.nextInt();
          int score=0;
        int pocetZaznamu = 0;
        int vysledek;
        int input;
        System.out.println("Zadejte maximalni pocet bodu co sel dosahnout");
        int maxScore=skenuj.nextInt();



        while(pocetStudentu!=pocetZaznamu){
                System.out.println("Zadej skore");
                input = skenuj.nextInt();
                if (input > 0 && input < maxScore + 1) {
                    System.out.println("Zadane score je " + input);
                    score = score + input;
                    pocetZaznamu++;
                    System.out.println("Aktualni pocet zaznamu je " + pocetZaznamu);
                } else {
                    System.out.println("Zadej platne cislo");
                }
            }
            vysledek=score/pocetStudentu;
            System.out.println("-----------------------------------------");
            System.out.println("Prumerne dosazene score je " +vysledek+ " a testu se ucastnilo "+pocetStudentu+" studentu");
        }
    }
