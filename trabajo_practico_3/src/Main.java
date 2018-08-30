public class Main {
    public static void main(String [] args){
//    	System.out.println("-----------IMPLEMENTACION 1----------");
//        MyList<String> imp1 = new Implementacion1<String>();
//        String str = "X";
//
//        for (int i = 0 ; i < 7 ; i++) {
//        	imp1.agregar(str);
//        }
//        System.out.println(imp1.toString());
//
//        imp1.borrar(3);
//        System.out.println(imp1.toString());
//        
//        System.out.println(imp1.obtener(2));
    	
    	System.out.println("-----------IMPLEMENTACION 2----------");
    	MyList<String> imp2 = new Implementacion2<String>();
    	String str2 = "X";
    	String str3 = "Y";
    	String str4 = "Z";

    	
    	imp2.agregar(str2);
    	imp2.agregar(str3);
    	imp2.agregar(str4);
    	
    	System.out.println(imp2.toString());
    	
    	System.out.println("Obtener: " + imp2.obtener(1));

    	imp2.borrar(0);
    	System.out.println("Elemento 0 borrado:" +imp2.toString());

    }
}
