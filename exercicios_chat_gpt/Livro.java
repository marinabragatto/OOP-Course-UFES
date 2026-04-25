

class Livro{
    public Livro(String nome, String autor){
        this._nome = nome;
        this._autor = autor;
    }
    public String retorna_nome(){
        return this._nome;
    }

    private String _nome;
    private String _autor;

}