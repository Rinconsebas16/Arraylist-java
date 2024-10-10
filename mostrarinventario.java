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
    public void mostrarCantidad (String nombre, int nuevaCantidad)
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
