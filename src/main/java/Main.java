import exceptions.UnsupportedMatrixOperationException;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		BigDecimal[][] array = new BigDecimal[][] {{new BigDecimal(5), new BigDecimal(6)},
													{new BigDecimal(7), new BigDecimal(8)}};
		MutableMatrix matrix = new ImmutableMatrix(array);
		try {
			matrix.setElement(1, 1, new BigDecimal(9));
		} catch (UnsupportedMatrixOperationException e) {
			System.out.println("операція не доступна");
		}
	}
	
}
