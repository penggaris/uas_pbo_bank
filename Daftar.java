import java.util.Objects;

public class Daftar {

    /**
     *daftar
     */
    public static String user;
    public static String pass;
    public static void viewDaftarPage() {
        System.out.println("-----------------------------");
        System.out.println("SIGN UP");
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'x' untuk kembali)");
        System.out.print("Username : " );
        user = SeoulbankApp.input();
        cancel(user);
        daftar(user);
        System.out.print("Password : ");
        pass = SeoulbankApp.input();
        SeoulbankApp.addAccount(user,pass);
        System.out.println("Akun Sudah Ditambahkan !");
        Login.viewLoginPage();
    }

    public static void daftar(String user) {
        while(SeoulbankApp.validasiUser(user)){
            System.out.println("Username sudah terdaftar !");
            System.out.print("Username : " );
            user = SeoulbankApp.input();
            cancel(user);
        }
    }

    public static void cancel(String user) {
        if(Objects.equals(user, "X") || Objects.equals(user, "x")){
            LandingPage.viewLandingPage();
        }
    }
}
