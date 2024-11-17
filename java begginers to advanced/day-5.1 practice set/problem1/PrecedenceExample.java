
public class PrecedenceExample {
    public static void main(String[] args) {
        float a = 7 / 4f * 9 / 2f;// but you dont add f in end it get only 1 and 4 not 1.75 and 4.5
        // so you want complete float value then add f

        /*
         * =1.75*4.5 //but dont f in end it get1*4 so float ans goes=4.0
         * =7.875
         */
        System.out.println(a);
    }
}
