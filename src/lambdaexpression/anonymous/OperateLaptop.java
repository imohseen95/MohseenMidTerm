package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
            Laptop laptop = new Laptop() {
                @Override
                public void ramSize(int memorySize) {

                }

                @Override
                public void monitorSize(int screenSize) {

                }
            };
            laptop.monitorSize(8);
            laptop.ramSize(13);
            Phone phone = network -> System.out.println(network);
           // phone.cellularNetwork();
    }
}


        //please implement anonymous function for Phone interface


    //}
//}
