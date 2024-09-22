import fatec.poo.model.Garcom;
import fatec.poo.model.Cliente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        /*int codigo = 0, numMesa = 0;
        String nome = "";
        double taxaServico = 0, totalConta = 0;
        Scanner entrada = new Scanner(System.in);*/
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        /*System.out.println("Digite o código do cliente: ");
        //codigo = entrada.nextInt();
        System.out.println("Digite o nome do cliente: ");
        //nome = entrada.next();
        System.out.println("Digite o número da mesa: ");
        //numMesa = entrada.nextInt();
        System.out.println("Digite o total da conta: ");
        //totalConta = entrada.nextDouble();*/
        
        Cliente objCli1 = new Cliente (111, "Filé", 1, 200);
        
        /*System.out.println("Digite o código do cliente: ");
        //codigo = entrada.nextInt();
        System.out.println("Digite o nome do cliente: ");
        //nome = entrada.next();
        System.out.println("Digite o número da mesa: ");
        //numMesa = entrada.nextInt();
        System.out.println("Digite o total da conta: ");
        //totalConta = entrada.nextDouble();*/
        
        Cliente objCli2 = new Cliente (222, "Bruno", 2, 150);
        
        /*System.out.println("Digite o código do garçom: ");
        //codigo = entrada.nextInt();
        System.out.println("Digite o nome do garçom: ");
        //nome = entrada.next();
        System.out.println("Digite o valor da taxa de serviço: ");
        //numMesa = entrada.nextInt();*/
        
        Garcom objGar = new Garcom(123, "Ingrid", ((double) 30 /100));
        //Adicionando o Salário Base do Garçom
        //System.out.println("Digite o salário base do Garçom: ");
        //double salBase = entrada.nextDouble();
        //Adicionado o valor da variável no objeto objGar através do método setSalarioBase()
        objGar.setSalarioBase(500);

        //Adicionando a gorjeta dos clientes
        objGar.addGorjeta(objCli1.getTotalConta());
        objGar.addGorjeta(objCli2.getTotalConta());

        /*System.out.println("Código do Garçom: " + objGar.getCodigo());
        System.out.println("Nome do Garçom: " + objGar.getNome());
        System.out.println("Número da Mesa: " + objCli1.getNumMesa());
        System.out.println("Total da Conta: " + df.format(objCli1.getTotalConta()));
        System.out.println("Número da Mesa: " + objCli2.getNumMesa());
        System.out.println("Total da Conta: " + df.format(objCli2.getTotalConta()));*/
        System.out.println("Salário: "+ df.format(objGar.calcSalarioFinal()));
    }
}
