
public class Vector {
    public int x;
    public Vector (int xParam) {
        this.x = xParam;
    }
    public Vector add(Vector vec) { 
        return new Vector (this.x + vec.x);
    };
    public Vector subtract(Vector vec) {
        return new Vector (this.x - vec.x);
    };
    public int distance(Vector vec) {
        int result = Math.abs(this.x - vec.x);
        return result;
    };
}