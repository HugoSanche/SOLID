package com.company.export_file;

public class ReportGenerator {

    private final Generador generador;

    public ReportGenerator(Generador generador) {
        this.generador = generador;
    }
    public void generar(){
        generador.exportar();
    }
}
