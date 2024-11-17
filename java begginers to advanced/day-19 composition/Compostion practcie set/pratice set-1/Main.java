public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Lamp lamp = new Lamp("classic", false, 12);
        Bed bed = new Bed("western", 12, 45, 23, 10);
        Ceiling celing = new Ceiling(12, 34);

        Room room = new Room("harshad", wall1, wall2, wall3, wall4, lamp, bed, celing);

        room.getLamp().turnon();
        room.getBed().make();
        System.out.println(room.getBed().getStyle());

    }
}
