package prestamos;

import java.util.Date;

public class ItemLoan extends Loan {

	private Item loanedItem;

	public ItemLoan(Person p, Date loanDate, Date devolutionDate, Item item,
			String comment) throws ItemLoanException {

		super(p, comment, loanDate, devolutionDate);

		setItem(item);

	}

	public ItemLoan(Person p, Date loanDate, Date devolutionDate, Item item)
			throws ItemLoanException {

		this(p, loanDate, devolutionDate, item, null);

	}

	public ItemLoan(Person p, Item item) throws ItemLoanException {

		this(p, null, null, item, null);

	}

	private void setItem(Item item) throws ItemLoanException {

		if (item == null) {

			throw new IllegalArgumentException("Item cannot be null");

		}

		if (item.isLended()) {

			throw new ItemLoanException("Item is already lended", item);

		}

		this.loanedItem = item;

	}

	public Item getItem() {

		return loanedItem;

	}

	public void closeLoan() {

		if (!super.isClosed()) {

			super.closeLoan();

			this.loanedItem.setLended(false);

		}

	}

}
