import java.time.LocalDate;

public class Transaction {
    private int txId;
    private LocalDate txDate;
    private float txAmount;
    private boolean txStatus;
    private boolean txArrears;

    public Transaction(int txId, LocalDate txDate, float txAmount, boolean txStatus, boolean txArrears) {
        this.txId = txId;
        this.txDate = txDate;
        this.txAmount = txAmount;
        this.txStatus = txStatus;
        this.txArrears = txArrears;
    }

    public int getTxId() { return txId; }
    public LocalDate getTxDate() { return txDate; }
    public float getTxAmount() { return txAmount; }
    public boolean isTxStatus() { return txStatus; }
    public boolean isTxArrears() { return txArrears; }

    @Override
    public String toString() {
        return "Transaction [ID=" + txId + ", Date=" + txDate + ", Amount=" + txAmount +
                ", Status=" + txStatus + ", Arrears=" + txArrears + "]";
    }
}




