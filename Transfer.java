import java.util.Objects;

public class Transfer extends User{
    public static Integer transfer;
    public static void viewTransfer(String user) {
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("(Ketikkan 'exit' Untuk Kembali Ke Halaman Sebelumnya)");
        System.out.print("NOMINAL SALDO TRANSFER : ");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        var input = SeoulbankApp.inputNumber();
        if(Objects.equals(input, "x")){
            User.viewMenuPage(user);
        }
        System.out.print("TUJUAN TRANSFER : ");
        var tujuan = SeoulbankApp.input();
        Login.cekUser(tujuan);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        Integer transfer = Integer.parseInt(input);
        if(transfer <= Saldo.Saldo){
            SeoulbankApp.addTrx(user, "Transfer",-transfer);
            SeoulbankApp.addTrx(tujuan, "Transfer",transfer);
            User.viewMenuPage(user);
        } else {
            System.out.println("Saldo Anda Tidak Cukup Untuk Melakukan Transaksi Ini !");
            viewTransfer(user);
        }
    }
}
