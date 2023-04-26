public class Main {

    public static void main(String[] args){
        SmarthWatch appleWatch = new SmarthWatch(4, 128, 8 ,"IOS");
        //Imprimimos el objeto appleWatch
        System.out.println("Caracteristicas del Apple Watch");
        System.out.println("Almacenamiento del sistema: " + appleWatch.almacenamiento + "GB");
        System.out.println("Ram: " + appleWatch.ram + "GB");
        System.out.println("Dimensiones: " + appleWatch.dimensiones + "pulgadas");
        System.out.println("Sistema operativo: " + appleWatch.sistemaOperativo);

        SmartPhone iphone = new SmartPhone(7, 128, 8 ,"IOS");
        //Imprimimos el objeto appleWatch
        System.out.println("Caracteristicas del Iphone X");
        System.out.println("Almacenamiento del sistema: " + iphone.almacenamiento + "GB");
        System.out.println("Ram: " + iphone.ram + "GB");
        System.out.println("Dimensiones: " + iphone.dimensiones + "pulgadas");
        System.out.println("Sistema operativo: " + iphone.sistemaOperativo);
    }
}
