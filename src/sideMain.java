public class sideMain {
    public static void main(String[] args){

//        Dog clifford = new Dog("Clifford", "Lab", 3, "Red");
//        System.out.println(clifford.toString());
//
//        Bicycle bikey = new Bicycle(2, 5, 4);
//        System.out.println(bikey.toString());

        Account bankAccount = new Account("newAccount", 100 );
        bankAccount.deposit(20);
        System.out.println(bankAccount);

        Account MattsAccount = new Account("Matt's Account", 1000);
        Account MyAccount = new Account("My Account", 0);
        MattsAccount.withdrawal(100);
        MyAccount.deposit(100);
        System.out.println(MattsAccount);
        System.out.println(MyAccount);


    }
}
