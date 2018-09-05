
public class Vector2 extends Vector {
    public int y;
    public Vector2(int xParam, int yParam) {
        super(xParam);
        this.y = yParam;
    }
    public Vector2 add(Vector2 vec) {
        Vector result = super.add(vec);
        Vector2 result2 = new Vector2(result.x, 0);
        result2.y = this.y + vec.y;
        return result2;
    };
    public Vector2 subtract(Vector2 vec) {
        Vector result = super.subtract(vec);
        Vector2 result2 = new Vector2(result.x, 0);
        result2.y = this.y - vec.y;
        return result2;
    };
    public double distance(Vector2 vec) {
        int xresult = super.distance(vec);
        int yresult = this.y - vec.y;
        double result = Math.sqrt(Math.pow(xresult, 2) + Math.pow(yresult, 2));
        return result;
    };
}