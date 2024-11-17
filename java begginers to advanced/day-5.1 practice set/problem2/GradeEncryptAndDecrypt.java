
public class GradeEncryptAndDecrypt {
    public static void main(String[] args) {
        // encrpyt
        char grade = 'B';
        grade = (char) (grade + 8);// type casting beacuse if int and char cannot add
        System.out.println(grade);

        // decrepyt
        grade = (char) (grade - 8);
        System.out.println(grade);

    }
}
