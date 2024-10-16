import java.util.ArrayList;
import java.util.Objects;

public class Inventario {
    //Atributos
    private ArrayList<Producto> productos = new ArrayList<>();

    //Constructor

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    //metodos
    public void agregarProducto(Producto p)
    {
        productos.add(p);
    }

    public void mostrarInventario()
    {
        for (Producto producto : productos)
        {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Cantidad: "+producto.getCantidad());
            System.out.println("Precio: "+ producto.getPrecio());
        }
    }
        public Producto buscarProducto (String nombre)
        {
            try {
                for (Producto producto : productos) {
                    if (Objects.equals(producto.getNombre(), nombre)) {
                        return producto;
                    }
                }

                return null;

            }catch (NullPointerException e)
            {
                System.out.println("Error, Producto no encontrado");
                return null;
            }
        }
    public void modificarCantidad (String nombre, int nuevaCantidad)
    {
        try {
            for (Producto producto : productos) {
                if (Objects.equals(producto.getNombre(), nombre)) {
                    producto.setCantidad(nuevaCantidad);
                }

            }
        }catch (NullPointerException e)
        {
            System.out.println("Error, Producto no encontrado");

        }
    }
}
