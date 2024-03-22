package Suprimentos;

public class Main {
    public static void main(String[] args) {

        // supri é um objeto do contrutor, usado para fazer uma instancia dos atribudos da class Suprimentos
        Suprimentos supri = new Suprimentos(123, "Notebook", 3, 80.00); //contrutor
        System.out.println(supri.getDescricaoItem());
        double soma = supri.getInvoiceAmount();
        System.out.println(soma);
    }
}