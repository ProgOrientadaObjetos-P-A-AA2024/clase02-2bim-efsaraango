
package paquete3;

public class EstudiantePresencial extends Estudiante{
    
    int numeroCreditos;
    double costoCredito;
    double matriculaPresencial;
    
    public EstudiantePresencial(String n, String ap, String iden, int e){
        // public Estudiante(String n, String a, String iden, int ed){
        super(n, ap, iden, e); // cumplir con el constructor de la superClase
    }
    
    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaPresencial()
    public void calcularMatriculaPresencial(){
        matriculaPresencial = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaPresencial() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaPresencial;
    }
    
    /*
    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                +"Numero de asinaturas %d\n"
                + "Valor de asignatura: %.2f\n"
                + "Valor matricula: %.2f", 
                super.toString(),
                numeroCreditos,
                costoCredito,
                obtenerMatriculaPresencial());
        return cadena;

    }*/
    
    @Override
    public String toString() {
        String cadena = String.format("Apellidos Estudiante: %s\n"
                + "Identificacion: %s\n"
                
                + "Valor matricula: %.2f", 
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante(),
               
                obtenerMatriculaPresencial());
        return cadena;

    }
    
    
}
