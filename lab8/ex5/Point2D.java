
class Point2D{
    public Point2D(double x, double y){
        this._x = x;
        this._y = y;

    }

   @Override
    public int hashCode(){
        return (Double.hashCode(_y)^Double.hashCode(_x));
    }

    @Override
    public boolean equals(Object obj){
        Point2D other = (Point2D) obj;
        if((this._x == other._x) && (this._y == other._y)){
            return true;
        }

        return false;
    }
    private double _x;
    private double _y;
}

