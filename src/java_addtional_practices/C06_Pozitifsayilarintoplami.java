package java_addtional_practices;

public class C06_Pozitifsayilarintoplami{
    public static void main(String[] args) {

        //5- Verilen iki katli bir array’deki pozitif sayilarin toplamini yazdirin

        int[][] sayilar = { {2,3,4},{1,5},{7,9,0},{2} };

        int toplam = 0 ;

        for (int i = 0; i < sayilar.length ; i++) {

            for (int j = 0; j <sayilar[i].length ; j++) {

                if (sayilar[i][j] > 0){
                    toplam += sayilar[i][j];
                }
            }

        }

        System.out.println("Pozitif sayilarin toplami : " + toplam);
    }
}