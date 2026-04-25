

class Item{
    public Item(Livro livro, int quantidade_disponivel){
        this._livro = livro;
        this._quantidade_disponivel = quantidade_disponivel;
    }

    public void incrementa_quantidade(){
        this._quantidade_disponivel++;       
    }

    public void decrementa_quantidade(){
        this._quantidade_disponivel--;       
    }

    public retorna_livro(){
        return this._livro;
    }

    public retorna_quantidade_disponivel(){
        return this._quantidade_disponivel;
    }


    public Livro _livro;
    public int _quantidade_disponivel;

}