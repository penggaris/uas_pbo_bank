import java.util.Objects;

public class Setor extends User{
    public static Integer setor;
    public static void viewSetor(String user) {
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("(Ketikkan 'exit' untuk kembali)");
        System.out.print("NOMINAL SETOR : ");
        var input = SeoulbankApp.inputNumber();
        if(Objects.equals(input, "x")){
            User.viewMenuPage(user);
        }
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        Integer setor = Integer.parseInt(input);
        if(setor >= 0 ){
            SeoulbankApp.addTrx(user, "Setor   ",setor);
            User.viewMenuPage(user);
        } else {
            System.out.println("Masukkan nominal tersebut > 0");
            viewSetor(user);
        }
    }
}
