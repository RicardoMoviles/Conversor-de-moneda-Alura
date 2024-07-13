import java.util.Scanner;

public class Menu {

    private Scanner lectura =  new Scanner(System.in);
    public int mostrarMenu(){

        String menu = """
                *******************************************
                Sea bienvenido al conversor de moneda =]
                
                1) Dolar  =>> Peso Argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Salir
                
                Elija una opcion válida
                *******************************************
                """;
        System.out.println(menu);
        return Integer.valueOf(lectura.nextLine());
    }

    public double solicitarValor(){
        System.out.println("Ingrese el valor que desea convertir");
        return Double.valueOf(lectura.nextLine());
    }


}
