import java.util.Scanner;
import java.util.ArrayList;

class Programa{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Notifier> notifiers = new ArrayList<Notifier>();

        notifiers.add(new NotifierSMS());
        notifiers.add(new NotifierEmail());
        notifiers.add(new NotifierPopUp());
        notifiers.add(new NotifierAplicativo());

        String nome,email,telefone,mensagem;
        nome = sc.nextLine();
        email = sc.nextLine();
        telefone = sc.nextLine();
        mensagem = sc.nextLine();
        
        User user = new User(nome,email,telefone);

        for(Notifier n_i : notifiers){
            n_i.notify(user, mensagem);
        }

        sc.close();
    }
}


// -----------------------------

// Na main, crie um ArrayList/vector de notificadores e adicione objetos de cada tipo implementado. Em seguida, leia o nome, email e telefone de uma pessoa e uma mensagem que vai até o final da linha. Itere sobre o array de notificadores e invoque o método notify de cada objeto. Verifique que o mecanismo de amarração dinâmica vai garantir que a implementação das subclasses será invocada.