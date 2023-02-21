public class AbstractTest {
    public static void main(String[] args) {
        samsungTv samsung =new samsungTv();
        philipTv philip = new philipTv();

        samsung.watch();
        philip.watch();

        samsung.playGame();
        philip.playGame();


    }
}
abstract class Tv
{
    abstract void watch();
   abstract void playGame();

    }

class samsungTv extends Tv{
    void watch(){
     System.out.println("we can watch samsung tv");
 }
    void playGame(){
        System.out.println("we can play game in samsung tv");
    }
 }
class philipTv extends Tv {
    void watch() {
        System.out.println("we can watch philip tv");

    }
    void playGame(){
        System.out.println("we can play game in philip tv");
    }

}