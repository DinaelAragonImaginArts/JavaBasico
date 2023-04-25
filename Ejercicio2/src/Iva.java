public class Iva {
    static double priceIva(double price){
        double iva = 0.16;
        double ivaProduct = price * iva;
        return ivaProduct + price;
    }

    public static void main(String[]args){
        //System.out.print(priceIva);
        System.out.print(priceIva(12.0));
    }


}