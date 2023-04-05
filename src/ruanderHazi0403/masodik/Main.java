package ruanderHazi0403.masodik;

import java.util.Scanner;

public class Main {
    /*
        Készítsen alkalmazást, ami vállalkozások nyereségét/veszteségét tárolja,
    havi bontásban. Használjon metódusokat a megoldáshoz!
    • Kérje be a felhasználótól a vállalkozások számát, majd ennek megfelelően
    minden vállalkozás előző évi eredményét havi bontásban. Tárolja az adatokat
    vállalkozásonként a megfelelő adatszerkezetben!
    • Listázza ki a vállalkozások havi eredményeit és éves összesítésüket!
    • Generáljon egy véletlenszámot (1-12 között), és csak annak a hónapnak az
    eredményeit írja ki!
    • Állapítsa meg, melyik vállalkozás érte el a legjobb éves eredményt!
    • Írja ki vállalkozásonként a veszteséges hónapok számát!

     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(vallalkozasSzamBeker());
    }
    static int vallalkozasSzamBeker(){
        int szam;
        System.out.print("Adja meg a vállalkozások számát: ");
        szam=Integer.parseInt(scanner.nextLine()) ;
        return szam;
    }
}
