package day32Maps;

import java.util.Map;
import java.util.Scanner;

public class P07_KullaniciniGirdigiBilgiIleArama {



        public static void main(String[] args) {
            Map<Integer, String> ogrenciMap=mapdepo.mapOlustur();
            Scanner scan=new Scanner(System.in);
            System.out.print("Öğrenci Numarası:");
            int number=scan.nextInt();
            System.out.print("Aranan Bilgi [AD-SOYAD-SINIF-ŞUBE-ALAN]: ");
            String bilgi=scan.next();
            System.out.println(mapdepo.getData(ogrenciMap, number, bilgi));
        }
    }

