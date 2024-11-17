
public class UseWhileLoopPrintNo {
    public static void main(String[] args) {
        // the while loops executes until specfied condition becomes false
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;

            /*
             * first loop run i=1 so it check i <= 3 its condition is true then i++(1+1)
             * goes i=2
             * then loop run i=2 so it check i <= 3 its condition is true then i++(2+1) goes
             * i=3
             * so then i=3 so it check i <= 3 yes 3 is equal to 3 then loop run then
             * i++(3+1) goes i=4
             * here i=4 so it check i <= 3 no i(4) is not less than equal to 3 so loop breks
             */
        }

        // while(true){
        // System.out.println("i am infinte while loop");
        // }
    }
}
