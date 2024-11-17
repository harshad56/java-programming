
public class Array8 {
    public static void main(String[] args) {
        int[][][] student = { { { 12, 45, 67 }, { 56, 78, 90 }, { 56, 89, 34 } },
                { { 12, 67, 89 }, { 56, 67, 34 }, { 23, 67, 89 } },
                { { 34, 78, 67 }, { 45, 67, 89 }, { 45, 78, 90 } } };

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                for (int k = 0; k < student[j].length; k++) {
                    System.out.print(student[i][j][k] + " ");
                }
                System.out.println("");

            }
            System.out.println("");
        }
        
        /*------------------------------------------------------------ */
        // or
        for (var outer : student) {
            for (var inner : outer) {
                for (var score : inner) {
                    System.out.print(score + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        /*------------------------------------------------------------ */
    }

}
