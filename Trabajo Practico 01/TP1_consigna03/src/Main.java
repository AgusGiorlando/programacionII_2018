public class Main {

    public static void main(String[] args) {
        Fecha fech1 = new Fecha();
        fech1.input();
        fech1.show();
        System.out.println(fech1.toString());

        Fecha fech2 = new Fecha();
        fech2.input();
        fech2.show();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Fecha: " + fech1.toString());

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Comparacion: " + fech1.comparar(fech2));

        System.out.println("Suma:");
        try {
			fech1.add();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
