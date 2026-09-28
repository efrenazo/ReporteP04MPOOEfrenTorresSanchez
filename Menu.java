import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario invent = new Inventario();
        int respuesta;

        do{
            System.out.print("\n¿Qué deseas hacer?\n1.Agregar un objeto al inventario\n2.Buscar un objeto en el inventario\n3.Actualizar\n4.Valor total\n5.Salir\nRespuesta:");
            respuesta = scanner.nextInt();
            scanner.nextLine();

            if (respuesta == 1) {
                System.out.print("\nNombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Precio: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Existencia: ");
                int existencia = scanner.nextInt();
                scanner.nextLine();

                invent.InsertarObjeto(nombre, precio, existencia);
            } 
            else if (respuesta == 2) {
                if (invent.tamañoAct()!=0){ 
                    System.out.print("\nNombre: ");
                    String nombre = scanner.nextLine();

                    Objeto obj=invent.Busqueda(nombre);

                    if (obj!=null){
                        System.out.println("\nEncontramos el  objeto:\nNombre: %s\nPrecio: %.2f\nExistencia: %d".formatted(obj.nombre,obj.precio,obj.existencia));
                    }
                    else{
                        System.out.println("\nEl objeto no existe");
                    }
                }
                else{
                    System.out.println("\nEl inventario aun esta vacio");
                }
            }
            else if (respuesta == 3) {
                System.out.println("\nQue articulo deseas actualizar?");
                String nombre = scanner.nextLine();

                System.out.println("\nCual es el nuevo precio?");
                double nuevoPrecio = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("\nCuantas unidades hay?");
                int nuevaExistencia = scanner.nextInt();
                scanner.nextLine();

                boolean actualizado=invent.Actualizar(nombre, nuevoPrecio, nuevaExistencia);
                if (actualizado == true){
                    System.out.print("\nTu articulo fue actualizado");
                }
                else{
                    System.out.print("\nTu articulo no fue encontrado");
                }
            }
            else if (respuesta == 4) {
                double valorTotal=invent.ValorTotal();
                System.out.print("\nEl valor total del inventario es: "+valorTotal);
            } 
            else if (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4 && respuesta != 5) { // Usa "else if" separado
                System.out.println("\nOpción no válida");
            }
        }while(respuesta!=5);
    }
}