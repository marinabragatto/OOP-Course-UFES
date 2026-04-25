

class Range implements Generator<Double>{
    public Range(double valor_inicial, double valor_final, double passo){
        this._valor_atual = valor_inicial;
        this._valor_inicial = valor_inicial;
        this._valor_final = valor_final;
        this._passo = passo;
    }
    public void reset(){
        this._valor_atual = this._valor_inicial;
    }
    public boolean is_over(){
        if(this._passo > 0){
            if((this._valor_atual == this._valor_final) || (this._valor_atual > this._valor_final)){
                return true;
            }
        }
        else if(this._passo < 0){
            if((this._valor_atual == this._valor_final) || (this._valor_atual < this._valor_final)){
                return true;
            }
        }


        return false;
    }
    public Double next(){
        double antigo = this._valor_atual;
        this._valor_atual += this._passo;
        return antigo;
    }

    private double _valor_atual;
    private double _valor_inicial;
    private double _valor_final;
    private double _passo;

}

// - No construtor, receba o valor inicial, o valor final e o passo de atualização da sequência. Crie um atributo privado valor_atual que irá armazenar o próximo valor a ser retornado pelo gerador.

