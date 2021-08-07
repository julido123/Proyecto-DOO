package proyectoDoo.dominio;

import java.util.List;

public class Matricula {
    private Estudiante estudiante;
    private List<Materia> materias;
    private int NUMEROMAXIMOCREDITOS;
    private int semestreActual;

    public Matricula(Estudiante estudiante, List<Materia> materias, int NUMEROMAXIMOCREDITOS, int semestreActual) {
        this.estudiante = estudiante;
        this.materias = materias;
        this.NUMEROMAXIMOCREDITOS = NUMEROMAXIMOCREDITOS;
        this.semestreActual = semestreActual;
    }

    public boolean validarDia(Materia materia){
        return materias.stream().allMatch(interativo-> (interativo.getDia().equals(materia.getDia())));

    }

    public boolean validarHora(Materia materia){
        return materias.stream().allMatch(interativo-> (interativo.getHora()==(materia.getHora())));

    }

    public void validarMateria(){

    }

    public void validarSemestre(Matricula matricula){

    }

    public void validarPrerequisito(){

    }

    public void crearMatricula(Matricula matricula){
        int suma=0;
        if(!comprobarDia()){
            if (!comprobarHora()){
                for (Materia materia:this.materias) {
                    suma=materia.getCreditos()+suma;
                }
                if (suma>matricula.getNUMEROMAXIMOCREDITOS()){
                    System.out.println("Los creditos superan los creditos maximos permitidos");

                }else {
                    System.out.println("Su matricula fue completada con exito");
                }
            }
        }
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public int getNUMEROMAXIMOCREDITOS() {
        return NUMEROMAXIMOCREDITOS;
    }

    public void setNUMEROMAXIMOCREDITOS(int NUMEROMAXIMOCREDITOS) {
        this.NUMEROMAXIMOCREDITOS = NUMEROMAXIMOCREDITOS;
    }

    public int getPeriodoAcademico() {
        return semestreActual;
    }

    public void setPeriodoAcademico(int periodoAcademico) {
        this.semestreActual = periodoAcademico;
    }
}
