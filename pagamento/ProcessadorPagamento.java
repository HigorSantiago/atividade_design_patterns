package pagamento;

abstract class ProcessadorPagamento {
    
    public void processarPagamento(){
        preparar();
        debitar();
        notificar();
        finalizar();
    }

    protected abstract void debitar();

    private void preparar(){
        System.out.println("Verificando Plano Assinado");
    }

    protected void notificar(){
        System.out.println("Notificando Usuário");
    }

    protected void finalizar(){
        System.out.println("Finalizando Renovação");
    }

}

