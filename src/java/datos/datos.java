package datos;

public class datos 
{
    private String matricula;
    private String nombre;
    private String apellido_Paterno;
    private String apellido_Materno;
    private double ddi;
    private double dwi;
    private double ecbd;
    private double prom;

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public double getDdi() {
        return ddi;
    }

    public double getDwi() {
        return dwi;
    }
    
     public double getEcbd() {
        return ecbd;
    }
    
    public datos ()
    {
        matricula = nombre = apellido_Paterno = apellido_Materno = "";
        ddi = dwi = ecbd = 0;
        prom = 0.0;
    }
    
    public String getDatos (){
    return matricula;
}
    
    public datos (String matricula, String nombre, String apellido_Paterno, String apellido_Materno, double ddi, double dwi, double ecbd)
    {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido_Materno = apellido_Materno;
        this.apellido_Paterno = apellido_Paterno;
        this.ddi = ddi;
        this.dwi = dwi;
        this.ecbd = ecbd;
        
    }
    
}

