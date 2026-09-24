class BankAccount {
private String accNum;
private double balance;

BankAccount(String accNum,double balance){
    this.accNum=accNum;
    this.balance=balance>0?balance:0;
}
public double getBalance(){
    return balance;
}
public double deposit(double amount){
    if(amount>0){
        balance+=amount;
            }   
            return balance;
}
public String withdraw(double amount){
    if(amount>0&&amount<balance){
        balance=balance-amount;
        return "withdrawn successfully";
}
else{
    return "Insufficient balance";
}
}

public static void main(String[] argse){
    BankAccount p1=new BankAccount("112349283",10000);
    System.out.println(p1.getBalance());
    System.out.println(p1.withdraw(2000));
    System.out.println(p1.getBalance());
}
}