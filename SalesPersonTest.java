public class SalesPersonTest {
    public static void main(String[] args) {
        SalesPerson Sp = new SalesPerson("Mike",35,"five");
        Sp.printSalesPerson();
        System.out.println(".......................................");

        SalesManager Sm = new SalesManager("Jon",39,"ten","makes plan","takes decision");
        Sm.printSalesManager();
        System.out.println("........................................");

    }
}
class SalesPerson
{
    String name;
    int age;
    String salesQty;

    public SalesPerson(String name, int age, String salesQty) {
        this.name = name;
        this.age = age;
        this.salesQty = salesQty;
    }
    void printSalesPerson(){
        System.out.println("Sales person name is " +name+ " his age is " +age+ " and he sales " +salesQty+ " items in a day.");
    }
}
class SalesManager extends SalesPerson {
    String makesPlan;
    String takesDecision;

    public SalesManager(String name, int age, String salesQty, String makesPlan, String takesDecision) {
        super(name, age, salesQty);
        this.makesPlan = makesPlan;
        this.takesDecision = takesDecision;
    }
    void printSalesManager(){
        System.out.println("Sales manager name is " +name+ " his age is " +age+ " he sales " +salesQty+ " items in a day. He "+makesPlan+ " " +takesDecision+  "  . ");
    }
}