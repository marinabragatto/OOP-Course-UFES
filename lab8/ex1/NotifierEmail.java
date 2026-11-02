class NotifierEmail implements Notifier{
    
    NotifierEmail(){
        
    }

    public void notify(User user, String message){
        System.out.printf("enviando e-mail para %s: '%s'.\n", user.retorna_email(), message);        
    }
}