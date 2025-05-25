abstract class Personal {
    public abstract void registrar();
    public abstract double calcularSueldo();
}

class Empleado extends Personal {
    private String nombre;
    private double horasTrabajadas;
    private double pagoPorHora;

    public Empleado(String nombre, double horasTrabajadas, double pagoPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void registrar() {
        System.out.println("Empleado registrado: " + nombre);
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }
}

public class ejercicio2 {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan", 40, 15.5);
        emp.registrar();
        System.out.println("Sueldo: $" + emp.calcularSueldo());
    }
}
