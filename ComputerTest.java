import classificationofcomputer.bypurpose.GeneralPurpose;
import classificationofcomputer.bypurpose.SpecialPurpose;
import classificationofcomputer.bysize.Mainframe;
import classificationofcomputer.bysize.Micro;
import classificationofcomputer.bysize.Mini;
import classificationofcomputer.bysize.Super;
import classificationofcomputer.bytype.Analog;
import classificationofcomputer.bytype.Digital;
import classificationofcomputer.bytype.Hybrid;

public class ComputerTest {
    public static void main(String[] args) {
        System.out.println("CLASSIFICATION OF COMPUTER");
        System.out.println("By purpose");
        GeneralPurpose gp =new GeneralPurpose();
        gp.writing();
        SpecialPurpose sp=new SpecialPurpose();
        sp.specialTask();
        System.out.println(".........................");
        System.out.println("By size");

        Mainframe mf=new Mainframe();
        mf.multiProgramming();
        Micro mc = new Micro();
        mc.using();
        Mini mini =new Mini();
        mini.digital();
        Super spr=new Super();
        spr.powerFull();
        System.out.println("............................");
        System.out.println("By type");
        Analog al=new Analog();
        al.measure();
        Digital di=new Digital();
        di.calculate();
        Hybrid hy=new Hybrid();
        hy.combine();








    }
}
