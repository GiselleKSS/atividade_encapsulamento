package Colaborador;

public class Main {
    public static void main(String[] args) {
        Colaborador firma = new Colaborador("Giselle", "Santos", 2000);
        Colaborador firma2 = new Colaborador("Gaby", "Silva", 1000);

        System.out.println("-----------------------------");
        System.out.println("======= New Enterprise ======");
        System.out.println("-----------------------------");

        System.out.println("Nome do colaborador: " + firma.getPrimeiroNome() + " "+ firma.getSobrenome());
        System.out.println("Valor salario mensal: " + firma.getSalarioMensal());
        double salarioAnual = firma.salarioAnual();
        System.out.println("Valor do salario anual: " + salarioAnual);
        firma.aumentoSalarial();
        System.out.println("Aumento salarial de 10%: " + firma.getSalarioMensal());
        System.out.println("Valor do salário anual com ajuste: "+ firma.salarioAnual() + "\n");

        System.out.println("Nome do colaborador: " + firma2.getPrimeiroNome() + " "+ firma2.getSobrenome());
        System.out.println("Valor salario mensal: " + firma2.getSalarioMensal());
        salarioAnual = firma2.salarioAnual();
        System.out.println("Valor do salario anual: " + salarioAnual);
        firma2.aumentoSalarial();
        System.out.println("Aumento salarial de 10%: " + firma2.getSalarioMensal());
        System.out.println("Valor do salário anual com ajuste: "+ firma2.salarioAnual());
    }
}