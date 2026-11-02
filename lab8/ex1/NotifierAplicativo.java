class NotifierAplicativo implements Notifier{
    
    NotifierAplicativo(){

    }

    public void notify(User user, String message){
        System.out.printf("enviando notificação no aplicativo instalado em %s:  '%s'.\n", user.retorna_telefone(), message);
        
    }
}