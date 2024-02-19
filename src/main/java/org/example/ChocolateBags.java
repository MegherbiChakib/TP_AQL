package org.example;

public class ChocolateBags {

        // on  a Bbox Sbox Unit
        public int CanWePack(int B,int S,int U){
            //savoire combien on a besoin de BbOX
            int Bboxutilise;
            double BboxBesoin = (double) U/5;
            int BigBoxBesoin=(int) Math.ceil(BboxBesoin);
            if (BigBoxBesoin <= B){
                Bboxutilise =BigBoxBesoin ;
                return 1;
            }
            else
                Bboxutilise = B;
            U = U - 5* Bboxutilise;

            if (S >= U)
                return 1;
            else
                return 0;
        }

    public static void main(String[] args) {
        // si jasi 6 petite boite et 2 grande boite 6 pour totale
        ChocolateBags chocolateBags  = new ChocolateBags();
        int a=chocolateBags.CanWePack(2,0,6);
        System.out.println(a);
    }

}
