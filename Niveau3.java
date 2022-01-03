package Jour1;
import java.util.Scanner;

/**
 * @author M@nU_LP
 */
public class Niveau3 {
    public static void main(String[] args){
        Choji cj = new Choji();
        Scanner sc = new Scanner(System.in);
        
        cj.setV(Double.valueOf(sc.nextLine())); // Vitesse
        double Lt = Double.valueOf(sc.nextLine()); // Hauteur du trou
        
        System.out.println(cj.crossHole(Lt)?"OUI":"NON");
    }
}