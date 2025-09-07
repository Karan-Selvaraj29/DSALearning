
// Abstract factory method design pattern
interface CarFactory{
    Car createCar();
    CarSpec createSpec();
}
class NorthAmerica implements CarFactory{

    public Car createCar(){
        return new Sedan();
    }
    public CarSpec createSpec(){
        return new Northamericaspec();
    }
}

class SouthAmerica implements CarFactory{
    public Car createCar(){
        return new Suv();
    }
    public CarSpec createSpec(){
        return new Southamericaspec();
    }
}

interface Car{
    void assemble();
}
interface CarSpec{
    void run();
}

class Sedan implements Car{
    public void assemble(){
        System.out.println("this is North America car:Sedan");
    }
}
class Northamericaspec implements CarSpec{
    public void run(){
        System.out.println("this is Sedan spec");
    }
}
class Suv implements Car{
    public void assemble(){
        System.out.println("this is South America car:SUV");
    }
}
class Southamericaspec implements CarSpec{
    public void run(){
        System.out.println("this is SUV spec");
    }
}

public class CarFactoryClient {
    public static void main(String[] args){
        CarFactory northcarfactory = new NorthAmerica();
        Car northamericacar = new Sedan();
        CarSpec northspec = new Northamericaspec();

        northamericacar.assemble();
        northspec.run();


        CarFactory southcarfactory = new SouthAmerica();
        Car southamericacar = new Suv();
        CarSpec southspec = new Southamericaspec();

        southamericacar.assemble();
        southspec.run();

    }

}
