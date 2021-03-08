
package assignment;

public interface Transactions {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(Account ac, double amount);
}
