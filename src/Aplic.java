import fatec.poo.model.Garcom;
import fatec.poo.model.Cliente;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        int codigo = 0, numMesa = 0;
        String nome = "";
        double taxaServico = 0, totalConta = 0;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.println("Digite o código do cliente: ");
        codigo = entrada.nextInt();
        System.out.println("Digite o nome do cliente: ");
        nome = entrada.next();
        System.out.println("Digite o número da mesa: ");
        numMesa = entrada.nextInt();
        System.out.println("Digite o total da conta: ");
        totalConta = entrada.nextDouble();
        
        Cliente objCli1 = new Cliente (codigo, nome, numMesa, totalConta);
        
        System.out.println("Digite o código do cliente: ");
        codigo = entrada.nextInt();
        System.out.println("Digite o nome do cliente: ");
        nome = entrada.next();
        System.out.println("Digite o número da mesa: ");
        numMesa = entrada.nextInt();
        System.out.println("Digite o total da conta: ");
        totalConta = entrada.nextDouble();
        
        Cliente objCli2 = new Cliente (codigo, nome, numMesa, totalConta);
        
        System.out.println("Digite o código do garçom: ");
        codigo = entrada.nextInt();
        System.out.println("Digite o nome do garçom: ");
        nome = entrada.next();
        System.out.println("Digite o valor da taxa de serviço: ");
        numMesa = entrada.nextInt();
        
        Garcom objGar = new Garcom(codigo, nome, taxaServico);
        
        System.out.println("Código do Garçom: " + objGar.getCodigo());
        System.out.println("Nome do Garçom: " + objGar.getNome());
        System.out.println("Número da Mesa: " + objCli1.getNumMesa());
        System.out.println("Total da Conta: " + df.format(objCli1.getTotalConta()));
        System.out.println("Número da Mesa: " + objCli2.getNumMesa());
        System.out.println("Total da Conta: " + df.format(objCli2.getTotalConta()));
        System.out.println("Salário: "+ df.format(objGar.calcSalarioFinal()));
    }
}
