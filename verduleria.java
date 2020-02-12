public class Verduleria {
    public static void main(String args []) {

        char articulo = 0;
        int cantidad = 0;
        float precio = 0;
        int pago = 1;
        float total = 0;
        char opcion = 'a';
        double efectivo = 0d;
        double tarjeta = 0d;
        double descuento = 0d;
        double recargo = 0d;

        switch (opcion) {
            case 'a':
                cantidad = 2;
                precio = 30;
                total = cantidad * precio;
                break;
            
            case 'c':
                cantidad = 10;
                precio = 15;
                total = cantidad * precio;
                break;

            case 'm':
                cantidad = 5;
                precio = 50;
                total = cantidad * precio;
                break;
                
            case 'p':
                cantidad = 20;
                precio = 10;
                total = cantidad * precio;
                break;

            default: System.out.println ("Error");
                break;
        }
        
        switch (pago){
            case 1:
                descuento = total * 0.10;
                efectivo = total - descuento;

                System.out.println("El precio es:" + efectivo);
                break;
               
            case 2:
                recargo = total / 0.20;
                tarjeta = total + recargo;
                
                System.out.println("El precio es:" + tarjeta);
                break;
              
            default: 
                System.out.println("Se ha generado un error");
            break;    
        }
    }
}
