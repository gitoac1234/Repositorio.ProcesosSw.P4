package prestamos;

import java.math.BigDecimal;

public class MoneyLoan extends Loan {

	private BigDecimal amount;

	public MoneyLoan(Person p, BigDecimal amount) throws ArithmeticException {

		super(p);
		
		if (amount.compareTo(BigDecimal.ZERO) > 0) {

			setAmount(amount);

		} else {

			throw new ArithmeticException();

		}
		
	}

	public MoneyLoan(Person p, MoneyLoan ml) throws ArithmeticException {

		this(p, ml.getAmount());

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
