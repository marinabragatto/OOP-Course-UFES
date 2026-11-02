
class NotifierSMS implements Notifier{
    
    NotifierSMS(){
        
    }

    public void notify(User user, String message){
        System.out.printf("enviando SMS para %s: '%s'.\n", user.retorna_telefone(), message);
    }
}