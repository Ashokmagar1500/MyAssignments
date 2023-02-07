public class SimpleInterest {
    public static void main(String[] args) {
        SiInterest siInterest1=new SiInterest();
        siInterest1.calculateSiIntrest();
        siInterest1.calculateSiInterest2(2500,9,6.5f);
    }
}
class SiInterest
{
    void calculateSiIntrest()
    {
        int p=2500;
        int n=9;
        float r=6.5f;
        float si = (p*n*r)/100;
        System.out.println("simple interest is :" +si);
    }
    void calculateSiInterest2(int p, int n, float r)
    {
        float si=(p*n*r)/100;
        System.out.println("simple Interest is :" +si);
    }


}
