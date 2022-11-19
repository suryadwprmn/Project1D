import java.util.Scanner;

public class Jawaban_1D_soal3 {


    public static Scanner inputuser= new Scanner(System.in);

    public static void tujuankota(){


            System.out.println(" SELAMAT DATANG DI PERUSAHAAN RENTAL MOBIL SEMOGA MAJU ");
            System.out.println(" ===================================================== ");
            System.out.println(" Masukkan Nama Anda = ");
            String nama = inputuser.nextLine();
            System.out.println(" Destinasti Tujuan Kota Anda ");
            System.out.println("1. Kudus / 'Masukkan Kode Plat (K)' ");
            System.out.println("2. Jakarta /'Masukkan Kode Plat (B)'");
            System.out.println("3. Jogja / 'Masukkan Kode Plat (AB)'");
            System.out.println("4. Karawang/ 'Masukkan Kode Plat (T)'");
            System.out.println("5. Solo / 'Masukkan Kode Plat (AD)'");
            System.out.println("Masukkan Kode Platnya Saja =");
            String plat = inputuser.nextLine();

            if (nama.isBlank() || plat.isBlank())
            {
                System.out.println("Lengkapi Identitas Anda!!!!!");
                System.out.println();
                System.out.println();
            }


            else  {
                System.out.println();
                kodeplat(nama, plat);
            }



    }
    //public static void pilihansalah(String warning){
      //  System.out.println("Pilihan Anda Tidak Ada");
    //}
    public static void kodeplat(String index,String platdata){
        if (platdata.length() <= 9){
            if (platdata.startsWith("K") || platdata.startsWith("Kudus")) {
                System.out.println("Anda Memilih Tujuan Kota Kudus");
                System.out.println("Silahkan Masukkan Kode Booking Anda");
                String kodebooking = inputuser.nextLine();
                if (kodebooking.isBlank()){
                    System.out.println("Masukkan kode Booking anda dengan Benar!!!");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Nama Pemesan : " + index);
                    System.out.println("Kode Booking : "  + kodebooking);
                    System.out.println("Kota Tujuan Anda adalah Kudus" );
                    System.out.println("Terima Kasih Telah Memesan Tiket di Perusahaan Semoga Maju");
                    System.out.println();
                    System.out.println();
                }
            }
        }

        if (platdata.length() <= 10){
            if (platdata.startsWith("B") || platdata.startsWith("Jakarta")) {
                System.out.println("Anda Memilih Tujuan Kota Jakarta");
                System.out.println("Silahkan Masukkan Kode Booking Anda");
                String kodebooking = inputuser.nextLine();
                if (kodebooking.isBlank()){
                    System.out.println("Masukkan kode Booking anda dengan Benar!!!");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Nama Pemesan : " + index);
                    System.out.println("Kode Booking "  + kodebooking);
                    System.out.println("Kota Tujuan Anda adalah Jakarta" );
                    System.out.println("Terima Kasih Telah Memesan Tiket di Perusahaan Semoga Maju");
                    System.out.println();
                    System.out.println();

                }
            }
        }

        if (platdata.length() <= 11){
            if (platdata.startsWith("AB") || platdata.startsWith("Jogja")) {
                System.out.println("Anda Memilih Tujuan Kota Jogja");
                System.out.println("Silahkan Masukkan Kode Booking Anda");
                String kodebooking = inputuser.nextLine();
                if (kodebooking.isBlank()){
                    System.out.println("Masukkan kode Booking anda dengan Benar!!!");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Nama Pemesan : " + index);
                    System.out.println("Kode Booking:"  + kodebooking);
                    System.out.println("Kota Tujuan Anda adalah Jogja" );
                    System.out.println("Terima Kasih Telah Memesan Tiket di Perusahaan Semoga Maju");
                    System.out.println();
                    System.out.println();
                }
            }
        }
        if (platdata.length() <= 12){
            if (platdata.startsWith("T") || platdata.startsWith("Karawang")) {
                System.out.println("Anda Memilih Tujuan Kota Karawang");
                System.out.println("Silahkan Masukkan Kode Booking Anda");
                String kodebooking = inputuser.nextLine();
                if (kodebooking.isBlank()){
                    System.out.println("Masukkan kode Booking anda dengan Benar!!!");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Nama Pemesan : " + index);
                    System.out.println("Kode Booking:"  + kodebooking);
                    System.out.println("Kota Tujuan Anda adalah Karawang" );
                    System.out.println("Terima Kasih Telah Memesan Tiket di Perusahaan Semoga Maju");
                    System.out.println();
                    System.out.println();
                }
            }
        }
        if (platdata.length() <= 13){
            if (platdata.startsWith("AD") || platdata.startsWith("Solo")) {
                System.out.println("Anda Memilih Tujuan Kota Solo");
                System.out.println("Silahkan Masukkan Kode Booking Anda");
                String kodebooking = inputuser.nextLine();
                if (kodebooking.isBlank()){
                    System.out.println("Masukkan kode Booking anda dengan Benar!!!");
                    System.out.println();
                    System.out.println();
                } else {
                    System.out.println("Nama Pemesan : " + index);
                    System.out.println("Kode Booking:"  + kodebooking);
                    System.out.println("Kota Tujuan Anda adalah Solo" );
                    System.out.println("Terima Kasih Telah Memesan Tiket di Perusahaan Semoga Maju");
                    System.out.println();
                    System.out.println();
                }
            }
        }

    else {
            System.out.println("Kode Yang Anda Masukkan kurang / Salah");
        }

    }

    public static void main(String[] args) {
        String pilihan = "ya";
        while (pilihan.equals("ya") ||pilihan.equals("y")) {
            tujuankota();
            System.out.println("Apakah anda ingin memesan tiket lagi y/t");
            pilihan = inputuser.nextLine();
        }

    }

}
