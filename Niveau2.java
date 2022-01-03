package Jour1;
import java.util.Scanner;

/**
 * @author M@nU_LP
 */
public class Niveau2 extends Choji{
    
    public static void main(String[] args){
        Choji cj = new Choji();
        Scanner sc = new Scanner(System.in);
        
        cj.setV(Double.valueOf(sc.nextLine()));
        cj.SetAll(StringToDoubleArray(sc.nextLine()));
        
        double Hm = Double.valueOf(sc.nextLine());
        
        System.out.println((cj.crossWall(Hm))?"OUI":"NON");
        
    }
}
/*
4.43
200 20 50
330
*/