public class Alumno {

    private String nombre;
    private int numcomtrol;
    private String carrera;
    private String semestre;

    public Alumno(){
        nombre="";
        numcomtrol=0;
        carrera="";
        semestre="";
    }
    public Alumno(String n, int m, String u,String g)
    {
    nombre=n;
    numcomtrol=m;
        semestre=u;
        carrera=g;

    }

    public void setNombre(String nombre)
    {
        nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumcomtrol(int numcomtrol){
        numcomtrol=numcomtrol;
    }

    public int getNumcomtrol() {
        return numcomtrol;
    }

    public void setCarrera(String grupo){
        carrera=carrera;

    }
    public String getCarrera(){
        return carrera;
    }

    public void setSemestre(String semestre)
    {
        semestre=semestre;
    }

    public String getSemestre(){
        return semestre;
    }
}
