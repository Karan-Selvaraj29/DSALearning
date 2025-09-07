
//Protoype design pattern
interface Shape{
    Shape clone();
    void draw();
}


class Circle implements Shape {
    private String color;

    public Circle(String color){
        this.color=color;
    }
    @Override
    public Shape clone(){
        return new Circle(this.color);
    }
    @Override
    public void draw(){
        System.out.println("The colur of the shape is "+color);
    }
}
class ShapeClient{
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype){
        this.shapePrototype=shapePrototype;

    }
    public Shape createPrototype(){
        return shapePrototype.clone();
    }

}

public class PrototypeExample{

    public static void main(String[] args) {
        Shape circleProto = new Circle("red");
        ShapeClient client = new ShapeClient(circleProto);
        Shape redcircle = client.createPrototype();

        redcircle.draw();
    }
}

