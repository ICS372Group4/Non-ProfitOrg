import java.io.Serializable;

public class TransactionList implements Serializable {
	private Transaction[] transactionCollection;

	public TransactionList() {
		transactionCollection = new Transaction[0/* number? */];
	}

	public int processDonations() {
		// create new transaction for each card/donor
	}

	public Transaction[] getTransactionCollection() {
		return transactionCollection;
	}

	public void setTransactionCollection(Transaction[] transactionCollection) {
		this.transactionCollection = transactionCollection;
	}

	public void listAll() {
		// display all transactions in the collection
	}

}