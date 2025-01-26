
interface DemoAno {

    void meth1();

    void maith2();

}
//but it is time counsming there a short process also using anonymous class so commented it

// class anoDeMo implements DemoAno {
//     public void display() {
//         System.out.println("dispaly");
//     }
//     @Override
//     public void meth1() {
//         System.out.println();
//     }
//     @Override
//     public void maith2() {
//         System.out.println();
//     }
// }
public class annyonuomusclass {

    public static void main(String[] args) {
        // anoDeMo a1= new anoDeMo();//always note leftside is refernce of class and left is new anoDemo is object creatiom and a1 is object
        // a1meth1();
        //____________________________________________________________//

        //so here started 
        //for reference we can used inteface 
        //this is annonymous class declaration
        DemoAno demo = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("meth1");
            }

            @Override
            public void maith2() {
                System.out.println("meth2");
            }

        };
        demo.meth1();

    }

}
