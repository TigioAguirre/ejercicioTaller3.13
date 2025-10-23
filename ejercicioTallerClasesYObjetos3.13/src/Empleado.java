/**3.13 (La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de instancia:
un primer nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double).
 Su clase debe tener un constructor que inicialice las tres variables de instancia. Proporcione
 un método establecer y un método obtener para cada variable de instancia. Si el salario mensual no
 es positivo, no establezca su valor. Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre
 las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el salario anual de cada objeto.
 Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.*/

public class Empleado {
    /**Atributos de la Clase Empleado*/
    private String primerNombre;
    private String apellidoPaterno;
    private Double salarioMensual;

    /**Constructores y Destructores*/
    public Empleado(String primerNombre, String apellidoPaterno, Double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salarioMensual = salarioMensual;
    }
    /**Mètodos*/
    //Getters Método Obtener
    public String getPrimerNombre() {
        return primerNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public Double getSalarioMensual() {
        return salarioMensual;
    }
    //Setters Método Establecer
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    //Mètodos
    public String detalleEmpleado(String pN,String aP, Double sM){
    String dE;
    dE = "Primer Nombre    : " + pN + "\n"+
         "Apellido Paterno : " + aP + "\n"+
         "Salario Anual  : " + 12*sM;
    return dE;}
}

