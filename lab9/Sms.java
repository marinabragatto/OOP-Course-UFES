public class Sms implements Notificador{
    Sms(){

    }

    public void notificar(Cliente cliente, Compra compra){
        
        System.out.printf("Notificacao sms para %s: Compra realizada por %s no valor de %.2f e entrega em ate %d dias.\n", cliente.retorna_telefone(), cliente.retorna_nome(), compra.total(), compra.prazo_entrega());
    }
}