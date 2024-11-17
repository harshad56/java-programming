//tip:-usinng such method we can call different classe use their method like this
public class main {
   public static void main(String[] args) {
    Car car= new Car();//here we call class with objects
    Message message=new Message();//here we call class with objects

    car.setmake("porche");
    car.setmodel("cyyt67");
    car.setcolor("red");
    car.setdoors(2);
    car.setConvertible(true);

    car.describeCar();//methods used by object
    message.messageoutput();//methods used by object
   } 
}
