public class CalcTest {

	public static void main(String[] args) {
		Calc x = new Calc();
		x.setOperandOne(10.5);
		x.setOperation("+");
		x.setOperandTwo(5.2);
		x.performOperation();
		x.getResults();
	}

}
