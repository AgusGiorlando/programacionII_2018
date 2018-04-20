public class Main {
    public static void main(String [] args){
        MyList<String> imp1 = new Implementacion1<String>();
        String str1 = "Uno";

        imp1.agregar(str1);

        System.out.println(imp1.toString());
    }
}
