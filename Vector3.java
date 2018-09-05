
public class Vector3 extends Vector2 {
    public int z;
    public Vector3(int xParam, int yParam, int zParam) {
        super(xParam, yParam);
        this.z = yParam;
    }
    public Vector3 add(Vector3 vec) {
        Vector2 result = super.add(vec);
        Vector3 result2 = new Vector3(result.x, result.y, 0);
        result2.y = this.z + vec.z;
        return result2;
    };
    public Vector3 subtract(Vector3 vec) {
        Vector2 result = super.subtract(vec);
        Vector3 result2 = new Vector3(result.x, result.y, 0);
        result2.y = this.z - vec.z;
        return result2;
    };
    public double distance(Vector3 vec) {
        double result2D = super.distance(vec);
        int zresult = this.z - vec.z;
        double result3D = Math.sqrt(Math.pow(result2D, 2) + Math.pow(zresult, 2));
        return result3D;
    };
}