package ruanderHazi0403.masodik;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
        Készítsen alkalmazást, ami vállalkozások nyereségét/veszteségét tárolja,
    havi bontásban. Használjon metódusokat a megoldáshoz!
    • Kérje be a felhasználótól a vállalkozások számát, majd ennek megfelelően
    minden vállalkozás előző évi eredményét havi bontásban. Tárolja az adatokat
    vállalkozásonként a megfelelő adatszerkezetben!-
    • Listázza ki a vállalkozások havi eredményeit és éves összesítésüket! -
    • Generáljon egy véletlenszámot (1-12 között), és csak annak a hónapnak az
    eredményeit írja ki!-
    • Állapítsa meg, melyik vállalkozás érte el a legjobb éves eredményt! -
    • Írja ki vállalkozásonként a veszteséges hónapok számát! -

     */
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int veszteseg = 300;
    public static void main(String[] args) {
        int vallalkozasokSzama = vallalkozasSzamBeker();
        int[][] vallalkozas = new int[vallalkozasokSzama][12];
        eredmenyBekeres(vallalkozas);
        eredmenyek(vallalkozas);
        veletlenHonapEredmeny(vallalkozas);
        legjobbEvesEredmeny(vallalkozas);
        vesztesegVallalkozasok(vallalkozas);
    }

    private static void legjobbEvesEredmeny(int[][] vallalkozas) {
        int legjobbEredmeny=0;
        int legjobbEredmenyIndex = 0;
        for(int i=0;i<vallalkozas.length;i++){
            int evesEredmeny=0;
            for(int j=0;j<vallalkozas[i].length;j++){
                evesEredmeny+=vallalkozas[i][j];
            }

            if(evesEredmeny>legjobbEredmeny){
                legjobbEredmeny=evesEredmeny;
                legjobbEredmenyIndex=i;
            }
        }
        System.out.println();
        System.out.println("A legjobb éves eredmény: "+legjobbEredmeny+" az index: "+legjobbEredmenyIndex);
    }

    private static void veletlenHonapEredmeny(int[][] vallalkozas) {
        int honap = random.nextInt(1,13);
        System.out.println("Véletlenül kiálasztott hónap: "+honap);
        for(int i=0;i<vallalkozas.length;i++){
            System.out.println("A vállalkozás "+honap+". havi eredménye: "+vallalkozas[i][honap]);
        }

    }

    private static void eredmenyBekeres(int[][] vallalkozas) {
        for(int i=0;i<vallalkozas.length;i++){
            for(int j=0;j<vallalkozas[i].length;j++){
                vallalkozas[i][j]= random.nextInt(2000);
//                System.out.print(" Adja meg a(z) "+i+" vállalkozás "+(j+1)+" havi bevételt: ");
//                vallalkozas[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
    }

    private static void eredmenyek(int[][] vallalkozas) {
        for(int i=0;i<vallalkozas.length;i++){
            int evesEredmeny=0;
            for(int j=0;j<vallalkozas[i].length;j++){
                System.out.println("A vállalkozás száma: "+(i+1)+" a "+(j+1)+". havi bevétel: "+vallalkozas[i][j]);
                evesEredmeny+=vallalkozas[i][j];
            }
            System.out.println("A(z)"+(i+1)+"vállalat éves eredény: "+evesEredmeny);
            System.out.println();

        }
    }

    static int vallalkozasSzamBeker(){
        int szam;
        System.out.print("Adja meg a vállalkozások számát: ");
        szam=Integer.parseInt(scanner.nextLine()) ;
        return szam;
    }

    static void vesztesegVallalkozasok(int[][] vallalkozas){
        System.out.println();
        for(int i=0;i<vallalkozas.length;i++){
            for(int j=0;j<vallalkozas[i].length;j++){
                if(vallalkozas[i][j]<veszteseg){
                    System.out.println("A(z) "+(i+1)+". cég veszteséges hónapja: "+(j+1)+"\n");
                }
            }
        }
    }
}
