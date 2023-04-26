public class Main {
    public static void main(String[] args){
        CocheCRUDImpl cochenew = new CocheCRUDImpl();
        cochenew.delete();
        cochenew.findAll();
        cochenew.save();
    }
}
