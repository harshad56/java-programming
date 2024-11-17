
public class Arrays2 {
    public static void main(String[] args) {
        // String[] student = { "harshad", "karan", "ravi", "kagi" };
        // System.out.println(student.length);
        // System.out.println(student[3]);

        // float[] marks = { 45, 67, 78, 34, 89 };
        // System.out.println(marks[3]);

        /*----------------------example-1------------------------------- */
        int[] marks2 = { 100, 23, 45, 67, 89 };
        // System.out.println(marks2.length);

        // METHOD-1(TO PRINT ALL ELEMENTS IN ARRAY)
        for (int i = 0; i < marks2.length; i++) {
            System.out.println(marks2[i]);
        }

        System.out.println("---TO PRINT REVERSE ORDER-----");
        for (int i = marks2.length - 1; i >= 0; i--) {
            System.out.println(marks2[i]);

        }

        /*---------USING FOR ECH LOOP TO PRINT ONLY ELEMRNT IN ARRAY----- */
        // METHOD-2(TO PRINT ALL ELEMENTS IN ARRAY)
        System.out.println("-----USING FOR EACH LLOP-------");
        for (int element : marks2) {
            System.out.println(element);
        }

    }
}
