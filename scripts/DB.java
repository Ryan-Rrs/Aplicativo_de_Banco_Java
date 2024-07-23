package scripts;

public class DB {
    private String name_user;
    private String cpf_user;
    private String password_user;
    private Balance balance_user;
    private String key;

    public DB(String name_user, String cpf_user, String password_user, Double balance_user, String key) {
        this.name_user = name_user; // 'this.nome' refere-se à variável de instância
        this.cpf_user = cpf_user; //
        this.password_user = password_user; // 'this.type' refere-se à variável de instância
        this.balance_user = new Balance(balance_user); // 'this.nota' refere-se à variável de instância
        this.key = key;
    }

    public String getName() {
        return name_user;
    }

    public String getCpf() {
        return cpf_user;
    }

    public boolean confirm(String password) {
        return this.password_user.equals(password);
    }

    public boolean confirmKey(String key) {
        return this.key.equals(key);
    }

    public double getBalance() {
        return balance_user.getBalance();
    }

    public void setBalance(double balance) {
        balance_user.setBalance(balance);
    }

    public void deposit(double value) {
        balance_user.deposit(value);
    }

    public void withdraw(double value) {
        balance_user.withdraw(value);
    }

    public void payPix(double value) {
        balance_user.payPix(value);
    }

}