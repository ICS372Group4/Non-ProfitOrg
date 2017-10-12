import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
	private Date date;
	private int amount;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Transaction(int amount, Date date) {
		this.amount = amount;
		this.date = date;
	}
}