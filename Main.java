class bank_account {
        String accounthold_name;
        double amount;
        double balance;
    void calculate(bank_account receive,double amount){
    if(balance>=amount){
        balance=balance-amount;
        receive.balance=receive.balance+amount;
    }
    else{
        System.out.println("Insufficient balance");
    }
}
}

public class Main {
        public static void main(String[] args) {
            bank_account a1=new bank_account();
            bank_account a2=new bank_account();
            a1.balance=20000;
            a2.balance=15000;
            a1.calculate(a2,5000);
            a2.calculate(a1,6000);
            System.out.println("a1 balance: "+a1.balance);
            System.out.println("a2 balance: "+a2.balance);
    }
}