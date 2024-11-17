
public class MultidimensionalArray {
    public static void main(String[] args) {
        // int[] marks = new int[5];// 1-D array

        int[][] flats = new int[2][3];// here two flors and 3 are flats in each floars
        // you can do aslo int[][] flats={{101,102,103},{201,202,203}}

        flats[0][0] = 101;// 1st floar[0],first room[0]
        flats[0][1] = 102;
        flats[0][2] = 103;

        flats[1][0] = 201;// 2nd flaor[1],first room[0]
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");

        }
        // or you can do this
        for (var outer : flats) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
