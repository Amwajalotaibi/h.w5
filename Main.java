// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          Account e1 = new Account();
                e1.setName("Ahmad");
                e1.setId("Ah");
                e1.setBalance(500);
                e1.debit(90);

        System.out.println( "ID : "+e1.getId());
        System.out.println("welcome : "+e1.getName());
        System.out.println("your balance : "+e1.getBalance());


         Account e2 = new Account();
                 e2.setName("sara");
                 e2.setId("Sa");
                 e2.setBalance(10);
                 e2.debit(5);

        System.out.println("ID : "+e2.getId());
        System.out.println("welcome : "+e2.getName());
        System.out.println("your balance : "+e2.getBalance());




        System.out.println("discount value : " +e1.credit(100));
        System.out.println("debit value : " +e2.debit(100));

        e2.transferTo(e1,100);
        System.out.println(e1);





    }
}