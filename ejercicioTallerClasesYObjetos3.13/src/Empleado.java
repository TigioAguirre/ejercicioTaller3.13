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

public class Main {
    public static void main(String[] args) {
    /**Creación de los Objetos Juegos*/
        Juego j1 = new Juego("","",0.0,0.0,0,0);
        //Juego j2 = new Juego("","",0.0,0.0,0,0);
        //Juego j3 = new Juego("","",0.0,0.0,0,0);
        //Juego j4 = new Juego("","",0.0,0.0,0,0);
        //Creación del Scanner para leer los datos
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        /**Leer los datos de Cada Juego*/
        //Juego 1
        System.out.println("---------------------------------------");
        System.out.println("----Ingresar los Datos del Juego #1----" );
        System.out.println("---------------------------------------");
        System.out.println("Ingrese el nombre: ");
        j1.setNombre(sc.nextLine());
        int op=0;
        int opMenu=0;
        do{
        System.out.println("Seleccione la categoria:");
        System.out.println("Opciones:");
        System.out.println("1)Rompecabezas\n2)Accion\n3)Deporte");
        op=sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                j1.setNombre("Rompecabezas");
                break;
            case 2:
                j1.setNombre("Accion");
                break;
            case 3:
                j1.setNombre("Deporte");
                break;
            default:
                System.out.println("Opcion Invalida");
                System.out.println("Seleccione de nuevo");
                System.out.println("---------------------------------------");
        }
        }while(op < 1|| op > 3);
        op=0;
        do{
            System.out.println("Ingrese el tamanio en kB: ");
            j1.setTamanio(sc.nextDouble());
            sc.nextLine();
            if (j1.getTamanio()<0){
                System.out.println("El tamaño no puede ser negativo: ");
            }}while(j1.getTamanio()<0);
        do{
            System.out.println("Ingrese el precio en Pesos: ");
            j1.setPrecio(sc.nextDouble());
            sc.nextLine();
            if (j1.getPrecio()<0){
                System.out.println("El precio no puede ser negativo");
            }}while(j1.getPrecio()<0);
        do{
        System.out.println("Ingrese la cantidad de licencias vendidas: ");
        j1.setLicenciasVendidas(sc.nextInt());
        sc.nextLine();
        if (j1.getLicenciasVendidas()<0){
            System.out.println("La licencia no debe ser menor a 0");
        }}while(j1.getLicenciasVendidas()<0);
        do{
            System.out.println("Ingrese la cantidad de licencias disponibles: ");
            j1.setLicenciasDisponibles(sc.nextInt());
            sc.nextLine();
            if (j1.getLicenciasDisponibles()<0){
                System.out.println("La licencia no debe ser menor a 0");
            }}while(j1.getLicenciasDisponibles()<0);
        System.out.println("---------------------------------------");
        do{
        System.out.println("---------------------------------------");
        System.out.println("------------Menu de Opciones-----------");
        System.out.println("---------------------------------------");
        System.out.println("1) Detalle de los Juegos");
        System.out.println("2) Comprar licencias de los Juegos");
        System.out.println("3) Vender licencias de los Juegos");
        System.out.println("4) Consultar el Juego mas vendido");
        System.out.println("5) Consultar los descuentos aplicados por un volumen de compra");
        System.out.println("6) Salir");
        System.out.println("Seleccione la opcion: ");
        opMenu=sc.nextInt();
        sc.nextLine();
        switch (opMenu) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Fin del Programa");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
        }while(opMenu!=6);
        }
    }


