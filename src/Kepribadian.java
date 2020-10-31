import java.util.Scanner;

/**
 *
 * @author Diva Sabila Ramadhan
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program ini menampilkan kepribadian berdasarkan warna 
 */
public class Kepribadian {

    final Scanner scan = new Scanner(System.in);
    static String foreground = "\033[38;2;";
    static String background = "\033[48;2;";
    static String netral[] = {"\033[0m", "\033[38;2;255;255m"};
    String warna, nama;
    
    String[] merah = {
            "MERAH",
            "255;0;0m",
            "1. Periang,\n" +
            "2. Pemberani,\n" +
            "3. Brani untuk mengambil resiko,\n" +
            "4. Menyukai hal yang menantang,\n" +
            "5. Kurang sabar,\n" +
            "6. Dapat menahan marah, namun jika kesabarannya habis, amarah nya akan memuncak,\n" +
            "7. Memiliki kehangatan dan cinta."
    };
    
    String[] biru = {
            "BIRU",
            "0;0;255M",
            "1. Menyenangkan,\n" +
            "2. Bujaksana,\n" +
            "3. Tenang dalam menghadapi masalah,\n" +
            "4. Dinamis,\n" +
            "5. Suka Berbagi,\n" +
            "6. Orang yang bersahabat,\n" +
            "7. Tidak terlalu suka menjadi perhatian orang,\n" +
            "8. Suka dengan jalan damai."
    };
    
    String[] kuning = {
            "KUNING",
            "255;255;0m",
            "1. Orang yang optimis,\n" +
            "2. Suka bergaul,\n" +
            "3. Suka menolong,\n" +
            "4. Aktif,\n" +
            "5. Loyal,\n" +
            "6. Hangat,\n" +
            "7. Cenderung penakut."
    };
    
    String[] ungu = {
            "UNGU",
            "255;0;255m",
            "1. Optimis,\n" +
            "2. Yakin,\n" +
            "3. Pasangan yang ideal yang memiliki mental kuat,\n" +
            "4. Berambisi,\n" +
            "5. Empati yang besar,\n" +
            "6. Terkadang keras kepala."
    };
    
    String[] hijau = {
            "HIJAU",
            "0;255;0m",
            "1. Orang yang romatis,\n" +
            "2. Suka dengan keindahan yang alami,\n" +
            "3. Teguh pada prinsip,\n" +
            "4. Mudah cemburu,\n" +
            "5. Menjunjung tinggi toleransi."
    };
    
    public void masukkanWarna(){
        String[][] color = {merah, hijau, kuning, ungu, biru};
            System.out.println(foreground.concat(merah[1]).concat("YUK")
                .concat(foreground).concat(hijau[1]).concat("CEK")
                .concat(foreground).concat(kuning[1]).concat("KEPRIBADIANMU ")
                .concat(foreground).concat(hijau[1]).concat("DARI ")
                .concat(foreground).concat(ungu[1]).concat("WARNA ")
                .concat(foreground).concat(biru[1]).concat("FAVORITMU\n"));
        for (String[] x : color) {
             System.out.println(background.concat(x[1]).concat(netral[1]).concat("\t\t")
                    .concat(x[0]).concat("\t\t").concat(netral[0]));
        }  
        
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        warna = scan.next().toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = scan.next();
    }
    
    public String menentukanKepribadian(){
        String warna = "Warna Favoritmu adalah ".concat(foreground);
         switch (this.warna) {
            case "MERAH" :
                warna += String.join("", merah[1], merah[0], netral[0].concat("\n"), merah[2]);
                break;
            case "BIRU" :
                warna += String.join("", biru[1], biru[0], netral[0].concat("\n"), biru[2]);
                break;
            case "HIJAU" :
                warna += String.join("", hijau[1], hijau[0], netral[0].concat("\n"), hijau[2]);
                break;
            case "KUNING" :
                warna += String.join("", kuning[1], kuning[0], netral[0].concat("\n"), kuning[2]);
                break;
            case "UNGU" :
                warna += String.join("", ungu[1], ungu[0], netral[0].concat("\n"), ungu[2]);
                break;
            default:
                warna = "Oops.. Belum teridentifikasi";
        }
        return warna;
    }    
        public void tampilTest(){
            System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
            System.out.println(menentukanKepribadian());
        }
        
    
    public static void main(String[] args) {
        Kepribadian data = new Kepribadian();
        data.masukkanWarna();
        data.tampilTest();
        System.out.println("Developed by : Diva Sabila Ramadhan");
    }
    
}
