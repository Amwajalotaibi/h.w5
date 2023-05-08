// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee s1= new Employee();
        s1.setId("W1");
        s1.setName("Sara");
        s1.setSalary(7000);
        s1.setAnnualSalary(84000);

        System.out.println("ID "+ s1.getId());
        System.out.println("welcome "+ s1.getName());
        System.out.println("your salary is :"+ s1.getSalary());
        System.out.println("your Annualsalary is :  "+ s1.getAnnualSalary());

        System.out.println("your raisedSalary:  "+ s1.raisedSalary(10));
    }
}