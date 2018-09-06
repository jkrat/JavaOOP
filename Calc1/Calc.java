public class Calc implements java.io.Serializable {
	private Double operandOne;
	private Double operandTwo;
	private String operation;
	private Double results;
    
	public Calc() {
		operandOne = null;
		operandTwo = null;
		operation = "";
	}
	
	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getResults() {
		System.out.println(results);
		return results;
	}

	public void setResults(Double results) {
		this.results = results;
	}
	
	public void performOperation() {
		if (operandOne != null  && operation != "" && operandTwo != null) {
			switch(operation) {
			case "+": results = operandOne + operandTwo;
			break;
			case "-": results = operandOne - operandTwo;
			break;
			default: System.out.println("invalid operation");
			break;
			}
		}
		else System.out.println("Try again");
	}
	
}