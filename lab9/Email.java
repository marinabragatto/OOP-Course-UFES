public class Email implements Notificador{
    public Email(){

    }
    
    public void notificar(Cliente cliente, Compra compra){    
        System.out.printf("Notificacao e-mail para %s: Compra realizada por %s no valor de %.2f e entrega em ate %d dias.\n", cliente.retorna_email(), cliente.retorna_nome(), compra.total(), compra.prazo_entrega());
    }

    
}