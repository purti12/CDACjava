class Bank1 {
    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank1 {
    @Override
    public int getBalance() {
        return 10000;
    }
}

class BankB extends Bank1 {
    @Override
    public int getBalance() {
        return 15000;
    }
}

class BankC extends Bank1 {
    @Override
    public int getBalance() {
        return 2000;
    }
}

public class Bank{
    public static void main(String[] args) {
        // Create objects for each bank
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        // Get and print the balances for each bank
        int balanceA = a.getBalance();
        int balanceB = b.getBalance();
        int balanceC = c.getBalance();

        System.out.println("Balance in Bank A: Rs " + balanceA);
        System.out.println("Balance in Bank B: Rs " + balanceB);
        System.out.println("Balance in Bank C: Rs " + balanceC);
    }
}
