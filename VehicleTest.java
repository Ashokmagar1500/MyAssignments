
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.Move();
        vehicle.engine.Energy();
        vehicle.engine.TransformFuel();
        System.out.println("......................." );

        Toyota toyota=new Toyota();
        toyota.Name();
        toyota.engine.TransformFuel();
        toyota.engine.Energy();
        System.out.println(".......................");

        Rav4 rav4=new Rav4();
        rav4.smallSuv();
        rav4.Name();
        rav4.engine.Energy();
        rav4.wheelAndDoors.Door();
        System.out.println("...........................");

        Honda honda = new Honda();
        honda.Move();
        honda.MakeYear();
        honda.engine.Energy();
        honda.wheelAndDoors.Door();
        honda.wheelAndDoors.wheel();
        accord Accord=new accord();
        Accord.flatCar();
        Accord.engine.TransformFuel();
        System.out.println("........................");

        mercedesBenz mercedes=new mercedesBenz();
        mercedes.Expensive();
        mercedes.engine.Energy();
        GClass gClass=new GClass();
        gClass.cost();
        gClass.wheelAndDoors.wheel();
        System.out.println("............................");
    }
}
class Vehicle
{
  Engine engine=new Engine();
  wheelAndDoors wheelAndDoors=new wheelAndDoors();
    void Move (){
        System.out.println("Vehicles are moving......");
    }
}
class Toyota extends Vehicle
{
    void Name() {
        System.out.println("toyota has a name....");
    }
}
class Honda extends Vehicle
{
    void MakeYear() {
        System.out.println("Honda car has a make year ");
    }
}
class mercedesBenz extends Vehicle {
    void Expensive (){
        System.out.println("Its very expensive car...");
    }
}
class Rav4 extends Toyota{
    void smallSuv (){
        System.out.println("rav4 is small suv .....");
    }
}
class accord extends Honda {
    void flatCar(){
        System.out.println("Honda accord is flat car....");
    }
}
class GClass extends mercedesBenz {
    void cost(){
        System.out.println("cost is high then other mercedes benz.");
    }
}
class Engine{
    void TransformFuel(){
        System.out.println("Engine is transforming fuel.");

    }
    void Energy (){
        System.out.println("engine is produce power.");
    }
}
class wheelAndDoors{
    void wheel(){
        System.out.println("vehicle has wheels.");
    }
    void Door(){
        System.out.println("vehicle has doors");
    }
}


