import java.util.Scanner;

public class Modifikasi1DoWhile16{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = scan.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlahHari: ");
                jumlahHari = scan.nextInt();
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Jumlah hari cuti yang diminta melebihi jatah cuti yang tersisa.");
                }
            } else if (konfirmasi.equalsIgnoreCase("t")){
                break;
            }
        } while (jatahCuti > 0);

    }
}