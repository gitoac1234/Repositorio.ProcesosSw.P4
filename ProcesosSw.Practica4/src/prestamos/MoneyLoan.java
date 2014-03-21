package prestamos;

import java.math.BigDecimal;

public class MoneyLoan {

	private BigDecimal amount;

	public MoneyLoan(BigDecimal amount) throws ArithmeticException {

		if (amount.compareTo(BigDecimal.ZERO) > 0) {

			setAmount(amount);

		} else {

			throw new ArithmeticException();

		}

		
		
		
	}

	public MoneyLoan(MoneyLoan ml) throws ArithmeticException {

		this(ml.getAmount());

	}

	public BigDecimal getAmount() {

		return amount;

	}

	public void setAmount(BigDecimal amount) {

		this.amount = amount;

	}

	public void sumAmount(BigDecimal bd) {

		amount = amount.add(bd);

	}

	public void sumAmount(double d) {

		sumAmount(BigDecimal.valueOf(d));

	}

	public void subtractAmount(BigDecimal bd) throws IllegalArgumentException {

		if (amount.compareTo(bd) > 0) {

			amount = amount.subtract(bd);

		} else {

			throw new IllegalArgumentException();

		}

	}

	public void subtractAmount(double d) throws IllegalArgumentException {

		subtractAmount(BigDecimal.valueOf(d));

	}

}
