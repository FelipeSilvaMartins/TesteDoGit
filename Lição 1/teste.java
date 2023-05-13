public class teste {
    public static void main(String[] args) {

        System.out.println(inseto.produtorFatos());
        inseto abelha1 = new inseto(100, 23,56);
        System.out.println("");
        System.out.println(abelha1.getWeight());
        System.out.println(abelha1.getX());
        System.out.println(abelha1.getY());
        System.out.println("");
        inseto abelha2 = new inseto(300);
        System.out.println(abelha2.getWeight());
        System.out.println(abelha2.getX());
        System.out.println(abelha2.getY());
        System.out.println(inseto.getPopulation());
        System.out.println("--------------------------------");
        System.out.println(abelha2.toString());



        }
}