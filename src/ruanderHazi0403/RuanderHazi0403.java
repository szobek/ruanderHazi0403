package ruanderHazi0403;

import java.util.Scanner;

public class RuanderHazi0403 {

    public static void main(String[] args) {
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
        for (int i = 0; i < keresztNevek.length; i++) {
            if (i % 2 == 1) {

                System.out.println(keresztNevek[i]);
            }
        }
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
        System.out.println("A név: "+keresztNevek[leghosszabbNevIndex]+" a hossza: "+nevHossza+" karakter");
    }

    static void legtobbSANevben(String[] keresztNevek){
        for (String s : keresztNevek) {
            int tartalmaz = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 's') {
                    tartalmaz++;
                }
            }
            System.out.println("A név: " + s + " " + tartalmaz + "db s-t tartalmaz");
        }
    }

}
