public class craps{
    private dice dice1, dice2;
    private int point;

    public craps(){
        dice1 = new dice();
        dice2 = new dice();
    }

    private int toss(){
        int total = dice1.roll() + dice2.roll();
        System.out.println("Dado 1: " + dice1.getFaceValue() + ", Dado 2: " + dice2.getFaceValue());
        return total;
    }
    private void go(){
        point = toss();
        System.out.println("Ponto: " + point);
        if ((point == 7) || (point == 11)){
            System.out.println("Vencedor");
        }
        else if ((point == 2) || (point == 3) || (point == 12)){
            System.out.println("Você perderu");
        }
        else{
            System.out.println("Entrar no estágio 2");
            stage2();
        }
    }
    public void stage2(){
        boolean endGame = false;
        while (!endGame){
            int total = toss();

            System.out.println("Total: " + total);
            if (total == point){
                System.out.println("Você ganhou");
                endGame = true;
            }
            else if (total == 7){
                System.out.println("Você perdeu");
                endGame = true;
            }
        } 
    }
    public static void main(String[] args){
            craps jogo = new craps();
            jogo.go();
        }
}