import java.util.Objects;

public class Saldo {

    public static int Saldo;
    public static void viewSaldo(String user){
        for (int i = (SeoulbankApp.trx1.length); i > 0; i--) {
            if(Objects.equals(SeoulbankApp.trx1[(i-1)], user)){
                Saldo = SeoulbankApp.getTrx4()[(i-1)];
                System.out.printl ("-------------------------");
                System.out.println("Saldo Anda sebesar : "+Saldo);
                System.out.printl ("-------------------------");
                break;
            } else if (i == 0) {
                System.out.printl ("-------------------------");
                System.out.println("Saldo Anda sebesar : 0");
                System.out.printl ("-------------------------");
            }
        }
    }
}
