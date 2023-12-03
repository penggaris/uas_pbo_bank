import java.util.Objects;

public class Login extends Daftar{

    public static void viewLoginPage() {
        System.out.println("LOGIN PAGE");
        System.out.println("(Ketikkan 'exit' untuk kembali)");
        System.out.print("Username : ");
        user = SeoulbankApp.input();
        cancel(user);
        cekUser(user);
        System.out.print("Password : ");
        pass = SeoulbankApp.input();
        cancel(pass);
        cekPass(pass);
        login(user);
    }

    public static void cekUser(String user) {
        while (!SeoulbankApp.validasiUser(user)) {
            System.out.println("Username belum terdaftar !");
            System.out.print("Username : ");
            user = SeoulbankApp.input();
            cancel(user);
        }
    }
    public static void login(String user) {
        if (Objects.equals(user, "admin")) {
            Admin.viewMenuPage(user);
        } else {
            User.viewMenuPage(user);
        }
    }

    public static void cekPass(String pass) {
        while (!SeoulbankApp.validasiPass(pass)) {
            System.out.println("Password Salah !");
            System.out.print("Password : ");
            pass = SeoulbankApp.input();
        }
    }


}