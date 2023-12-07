package case_study.models.booking;

public class Booking {
    private String ContractNumber;
    private String bookingCode;
    private Integer advanceDeposit;
    private Integer totalPayment;

    public Booking(String contractNumber, String bookingCode, Integer advanceDeposit, Integer totalPayment) {
        ContractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
    }

    public Booking() {
    }

    public String getContractNumber() {
        return ContractNumber;
    }

    public void setContractNumber(String contractNumber) {
        ContractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(Integer advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public Integer getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Integer totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "ContractNumber='" + ContractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDeposit=" + advanceDeposit +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
