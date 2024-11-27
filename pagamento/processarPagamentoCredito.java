package pagamento;

public class processarPagamentoCredito extends ProcessadorPagamento{

    @Override
    protected void debitar(){
        System.out.println("Debitando Cartão");
    }

    @Override
    protected void notificar(){
        System.out.println("Notificações Adicionais do Cartão");
    }
}