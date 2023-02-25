public class Bai2 {
    class vector{
        private double x;
        private double y;
        private double z;   
     
    public vector(double x, double y, double z ){
        this.x = x;
        this.y = y;
        this.z = z;       
    }   
    public double getx(){
        return x;      
    }
    public double gety(){
        return y; 
    }
    public double getz(){
        return z; 
    }
    public vector cong(vector v) {
        return new vector(x + v.getx(), y + v.gety(), z + v.getz());
    }
    public vector tru(vector v) {
        return new vector(x - v.getx(), y - v.gety(), z - v.getz());
    }
    public vector nhan(double k) {
        return new vector(k * x, k * y, k * z);
    }
    public double nhanVH(vector v) {
        return x * v.getx() + y * v.gety() + z * v.getz();
    }
}