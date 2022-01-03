package Jour1;
import java.util.Scanner;

/**
 * @author M@nU_LP
 */
public class Niveau1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mario mr = new Mario(Double.valueOf(sc.nextLine()));
        
        for(char c : sc.next().toCharArray())
            mr.crossObstacle(c);
        
        System.out.println(mr.hasCrossed()?"OUI" : "NON");
    }
}
//TTmMTmMMTTTMMTMMT