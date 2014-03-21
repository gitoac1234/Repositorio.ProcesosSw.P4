package prestamos;

public class ItemLoanException extends Exception {

	private Item item;

	/**
 
         * 
 
         */

	private static final long serialVersionUID = 1L;

	public ItemLoanException(Item item) {

		this.item = item;

	}

	public ItemLoanException(String arg0, Item item) {

		super(arg0);

		this.item = item;

	}

	public ItemLoanException(Throwable arg0, Item item) {

		super(arg0);

		this.item = item;

	}

	public ItemLoanException(String arg0, Throwable arg1, Item item) {

		super(arg0, arg1);

		this.item = item;

	}

	public Item getItem() {

		return item;

	}

}
