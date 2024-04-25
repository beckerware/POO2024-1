package com.example;

public class Main {
    public static void main(String[] args) {
        Professor prof1, prof2, prof3;

        prof1 = new Professor();
        prof1.setNome("Julio");
        prof1.setMatricula(1234);
        prof1.setCargaHoraria(14);
        prof1.setDisciplina("Banco de Dados");
        System.out.print(prof1.getNome());
        System.out.println(prof1.getCargaHorariaMensal());
        


        prof2 = new Professor();
        prof2.setNome("Rafael");
        prof2.setMatricula(2345);
        prof2.setCargaHoraria(15);
        prof2.setDisciplina("Programação Orientada a Objetos");
        System.out.print(prof2.getNome());
        System.out.println(prof2.getCargaHorariaMensal());

        prof3 = new Professor();
        prof3.setNome("Nágela");
        prof3.setMatricula(3456);
        prof3.setCargaHoraria(13);
        prof3.setDisciplina("Estrutura de Dados");
        System.out.print(prof3.getNome());
        System.out.println(prof3.getCargaHorariaMensal());
        
    }
}