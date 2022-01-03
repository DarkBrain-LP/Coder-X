package Jour1;

/**
 * @author M@nU_LP
 */
public class Mario {
    private double F;

    public Mario(Double F) {
        this.F = F;
    }
    
    public void crossObstacle(char c){
        this.F = (c == 'm')?(this.F-this.F/4):((c == 'M')?(this.F-this.F/3):((c == 't')?(this.F - this.F/2):(c == 'T')?(this.F-3*this.F/4):this.F));
    }
    
    public boolean hasCrossed(){
        return this.F > 0.1;
    }
}