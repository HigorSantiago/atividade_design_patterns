package pagamento;

public class processarPagamentoPix extends ProcessadorPagamento{
  
    @Override
    protected void notificar(){
        System.out.println("Notificações Adicionais do Pix");
    }

    @Override
    protected void debitar() {
        System.out.println("Debitando Pix Automatico");
    }
}
