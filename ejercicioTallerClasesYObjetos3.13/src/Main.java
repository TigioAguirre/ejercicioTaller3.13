import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Creaciòn de 2 Objetos Empleados*/
        Empleado e1 = new Empleado("","",0.0);
        Empleado e2 = new Empleado("","",0.0);
        //Creación del Scanner para leer los datos
        Scanner sc= new Scanner(System.in);

        /**Leer los datos de cada Empleado*/
        //Primer Empleado
        System.out.println("Ingrese los datos del Primer empleado:");
        System.out.println("Primer Nombre: ");
        e1.setPrimerNombre(sc.nextLine());
        System.out.println("Apellido Paterno: ");
        e1.setApellidoPaterno(sc.nextLine());
        System.out.println("Salario Mensual: ");
        e1.setSalarioMensual(sc.nextDouble());
        sc.nextLine();//Consumir el salto de linea que deja el Double
        /**Logica de Programaciòn*/
        do {
            if (e1.getSalarioMensual()<0){
                System.out.println("Salario negativo, valor incorrecto");
                System.out.println("Vuelva a ingresar el salario ");
                System.out.println("Salario Mensual: ");
                e1.setSalarioMensual(sc.nextDouble());
                sc.nextLine();}//Consumir el salto de linea que deja el Double
        }while(e1.getSalarioMensual()<0);
        //Segundo Empleado Empleado
        System.out.println("Ingrese los datos del Segundo empleado:");
        System.out.println("Primer Nombre: ");
        e2.setPrimerNombre(sc.nextLine());
        System.out.println("Apellido Paterno: ");
        e2.setApellidoPaterno(sc.nextLine());
        System.out.println("Salario Mensual: ");
        e2.setSalarioMensual(sc.nextDouble());
        sc.nextLine();//Consumir el salto de linea que deja el Double
        /**Logica de Programaciòn*/
        do {
            if (e2.getSalarioMensual()<0){
                System.out.println("Salario negativo, valor incorrecto");
                System.out.println("Vuelva a ingresar el salario ");
                System.out.println("Salario Mensual: ");
                e2.setSalarioMensual(sc.nextDouble());
                sc.nextLine();}//Consumir el salto de linea que deja el Double
        }while(e2.getSalarioMensual()<0);
        /**Llamada al Mètodo y Despliegue*/
        System.out.println("----------------------------------------");
        System.out.println("Detalle Empleado: \n"+e1.detalleEmpleado(e1.getPrimerNombre(),e1.getApellidoPaterno(),e1.getSalarioMensual()));
        System.out.println("----------------------------------------");
        System.out.println("Detalle Empleado: \n"+e2.detalleEmpleado(e2.getPrimerNombre(),e2.getApellidoPaterno(),e2.getSalarioMensual()));
        System.out.println("----------------------------------------");
        System.out.println("Incremento del 10% al Sueldo de los Empleados: ");
        System.out.println("----------------------------------------");
        System.out.println("Detalle Empleado: \n"+e1.detalleEmpleado(e1.getPrimerNombre(),e1.getApellidoPaterno(),1.10*e1.getSalarioMensual()));
        System.out.println("----------------------------------------");
        System.out.println("Detalle Empleado: \n"+e2.detalleEmpleado(e2.getPrimerNombre(),e2.getApellidoPaterno(),1.10*e2.getSalarioMensual()));

    }
}