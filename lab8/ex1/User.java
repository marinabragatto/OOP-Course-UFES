

class User{
    private String nome;
    private String email;
    private String telefone;
    
    public User(String nome, String email, String telefone){
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
    }

    public String retorna_telefone(){
        return this.telefone;
    }

    public String retorna_email(){
        return this.email;
    }

    public String retorna_nome(){
        return this.nome;
    }

}
// Em aplicativos modernos, ao realizar eventos no sistema, usuários são notificados por diversos meios como mensagens pop-up, e-mail, sms e alertas no aplicativo.

// Crie uma classe User contendo nome, email e telefone.

// Declare uma interface Notifier contendo o método `void notify(User user, String message)`.

// Implemente as seguintes classes que implementam a interface Notifier e implementam o método notify mostrando na tela as mensagens indicadas.

// - NotifierSMS: "enviando SMS para : ''".
// - NotifierEmail: "enviando e-mail para : ''".
// - NotifierPopUp: "enviando pop-up para : ''".
// - NotifierAplicativo: "enviando notificação no aplicativo instalado em :  ''".

// -----------------------------