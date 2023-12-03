import java.util.Objects;

public class Transaksi extends User {
    public static void viewTransaksi(String user) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Username\t| Nominal\t| Jenis Transaksi\t| Saldo Akhir\t|");
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");

        if(user == null){
            for(int i = 0; i < SeoulbankApp.trx1.length; i++){
                System.out.println("| "+SeoulbankApp.trx1[i]+"\t\t| "+SeoulbankApp.trx2[i]+"\t\t\t| "+SeoulbankApp.trx3[i]+"\t\t| "+SeoulbankApp.getTrx4()[i]+"\t\t\t| ");
            }
        } else{
            for(int i = 0; i < SeoulbankApp.trx1.length; i++) {
                if (Objects.equals(SeoulbankApp.trx1[i], user)) {
                    System.out.println("| " + SeoulbankApp.trx1[i] + "\t\t| " + SeoulbankApp.trx2[i] + "\t\t\t| " + SeoulbankApp.trx3[i] + "\t\t| " + SeoulbankApp.getTrx4()[i] + "\t\t\t| ");
                }
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Tekan enter untuk kembali ke halaman sebelumnya");
        SiBangApp.input();
        Admin.viewMenuPage(user);
    }
}
