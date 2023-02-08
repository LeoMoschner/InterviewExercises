package lean.billingStatus;

class BillingStatus {
    private int adDeliveryPennies;
    private int paymentPennies;
    public BillingStatus(int adDeliveryPennies, int paymentPennies) {
        this.adDeliveryPennies = adDeliveryPennies;
        this.paymentPennies = paymentPennies;
    }
    public int getAdDeliveryPennies() {
        return adDeliveryPennies;
    }
    public int getPaymentPennies() {
        return paymentPennies;
    }
    public void setAdDeliveryPennies(int adDeliveryPennies) {
        this.adDeliveryPennies = adDeliveryPennies;
    }
    public void setPaymentPennies(int paymentPennies) {
        this.paymentPennies = paymentPennies;
    }
    @Override
    public String toString() {
        return "ad_delivery_pennies: " + this.adDeliveryPennies + " payment_pennies: " + this.paymentPennies;
    }

}
