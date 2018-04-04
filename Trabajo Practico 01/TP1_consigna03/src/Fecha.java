import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;



public class Fecha {
    private int dia;
    private int mes;
    private int anho;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void input(){
        Scanner entradaScanner = new Scanner (System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese Dia:");
        this.dia = Integer.parseInt(entradaScanner.nextLine());
        System.out.println("Ingrese Mes:");
        this.mes = Integer.parseInt(entradaScanner.nextLine());
        System.out.println("Ingrese Año:");
        this.anho = Integer.parseInt(entradaScanner.nextLine());
    }

    public void show(){
        System.out.println("-------------------------------------------------");
        System.out.println("Dia:" + this.getDia());
        System.out.println("Mes:" + this.getMes());
        System.out.println("Año:" + this.getAnho());
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anho;
    }

    public int comparar(Fecha f2){
        if (this.anho < f2.anho){
            return -1;
        }else if (this.anho > f2.anho){
            return 1;
        }else{
            if (this.mes < f2.mes){
                return -1;
            }else if (this.mes > f2.mes){
                return 1;
            }else{
                if (this.dia < f2.dia){
                    return -1;
                }else if (this.dia > f2.dia){
                    return 1;
                }
            }
        }
        return 0;
    }

    public void desplazar(){
        Scanner entradaScanner = new Scanner (System.in);
        System.out.println("Ingrese Dias a desplazar:");
        int dias = Integer.parseInt(entradaScanner.nextLine());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        try {
            Date date = formatter.parse(this.toString());
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_YEAR, dias);
        }catch (ParseException e){
            e.printStackTrace();
        }
        int mes = cal.get(Calendar.MONTH) + 1;
        System.out.println(cal.getTime());
        System.out.println("Dia:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mes:" + mes);
        System.out.println("Año:" + cal.get(Calendar.YEAR));
    }

}