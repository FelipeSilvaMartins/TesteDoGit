
public class inseto {
    private double weight;
    private int x;
    private int y;

    private final double FATOR_DE_PERDA = 0.0001;
    private final static int X_PADRAO = 0;
    private final static int Y_PADRAO = 0;

    private static int population;
    public static String[] fatos = {"Os dois principais grupos de insetos são com asas e sem asas",
                                              "Existe mais de um milhão de espécies de insetos",
                                              "Insetos possuem sangue frio",
                                              "Aranhas não são consideradas insetos"};
        
     
    //construtor
    public inseto (double w){
        this( w,  X_PADRAO,  Y_PADRAO);
    }

    public inseto(double w, int x, int y) {
        this.weight = w;
        this.x = x;
        this.y = y;
        population++;
        System.out.printf("Novo inseto!\nPopulacao: %d\nPeso: %.2f\nPonto X: %d\nPonto Y: %d",population,this.weight,this.x,this.y);
    }
    //metodos
    public double getWeight() {
        return weight;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public String toString(){
        return "Peso: " + this.weight + "Ponto X: " + this.x  + "Ponto Y: " + this.y;
    }
    public static int getPopulation() {
        return population;
    }
    public void comer (double amount){
        System.out.println("nhami nhami: ");
        weight = weight + amount;
    }
    private static double calcularDistancia(double x1, double y1, double x2, double y2)
    {
        return  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public void move (int x, int y)
    {
        System.out.printf("\nMovendo....\n");
        double distance = calcularDistancia(this.x, this.y, x, y);
        if (distance > 0)
        {
            this.x = x;
            this.y = y;
            weight = weight*FATOR_DE_PERDA*distance;
            System.out.printf("\nMoveu %.2f metros e perdeu %.2f gramas\n", distance, weight);
        }
        else
            System.out.println("Permanece Parado");
   
    }
    public static String produtorFatos (){
        int indice = (int)(Math.random()*(fatos.length));
        return fatos[indice];
    }

    public static void main(String[] args) {
        inseto abelha1 = new inseto(10,1,1);
        System.out.println(" ");
        abelha1.move(10,15);
        inseto abelha2 = new inseto(10,1,1);
        abelha2.move(14,150);
        System.out.println(produtorFatos());
    }

}