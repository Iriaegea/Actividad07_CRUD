package view;

import java.util.Scanner;

public class PizzaView {


    Scanner sc = new Scanner(System.in);


    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("""
                    Menu:
                    1. Listar todas las pizzas
                    2. Insertar una nueva pizza
                    3. Actualizar una pizza
                    4. Eliminar una pizza
                    5. Buscar pizzas
                    6. Mostrar un listado resumido
                    7. Salir de la aplicacion
                    """);
            opcion = sc.nextInt();
        } while (opcion != 7);
    }
}
