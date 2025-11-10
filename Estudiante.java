public class Estudiante {
    private int _id;
    private int[] _examen;
    private int _respuestasCorrectas;

    public Estudiante(int id, int[] examen){
        _id = id;
        _examen = examen;
        _respuestasCorrectas = 0;
    }

    public int[] Examen(){
        return _examen;
    }

    public int Nota(){
        int total = _examen.length;
        double notaReal = (double) _respuestasCorrectas / total * 10;
        int notaEntera = (int) notaReal;
        return notaEntera;
    }
    
    public void resolverUnEjercicio(int ejercicio, int respuesta, int[] examenSolucion){
        _examen[ejercicio]=respuesta;
        if(examenSolucion[ejercicio]==_examen[ejercicio]) _respuestasCorrectas++;
    }
    
    public void cambiarExamen(int[] examen){
        _examen=examen;
    }
}
 /* @Override
    public int compareTo(Estudiante otroEstudiante){
        return this._id - otroEstudiante._id;
    }

    @Override
    public String toString(){
        return String.valueOf(_id);
    }
}  */