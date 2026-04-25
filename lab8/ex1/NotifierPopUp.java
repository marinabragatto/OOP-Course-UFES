class NotifierPopUp implements Notifier{
    
    NotifierPopUp(){
        
    }

    public void notify(User user, String message){
        System.out.printf("enviando pop-up para %s: '%s'.\n", user.retorna_telefone(), message);        
    }
}