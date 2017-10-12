import java.io.Serializable;

public class CreditCard implements Serializable {
	private String cardNumber;
	private Donor donor;

	public CreditCard(String cardData, Donor donor) {
		this.cardNumber = cardData;
		this.donor = donor;
	}

	public boolean processCard() {
		// create new transaction
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Donor getDonor() {
		return donor;
	}

	public void setDonor(Donor donor) {
		this.donor = donor;
	}

}