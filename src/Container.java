public class Container {
    private int cantidad;
    public Container(){
        cantidad = 0;
    }

    public void add(int amount) {
        cantidad += amount;
    }

    public void remove(int amount) {
        if(amount <= cantidad & amount > 0)
            cantidad -= amount;
    }

    public int getCantidad() {
        if(cantidad < 0)
            return 0;

        if(cantidad > 100)
            return  100;

        return cantidad;
    }

    @Override
    public String toString() {
        return cantidad + "/100";
    }
}
