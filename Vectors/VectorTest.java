public class VectorTest {
    public static void main(String[] args) {
        Vector3 v3a = new Vector3(0, 5, 20);
        Vector3 v3b = new Vector3(3, 9, 24);

        Vector3 resultAdd = v3a.add(v3b);
        Vector3 resultSub = v3a.subtract(v3b);
        double resultDis = v3a.distance(v3b);
        System.out.println(resultAdd.x + ", " + resultAdd.y + ", " + resultAdd.z);
        System.out.println(resultSub.x + ", " + resultSub.y + ", " + resultSub.z);
        System.out.println(resultDis);

    }
}