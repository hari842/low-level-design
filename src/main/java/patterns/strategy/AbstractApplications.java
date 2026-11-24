package patterns.strategy;

public abstract class AbstractApplications {
    protected IPayment payment;

    void display() {
        System.out.println("DISPLAY METHOD");
    }

    void makePayment() {
        payment.pay();
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void getPayment() {
        System.out.println("Print this : " + this.payment.toString());
    }
}
