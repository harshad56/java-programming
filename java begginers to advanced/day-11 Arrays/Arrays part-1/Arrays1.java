
public class Arrays1 {
    public static void main(String[] args) {
        // you can do array declration with two types

        // 1(declration and memory allocation)
        int[] marks1 = new int[5];
        marks1[0] = 100;
        marks1[1] = 90;
        marks1[2] = 80;
        marks1[3] = 70;
        marks1[4] = 60;
        marks1[4] = 89;
        System.out.println(marks1[4]);

        // 2(declration ,memory allocation and intilzation together) it is use is simple
        int[] marks2 = { 100, 23, 45, 67, 89 };
        System.out.println(marks2[3]);

    }
}
