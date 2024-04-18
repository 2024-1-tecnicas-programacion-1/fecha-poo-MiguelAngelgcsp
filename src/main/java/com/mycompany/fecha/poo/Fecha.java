package com.mycompany.fecha.poo;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String fechaCorta() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean validarFecha() {

        
        
        
        
        return true;
    }

    public String mesLetra() {
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return meses[mes - 1];
    }

    public String fechaLarga() {
        return dia + " de " + mesLetra() + " de " + ano;
    }
}
