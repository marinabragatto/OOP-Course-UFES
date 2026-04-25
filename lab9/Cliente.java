
public class Cliente{

    public Cliente(String nome, String telefone, String email, double dist_entrega){
        _nome = nome;
        _telefone = telefone;
        _dist_entrega = dist_entrega;
        _email = email;
    }

    public String retorna_nome(){
        return _nome;
    }

    public String retorna_telefone(){
        return _telefone;
    }

    public String retorna_email(){
        return _email;
    }

    public double retorna_dist_entrega(){
        return _dist_entrega;
    }


    private String _nome;
    private String _telefone;
    private String _email;
    private double _dist_entrega;
}