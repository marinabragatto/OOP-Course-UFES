import java.util.ArrayList;

class Emprestimo{

    public Emprestimo(Livro livro, String nome_leitor){
        this._livro = livro;
        this._nome_leitor = nome_leitor;
    }

    public boolean eh_esse_emprestimo(String nome_livro, String nome_leitor){
        if(_nome_leitor.equals(nome_leitor) && (this._livro.retorna_nome()).equals(nome_livro)){
            return true;
        }
        return false;
    }
    public String _nome_leitor;
    public Livro _livro;
}