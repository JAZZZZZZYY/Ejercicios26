class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Automovil extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El automóvil circula por carretera.");
    }
}

class Barco extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El barco navega por el agua.");
    }
}

class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión vuela por el aire.");
    }
}

public class jercicio1 {
    public static void main(String[] args) {
        Vehiculo v1 = new Automovil();
        Vehiculo v2 = new Barco();
        Vehiculo v3 = new Avion();

        v1.mover();
        v2.mover();
        v3.mover();
    }
}
