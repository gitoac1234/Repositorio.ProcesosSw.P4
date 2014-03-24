package prestamos;

import java.util.Date;

public abstract class Loan {

	private Person person;

	private String comment;

	private Date loanDate;

	private Date expectedDevolutionDate;

	private Date devolutionDate;

	public Loan(Person p) {

		this(p, null, null, null);
		

	}

	public Loan(Person p, String comment) {

		this(p, comment, null, null);

	}

	public Loan(Person p, String comment, Date expectedDevolutionDate) {

		this(p, comment, null, expectedDevolutionDate);

	}

	public Loan(Person p, Date loanDate, Date expectedDevolutionDate) {

		this(p, null, loanDate, expectedDevolutionDate);

	}

	public Loan(Person p, String comment, Date loanDate,
			Date expectedDevolutionDate) {

		setPerson(p);

		this.comment = comment;

		this.loanDate = loanDate;

		this.expectedDevolutionDate = expectedDevolutionDate;

	}

	public void setPerson(Person p) {

		if (p == null) {

			throw new IllegalArgumentException("Person is null");

		}

		this.person = p;

	}

	public Person getPerson() {

		return person;

	}

	public String getComment() {

		return comment;

	}

	public void setComment(String comment) {

		this.comment = comment;

	}

	public Date getLoanDate() {

		return loanDate;

	}

	public void setLoanDate(Date loanDate) {

		this.loanDate = loanDate;

	}

	public Date getExpectedDevolutionDate() {

		return expectedDevolutionDate;

	}

	public void setExpectedDevolutionDate(Date expectedDevolutionDate) {

		this.expectedDevolutionDate = expectedDevolutionDate;

	}

	public void closeLoan() {

		if (!isClosed()) {

			this.devolutionDate = new Date();

		}

	}

	public boolean isClosed() {

		return this.devolutionDate != null;

	}

	public Date getDevolutionDate() {

		return devolutionDate;

	}

	public boolean equals(Object obj) {

		if (obj instanceof Loan) {

			Loan other = (Loan) obj;

			return other.getPerson().equals(this.getPerson())
					&&

					Util.equalObjects(other.getLoanDate(), this.getLoanDate())
					&&

					Util.equalObjects(other.getExpectedDevolutionDate(),
							this.getExpectedDevolutionDate())
					&&

					Util.equalObjects(other.getDevolutionDate(),
							this.getDevolutionDate()) &&

					Util.equalObjects(other.getComment(), this.getComment());

		}

		return false;

	}

	public String toString() {

		return getPerson().toString() + ", " + "loan date: " + getLoanDate()
				+ " " + (isClosed() ? "(returned item)" : "(not returned yet)");

	}

}
