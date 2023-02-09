public class WorkTest {
    public static void main(String[] args) {
        byte x=8;

        Work myWork=new Work();
        myWork.works();
        myWork.works("Ashok");
        myWork.works(8);
        myWork.works(x,"sunday");

    }

}
class Work
{
    void works(){
        System.out.println("He is working....");
    }
    void works(String hisName){
        System.out.println("the worker name is :" +hisName);
    }
    void works(int hour){
        System.out.println("his working hour:" +hour);

        }
        void works(byte hour, String days){
            System.out.println("working hour and day is:" +hour+ ":"+days);
        }

    }
