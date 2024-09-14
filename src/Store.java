public class Store {
    public static void main(String[] args) {
        // defini los precios de los productos como constantes 
        
        final int PRECIO_PRODUCTO_1 = 15;
        final int PRECIO_PRODUCTO_2 = 10;
        final int PRECIO_PRODUCTO_3 = 5;

        //defini la cantidad en ventas que se debe generar en el local
        
        final int LIMITE_DE_VENTAS = 50;
        //defini la cantidad de productos vendidos

        final int CANTIDAD_PRODUCTO_1 = 2;
        final int CANTIDAD_PRODUCTO_2 = 3;
        final int CANTIDAD_PRODUCTO_3 = 4;

        // Cree un array que almacene los precios de los productos 

        int[] precioProductos = {PRECIO_PRODUCTO_1,PRECIO_PRODUCTO_2,PRECIO_PRODUCTO_3};
        
        // cree un array que alamecene la cantidad de productos vendidos
        
        int[] cantidadesProductos = {CANTIDAD_PRODUCTO_1,CANTIDAD_PRODUCTO_2,CANTIDAD_PRODUCTO_3};
        
        //creamos un bucle for para calcular los totales de cada venta
        
        for (int i = 0; i < prices.length; i++) {
            totalSales += prices[i] * quantities[i];
        }

        // Evaluación del rendimiento de ventas
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        
        
      

        
        }
    }
}
