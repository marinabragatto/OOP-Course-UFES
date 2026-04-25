import java.util.ArrayList;

class Leitor{

    public Leitor(String nome){
        this._nome = nome;
        this._emprestimos = new ArrayList<Emprestimo>();
    }
    
    public void adicionar_emprestimo(Emprestimo emprestimo){
        this._emprestimos.add(emprestimo);
    }

    public String retorna_nome(){
        return this._nome;
    }

    private String _nome;
    private ArrayList<Emprestimo> _emprestimos;
}