public class bankAccount {

    double balance;
    double overdraftLimit;
    double overdraftUsage;

    public bankAccount(double firstDeposit) {
        this.balance = firstDeposit;

        if (firstDeposit <= 500) {
            this.overdraftLimit = 50;
        } else
            this.overdraftLimit = firstDeposit * 0.5;
        
        this.overdraftUsage = 0;    
    }
    
    public void checkBalance() {
        System.out.println("Saldo atual R$ " + balance);
    }
    public void checkOverdraft() {
        System.out.println("Seu limite do cheque especial é de " + overdraftLimit);
        System.out.println("Seu limite usado do cheque especial é de " + overdraftUsage);
    }
    public boolean isUsingOverdraft() {
        return overdraftUsage > 0;
    }
    public void deposit(double amount) {
        if (overdraftUsage > 0){
            double tax = overdraftUsage * 0.2;
            double totalPayOff = overdraftUsage + tax;
        
        if (amount >= totalPayOff) {
            amount -= totalPayOff;
            overdraftUsage = 0;
            balance += amount;
            System.out.println("\nParte do déposito foi usado para quitar o cheque especial e a taxa");
        } else {
            double amountPaid = amount / 1.2;
            overdraftUsage -= amountPaid;
            if (overdraftUsage < 0);
            overdraftUsage = 0;
            System.out.println("\nDepósito usado parcialmente para pagar o cheque especial.");
            return;
        }
        } else {
            balance += amount;
        }
        System.out.println("Depósito realizado. Novo saldo R$ " + balance); 
    }
    
    public void withdraw(double amount) {
        double totalAvaible = balance + (overdraftLimit - overdraftUsage);

        if (amount > totalAvaible) {
            System.out.println("Saldo insuficiente. Saque não autorizado.");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            double rest = amount - balance;
            balance = 0;
            overdraftUsage += rest;
        }
        System.out.println("Saque de R$ " + amount + " realizado com sucesso.");
    }

    public void payBankSlip(double amount) {
        double balanceAvaible = balance + (overdraftLimit - overdraftUsage);

        if (amount > balanceAvaible) {
            System.out.println("Você não tem saldo disponível para completar esta transação");
            return;
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            double rest = amount - balance;
            balance = 0;
            overdraftUsage += rest;
        }
    System.out.println("Boleto de R$ " + amount + " pago com sucesso.\nSeu novo saldo disponível é de R$ " + balance);    
    }
}
