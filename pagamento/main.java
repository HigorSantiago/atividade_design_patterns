package pagamento;

public class main{
    public static void main(String[] args ){
        System.out.println("Oi eu sou o cartão ");
        ProcessadorPagamento processarPagamento = new processarPagamentoCredito();
        processarPagamento.processarPagamento();


        System.out.println("\nOi eu sou débito automatico de Pix");
        ProcessadorPagamento processarPagamento2 = new processarPagamentoPix();
        processarPagamento2.processarPagamento();
    }
}
