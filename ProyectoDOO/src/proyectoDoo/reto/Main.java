package proyectoDoo.reto;

import proyectoDoo.dominio.Estudiante;
import proyectoDoo.dominio.Materia;
import proyectoDoo.dominio.Matricula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Materia> listaMaterias=new ArrayList<>();
        Estudiante julian=new Estudiante("Julián","Vásquez","Ingenieria de Sistemas",1007689081);

        Matricula matricula=new Matricula(julian,listaMaterias,15,1);

        Materia algebra=new Materia(0126,"Álgebra",8,4,"Lunes");
        Materia geoTrigo=new Materia(0136,"GEOMETRIA Y TRIGONOMETRIA",6,4,"Martes");
        Materia logica=new Materia(0146,"LOGICA CONJUNTOS Y FUNCIONES",10,4,"Lunes");
        Materia proyectoHumano=new Materia(0116,"PROYECTO HUMANO Y PROFESIONAL",18,1,"Miercoles");
        Materia razonamientoLogico=new Materia(0166,"RAZONAMIENTO LOGICO Y ABSTRACTO",16,4,"Jueves");

        Materia calculoDiferencial=new Materia(0226,"CALCULO DIFERENCIAL",12,4,"Jueves");
        Materia algebraLineal=new Materia(0236,"ALGEBRA LINEAL",15,4,"Viernes");
        Materia algoritmos1=new Materia(0266,"ALGORITMOS1",12,4,"Jueves");
        Materia antropologia=new Materia(0216,"ANTROPOLOGÍA",16,3,"Jueves");

        Materia materia = null;
        assert false;
        materia.setMateriasSemestre(listaMaterias);
        listaMaterias.add(algebra);
        listaMaterias.add(geoTrigo);
        listaMaterias.add(logica);
        listaMaterias.add(proyectoHumano);
        listaMaterias.add(razonamientoLogico);

        listaMaterias.add(calculoDiferencial);
        listaMaterias.add(algebraLineal);
        listaMaterias.add(algoritmos1);
        listaMaterias.add(antropologia);



        matricula.crearMatricula(matricula);



        //List<Materia> listaMaterias=  Arrays.asList(algebra,geoTrigo,logica,proyectoHumano);





    }
}
