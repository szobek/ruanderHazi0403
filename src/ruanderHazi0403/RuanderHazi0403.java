package ruanderHazi0403;

import java.util.Scanner;

public class RuanderHazi0403 {

    /*

    • A., Kérjünk be a felhasználótól tíz keresztnevet.
    • A neveket nagybetűs formátumban, vektorban tároljuk!
    • Listázzuk ki a tömb minden második elemét!
    • Állapítsuk meg, melyik a leghosszabb név!
    • Írjuk ki, melyik névben van a legtöbb ’s’ betű!
    • B., Töltsünk fel egy 4x3-as mátrixot 50 és 100 közötti véletlenszámokkal.
    • Transzponáljuk egy másik mátrixba!
    • Listázzuk ki mindkét mátrixot a megfelelő sor/oszlop formátumban!
    • C., Töltsünk fel egy 3x3-as mátrixot egyjegyű véletlenszámok négyzetre emelt értékeivel.
    • Listázzuk ki a főátlóban található számokat és összegüket!
    • Listázzuk ki fordított sorrendben (az utolsó elemtől az elsőig) az eredetileg generált számokat!
         */

    public static void main(String[] args) {
        aFeladat();
    }

    static void aFeladat(){
        String[] keresztNevek ={"aaa","nnnnnssssnnnnnnnn","oo","swwww","bbssb","nnnnnn","nnnnnnnn","mmmssssssssssssssmmmm","ppppppppp","zzzzzzzzzzzz"};
//        tombFeltoltes(keresztNevek);
//        System.out.println();
        mindenMasodikNev(keresztNevek);
        System.out.println();
        legHosszabbNev(keresztNevek);
        System.out.println();
        legtobbSANevben(keresztNevek);
    }

    static void tombFeltoltes(String[] keresztNevek){

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < keresztNevek.length; i++) {
            System.out.print("Adja meg a nevet: ");
            String nev = sc.nextLine();
            keresztNevek[i] = nev.toUpperCase();
        }
        sc.close();
    }

    static void mindenMasodikNev(String[] keresztNevek){
        System.out.println("Minden 2.: ");
        for (int i = 0; i < keresztNevek.length; i++) {
            if (i % 2 == 1) {

                System.out.println(keresztNevek[i]);
            }
        }
        System.out.println();
    }
    static void legHosszabbNev(String[] keresztNevek){
        int nevHossza = keresztNevek[0].length();
        int leghosszabbNevIndex=0;
        for(int i = 1; i< keresztNevek.length;i++){
            if(nevHossza<keresztNevek[i].length()){
                leghosszabbNevIndex=i;
                nevHossza=keresztNevek[i].length();
            }
        }
        System.out.println("A leghosszabb név: "+keresztNevek[leghosszabbNevIndex]+" a hossza: "+nevHossza+" karakter");
    }

    static void legtobbSANevben(String[] keresztNevek){
        int legtobb = 0;
        String nev = "";
        for (String s : keresztNevek) {
            int tartalmaz = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 's') {
                    tartalmaz++;
                }
            }
            System.out.println("A név: " + s + " " + tartalmaz + "db s-t tartalmaz");
            if(tartalmaz>legtobb){
                legtobb=tartalmaz;
                nev=s;
            }

        }
        System.out.println( "\na legtöbb \"s\": "+legtobb+", a név: "+nev);
    }

}
