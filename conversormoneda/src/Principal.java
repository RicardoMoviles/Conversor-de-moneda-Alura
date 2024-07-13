import java.io.IOException;

public class Principal {

    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Menu menu = new Menu();

        while(true){
            try{
                int opcion =  menu.mostrarMenu();

                if (opcion == 7) {
                    break;
                }else if(opcion == 1){
                    Moneda moneda = consulta.buscaMoneda("USD", "ARS");
                    convertir(menu.solicitarValor(), moneda.conversion_rate(), "USD", "ARS");
                }
                else if(opcion == 2){
                    Moneda moneda = consulta.buscaMoneda("ARS", "USD");
                    convertir(menu.solicitarValor(), moneda.conversion_rate(), "ARS", "USD");
                }
                else if(opcion == 3){
                    Moneda moneda = consulta.buscaMoneda("USD", "BRL");
                    convertir(menu.solicitarValor(), moneda.conversion_rate(), "USD", "BRL");
                }
                else if(opcion == 4){
                    Moneda moneda = consulta.buscaMoneda("BRL", "USD");
                    convertir(menu.solicitarValor(), moneda.conversion_rate(), "BRL", "USD");
                }
                else if(opcion == 5){
                    Moneda moneda = consulta.buscaMoneda("USD", "COP");
                    convertir(menu.solicitarValor(), moneda.conversion_rate(), "USD", "COP");
                }
                else if(opcion == 6){
                    Moneda moneda = consulta.buscaMoneda("COP", "USD");
                    convertir(menu.solicitarValor(), moneda.conversion_rate(), "COP", "USD");
                }
            }catch (NumberFormatException e){
                System.out.println("Numero no encontrado: "+e.getMessage());
            }catch (RuntimeException | IOException | InterruptedException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicacion");
            }


        }
    }
    public static void convertir(double valor, double tasaDeConversion, String moneda1, String moneda2){
        Conversor conversor = new Conversor(valor,tasaDeConversion);
        conversor.setValorConvertido();
        conversor.mensaje(moneda1,moneda2);
    }
}
