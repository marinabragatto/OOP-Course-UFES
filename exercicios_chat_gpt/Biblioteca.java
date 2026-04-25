import java.util.ArrayList;
import java.util.HashMap;


public class Biblioteca{

    public Biblioteca(String nome){
        this._nome= nome;
        this._livros = new HashMap<String, Livro>();
        this._leitores = new HashMap<String, Leitor>();
        this._emprestimos = new ArrayList<Emprestimo>();
    }   

    public void adicionar_livro(Livro livro, int quantidade){
        Item item_novo = new Item(livro, quantidade);
        this._livros.put(livro.retorna_nome(), item_novo);
    }
    
    public void adicionar_leitor(Leitor leitor){
        this._leitores.put(leitor.retorna_nome(),leitor);
    }

    public void emprestar_livro(String titulo, String nome_leitor){
        Item item = this._livros.get(titulo);

        if(item.retorna_quantidade_disponivel()>0){ // Tem disponivel
            Leitor leitor = this._leitores.get(nome_leitor);
            Emprestimo emprestimo = new Emprestimo(item.retorna_livro(), leitor.retorna_nome());
            item.decrementa_quantidade();
        }
            
    } 

    public void devolver_livro(String titulo, String nome_leitor){
        Item item = this._livros.get(titulo);

        Emprestimo emprestimo;
        for(int i = 0; i < this._emprestimos.size(); i++){
            emprestimo = _this._emprestimos.get(i);
            if(emprestimo.eh_esse_emprestimo((item.retorna_livro()).retorna_nome))

        }

        if(item.retorna_quantidade_disponivel()>0){ // Tem disponivel
            Leitor leitor = this._leitores.get(nome_leitor);
            Emprestimo emprestimo = new Emprestimo(item.retorna_livro(), leitor.retorna_nome());
            item.decrementa_quantidade();
        }

    }

    private HashMap<String, Item> _livros;
    private HashMap<String, Leitor> _leitores;
    private ArrayList<Emprestimo> _emprestimos;
    private String _nome;


}
