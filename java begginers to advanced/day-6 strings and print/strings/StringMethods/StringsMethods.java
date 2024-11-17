public class StringsMethods {
    public static void main(String[] args) {
        // methods
        // 1)lenght(),
        // 2)ToUpperCase(),
        // 3)ToLowerCase(),
        // 4)trim(),
        // 5)substring(),
        // 6)replace(),
        // 7)startWith(),
        // 8)endswith(),
        // 9)charAt()
        // 10)indexOf(),
        // 11)lastIndexOf(),
        // 12)equals()
        String s1 = "Hello World";
        // 1)
        System.out.println(s1.length());// 11
        // 2)
        System.out.println(s1.toLowerCase());// hello world
        // 3
        System.out.println(s1.toUpperCase());// HELLO WORLD
        /*------------------------------------------------------------------- */

        String s2 = " hello ";// here indexing no is 0=space,1=h,2=e,3=l,4=l,5=0
        // 4)
        System.out.println(s2.trim());// trim means it remove space in left and right hand side in string
        /*--------------------------------------------------------------- */

        // 5)
        System.out.println(s2.substring(2));// it start from index no here start from index no-2
        System.out.println(s2.substring(3));

        // 6)
        System.out.println(s2.substring(0, 5));
        // original word=" hello "it gets= hell
        /*
         * returns a substring from start index no.start index is included but end index
         * is excluded
         */

        /*--------------------------------------------------------------- */
        // 7)
        System.out.println(s2.replace("h", "d"));// it replace old char to new char//dello
        // 8)
        System.out.println(s2.replace("hello", "gello"));// gello
        // replace word ,letter
        /*--------------------------------------------------------------- */

        // 9)
        String s3 = "harshad";
        System.out.println(s3.startsWith("h"));// true
        // it check letters in string start with letters in input is same or not
        // 10)
        System.out.println(s3.endsWith("a"));// False
        System.out.println(s3.endsWith("ad"));// True
        /*---------------------------------------------------------------------- */
        // 11)
        System.out.println(s3.charAt(1));
        /*------------------------------------------------------------ */
        // 12)
        System.out.println(s3.indexOf("har"));// it returns 0 position beacuse it h on 0 index they check first letter
                                              // example
        System.out.println(s3.indexOf("h"));// it returns 0 position

        System.out.println(s3.indexOf("h", 4));// it check index 5 there are alredy are h orginal string="harshad" but
                                               // when the wrong condition it returns-1

        /*--------------------------------------------------------------------- */
        // 13)
        String s4 = "karan";
        System.out.println(s4.lastIndexOf("n"));// 4
        System.out.println(s4.lastIndexOf("an", 3));
        /*------------------------------------------------------------------ */
        // 14)
        System.out.println(s4.equals("karan"));// true
        System.out.println(s4.equalsIgnoreCase("karaN"));// it gets true beacause it dont check uppercase or lowercase
                                                         // of letter

        System.out.println("hi am harshad \"go to school\"");
    }
}
