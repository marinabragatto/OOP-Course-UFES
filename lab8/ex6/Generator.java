
interface Generator<T>{
    public void reset();
    public boolean is_over();
    public T next();
}