package Suprimentos;

public class Main {
    public static void main(String[] args) {

        // supri é um objeto do contrutor, usado para fazer uma instancia dos atribudos da class Suprimentos
        Suprimentos produto = new Suprimentos(1, "Notebook", 5, 3000);
        Suprimentos produto2 = new Suprimentos(2, "Mouse", 0, 80);//contrutor

        System.out.println("----------------------------------------------");
        System.out.println("===== Loja de suprimentos de informática =====");
        System.out.println("-----------------------------------------------");

        System.out.println("Codigo do produto: " + produto.getNumItemFaturado());
        System.out.println("O item é: " + produto.getDescricaoItem());
        System.out.println("A quatidade é: " + produto.getQuantCompradoItem());
        System.out.println("Valor unitário é: " + produto.getPrecoUnitarioItem());
        double soma = produto.getInvoiceAmount();
        System.out.println("O valor total é: " + soma + "\n");

        System.out.println("Codigo do produto: " + produto2.getNumItemFaturado());
        System.out.println("O item é: " + produto2.getDescricaoItem());
        System.out.println("A quantidade é: " + produto2.getQuantCompradoItem());
        System.out.println("Valor unitário é: " + produto2.getPrecoUnitarioItem());
        soma = produto2.getInvoiceAmount();
        System.out.println("O valor total é: " + soma);
    }
}