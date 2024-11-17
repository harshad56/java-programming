public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String name;
            switch (i) {
                case 1:
                    name = "harshad";
                    break;

                case 2:
                    name = "karan";
                    break;

                case 3:
                    name = "shyam";
                    break;

                case 4:
                    name = "harsh";
                    break;

                case 5:
                    name = "haroi";
                    break;

                default:
                    name = "annoyms";
            }

            Pojo p = new Pojo("356700" + i, name, "05/11/1995", "java masterclass");

            System.out.println(p);
        }
    }
}