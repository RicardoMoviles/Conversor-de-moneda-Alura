public class Conversor {

    private double valor;
    private double tasaDeCambio;
    private double valorConvertido;

    public Conversor(double valor, double tasaDeCambio) {
        this.valor = valor;
        this.tasaDeCambio = tasaDeCambio;
    }

    public void setValorConvertido() {
        this.valorConvertido = this.valor * this.tasaDeCambio;
    }

    public double getValor() {
        return valor;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void mensaje(String moneda1, String moneda2) {
        System.out.println("El valor "
                +getValor()+ " ["+moneda1+"] corresponde al valor final de =>>> "
                +getValorConvertido()+ " ["+moneda2+"]");
    }


}
