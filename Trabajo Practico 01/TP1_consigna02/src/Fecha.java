import java.util.Scanner;

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
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", año=" + anho +
                '}';
    }

    public int comparar(Fecha f2){
        int resp = 0;
        if (this.anho < f2.anho){
            resp = -1;
        }else if (this.anho > f2.anho){
            resp = 1;
        }else{
            if (this.mes < f2.mes){
                resp = -1;
            }else if (this.mes > f2.mes){
                resp = 1;
            }else{
                if (this.dia < f2.dia){
                    resp = -1;
                }else if (this.dia > f2.dia){
                    resp = 1;
                }
            }
        }
    return resp;
    }

    public Fecha add(int num){

    }
}