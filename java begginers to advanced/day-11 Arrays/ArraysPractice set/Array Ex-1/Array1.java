
public class Array1 {
    public static void main(String[] args) {
        float[] marks = new float[5];

        marks[0] = 1.3f;
        marks[1] = 2.4f;
        marks[2] = 5.7f;
        marks[3] = 5.6f;
        marks[4] = 2.5f;
        // or
        // also you can write like this float[] marks ={1.3f,2.4f,5.7f,5.6f}

        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("sum is:" + sum);

        /*-------------------USING FOR EACH LOOP----------------------------------- */
        // also you can write like
        float sum1 = 0;
        for (float element : marks) {
            sum1 += element;
        }
        System.out.println("sum is:" + sum1);
    }
}
