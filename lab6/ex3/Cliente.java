public class Cliente{
    private String nome;
    private String cpf;

    public Cliente(String nome_in, String cpf_in){
        this.nome = nome_in;
        this.cpf = cpf_in;
    }

    public String retorna_nome_cliente(){
        return this.nome;
    }
}