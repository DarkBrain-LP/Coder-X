package Jour1;

import static java.lang.Math.abs;

/**
 * @author M@nU_LP
 */
public class Choji {
    private double H, Lct, Lb, V;

    public Choji() {
    }
    
    public void SetAll(double[] all) {
        this.H = all[0];
        this.Lct = all[1];
        this.Lb = all[2];
    }
    
    public void setV(double V) {
        this.V = V;
    }
    
    public static double[] StringToDoubleArray(String aString){
        String[] stringArray = aString.split(" ");
        double[] doubleArray = new double[stringArray.length];
        
        for(int i = 0; i < stringArray.length; i++)
            doubleArray[i] = Double.valueOf(stringArray[i]);
        
        return doubleArray;
    }
    
    public boolean crossWall(double h){
        return ((V*V/(2*9.8)) + H + Lb - Lct) > h/100;
    }
    
    public boolean crossHole(double Lt){
        return V*V/9.8 > Lt/100;
    }
    
    public boolean crossObstacle(double anObstacle){
        return (anObstacle >= 0)?this.crossWall(anObstacle):this.crossHole(abs(anObstacle));
    }
    
    public boolean crossAllObstacles(String aString){
        for(double d : StringToDoubleArray(aString)){
            for(int i = 0; i < 2; i++){
                if(crossObstacle(d)){
                    this.V *= (double) 5/6;
                    break;
                }
                else{
                    if(i == 1){return false;}
                    this.V *= (double) 7/6;
                }
            }            
        }
        return true;
    }
}
