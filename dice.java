import java.util.Random;

public class dice {
    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;
    
    public dice() {
        this.rand = new Random();
        this.faceValue = 1;
    }
    public int roll(){
        faceValue = rand.nextInt(SIDES)+1;
        return faceValue;
    }
    public String toString(){
        return "FaceValue: " + faceValue;
    }
    public int getFaceValue() {
        return faceValue;
    }
    public static void main(String[] args) {
        dice dado1 = new dice();
        System.out.println(dado1.toString());
        System.out.println(dado1.roll());
        System.out.println(dado1.toString());
        System.out.println(dado1.roll());
        System.out.println(dado1.toString());
        System.out.println(dado1.roll());    
        System.out.println(dado1.toString());

    }
}