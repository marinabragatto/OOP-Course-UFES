
public class Fibonacci implements Generator<Integer>{
    Fibonacci(int num_items_final){
        this._num_items_final = num_items_final;
        this._penultimo_valor = 1;
        this._ultimo_valor = 1;
        this._num_items_produzidos = 0;
    }

    public void reset(){
        this._num_items_produzidos = 0;
        this._penultimo_valor = 0;
        this._ultimo_valor = 1;        

    }
    public boolean is_over(){
        if(this._num_items_produzidos == this._num_items_final){
            return true;
        }        

        return false;

    }
    public Integer next(){
        Integer antigo_ultimo = this._ultimo_valor; 
        this._ultimo_valor = this._ultimo_valor + this._penultimo_valor;
        this._penultimo_valor = antigo_ultimo;
        this._num_items_produzidos++;

        return antigo_ultimo;
    }

    private int _penultimo_valor;
    private int _ultimo_valor;
    private int _num_items_produzidos;
    private int _num_items_final;
}


