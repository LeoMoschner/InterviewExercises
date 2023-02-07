package Leo.sumanEx1;

public class BillingStatus {

        private int user_id;
        private int ad_delivery_pennies = 0;
        private int payment_pennies = 0;

    public BillingStatus(int user_id, int ad_delivery_pennies, int payment_pennies) {
        this.user_id = user_id;
        this.ad_delivery_pennies = ad_delivery_pennies;
        this.payment_pennies = payment_pennies;
    }

    public BillingStatus(int user_id) {
        this.user_id = user_id;
    }

        public int getUser_id() {
        return user_id;
    }

        public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

        public int getAd_delivery_pennies() {
        return ad_delivery_pennies;
    }

        public void setAd_delivery_pennies(int ad_delivery_pennies) {
        this.ad_delivery_pennies = ad_delivery_pennies;
    }

        public int getPayment_pennies() {
        return payment_pennies;
    }

        public void setPayment_pennies(int payment_pennies) {
        this.payment_pennies = payment_pennies;
    }

        @Override
        public String toString() {
        return "BillingStatus{" +
                "user_id=" + user_id +
                ", ad_delivery_pennies=" + ad_delivery_pennies +
                ", payment_pennies=" + payment_pennies +
                '}';

    }
}
