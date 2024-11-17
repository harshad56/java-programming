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
            // using the record type in java
            Lrecord r = new Lrecord("356700" + i, name, "05/11/1995", "java masterclass");

            System.out.println(r);
        }

        System.out.println("---------------------------------------------------------- ");
        /*----------------------------------------------------------*/
        // here difference between pojo and record
        System.out.println("\n" + "here difference between pojo and record");
        // for pojo
        Pojo p = new Pojo("356700", "harshad", "05/11/1995", "java masterclass");
        // for record
        Lrecord recordstudent = new Lrecord("46436347834", "yash", "6/09/2024", "java matserclass");

        System.out.println("\n" + "when using pojo:" + p);
        System.out.println("\n" + "record using:" + recordstudent);

        System.out.println("\n" + p.getName() + " is taking:" + p.getClasslist());
        System.out.println(recordstudent.name() + " is taking:" + recordstudent.classlist());

        /*---------------------------------------------------------- */
    }
}