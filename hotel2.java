import java.util.Scanner;

public class hotel2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

                //data
                double weekduku = 915000;
                double wekduku = 1025000;
                double holiduku = 1225000;

                double weekalpukat = 575000;
                double wekalpukat = 695000;
                double holialpukat = 895000;

                double weekdurian = 595000;
                double wekdurian = 715000;
                double holidurian = 915000;

                double weekbelimbing = 495000;
                double wekbelimbingg = 575000;
                double holibelimbing = 755000;
                //data
                
                System.out.println("Silahkan Memilih Jenis Cottage");
                System.out.println("1. Duku");
                System.out.println("2. Jeruk");
                System.out.println("3. Alpukat");
                System.out.println("4. Jambu Air");
                System.out.println("5. Durian");
                System.out.println("6. Melon");
                System.out.println("7. Belimbing");
                System.out.println("8. Mangga");
                System.out.println("9. Kendondong");
        
                int kamar = s.nextInt();
        
                System.out.println("Silahkan Memilih Hari");
                System.out.println("1. Weekday");
                System.out.println("2. Weekend");
                System.out.println("3. Holiday");
        
                int hari = s.nextInt();
        
                System.out.println("Berapa hari anda menginap");
        
                int lama = s.nextInt();
        
                double harga;
                
                switch(kamar){
                    case 1 :
                    System.out.println("Anda memilih cottage Duku");
        
                    switch(hari){
                        case 1:
        
                        harga = lama*weekduku;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2: 
                        harga = lama*wekduku;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holiduku;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 2:
                    System.out.println("Anda Memilih Cotagge Jeruk");
                    switch(hari){

                        case 1:
                        harga = lama*weekduku;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekduku;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holiduku;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 3:
                    System.out.println("Anda Memilih Cotagge Alpukat");
                    switch(hari){
                        case 1:
                        harga = lama*weekalpukat;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekalpukat;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holialpukat;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 4:
                    System.out.println("Anda Memilih Cotagge Jambu Air");
                    switch(hari){
                        case 1:
                        harga = lama*weekduku;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekduku;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holiduku;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 5:
                    System.out.println("Anda Memilih Cotagge Durian");
                    switch(hari){
                        case 1:
                        harga = lama*weekdurian;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekdurian;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holidurian;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 6:
                    System.out.println("Anda Memilih Cotagge Melon");
                    switch(hari){
                        case 1:
                        harga = lama*weekdurian;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekdurian;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holidurian;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 7:
                    System.out.println("Anda Memilih Cotagge Belimbing");
                    switch(hari){
                        case 1:
                        harga = lama*weekbelimbing;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekbelimbingg;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holibelimbing;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 8:
                    System.out.println("Anda Memilih Cotagge Mangga");
                    switch(hari){
                        case 1:
                        harga = lama*weekbelimbing;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekbelimbingg;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holibelimbing;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    case 9:
                    System.out.println("Anda Memilih Cotagge Kedondong");
                    switch(hari){
                        case 1:
                        harga = lama*weekbelimbing;
                        System.out.println("Hari yang anda pilih adalah Weekday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 2:
                        harga = lama*wekbelimbingg;
                        System.out.println("Hari yang anda pilih adalah Weekend");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        case 3:
                        harga = lama*holibelimbing;
                        System.out.println("Hari yang anda pilih adalah Holiday");
                        System.out.println("Total Harga Adalah : "+harga);
                        break;

                        default :
                        System.out.println("Masukan Nilai yang sesuai");
                    }
                    break;

                    default :
                    System.out.println("Masukan Nilai yang sesuai");
                }
    }
    
}
