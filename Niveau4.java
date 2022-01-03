package Jour1;

import java.util.Scanner;

/**
 * @author M@nU_LP
 */
public class Niveau4 extends Choji{
    public static void main(String[] args){
        Choji cj = new Choji();
        Scanner sc = new Scanner(System.in);
        
        cj.setV(Double.valueOf(sc.nextLine())); // Vitesse
        cj.SetAll(StringToDoubleArray(sc.nextLine())); // Autres données de l'instance cj de Choji
        
        System.out.println((cj.crossAllObstacles(sc.nextLine()))?"OUI":"IMPOSSIBLE");
    }
}
/*
5
200 20 50
100 -50 20 10

5
200 20 50
200 -250 40 20
*/