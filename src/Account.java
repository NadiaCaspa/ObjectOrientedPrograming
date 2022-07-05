public class Account {
    public String id;
    public String name;
    public double balance;


    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double c) {
        this.balance += c;
    }
// balance is what's in the account, debit is a purchase i want to make
    public boolean debit(double d) {
        if (this.balance <= d) {
            System.out.println("Amount exceeded");
            return false;
        } else {
            // otherwise if my balance is enough then the transaction works
            this.balance -= d;
            return true;
        }
    }
        //account A which is the transferTo is transferring  money which right now is double d to account destination
    public void transferTo(Account destination, double d) {
        // d which is money i want to transfer to account destination. first check to make sure it is less than amount in this.balance then add d to account destination
        if (d <= this.balance) {
            this.balance = this.balance - d;
            destination.balance += d;
            System.out.println("Transfer completed");
        } else {
            System.out.println("Amount exceeded");
        }
    }
    public String accountDetails(){
        return  this.name  +"the current balance in account " + this.id + "is " + this.balance ;
    }
}