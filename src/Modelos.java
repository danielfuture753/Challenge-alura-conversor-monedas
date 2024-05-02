public class Modelos {

    private String resultado;
    private String mOriginal;
    private String mDestino;
    private double monto_cambio;
    private double monto_resultado;

//    public Modelos(String resultado, String mOriginal, String mDestino, double monto_cambio, double monto_resultado) {
//        this.resultado = resultado;
//        this.mOriginal = mOriginal;
//        this.mDestino = mDestino;
//        this.monto_cambio = monto_cambio;
//        this.monto_resultado = monto_resultado;
//    }

    public Modelos (Moneda miMoneda){
        this.resultado = miMoneda.result();
        this.mOriginal = miMoneda.base_code();
        this.mDestino = miMoneda.target_code();
        this.monto_cambio = miMoneda.conversion_rate();
        this.monto_resultado = miMoneda.conversion_result();
    }

    public void actualizarMoneda(Moneda nuevaMoneda) {
        this.resultado = nuevaMoneda.result();
        this.mOriginal = nuevaMoneda.base_code();
        this.mDestino = nuevaMoneda.target_code();
        this.monto_cambio = nuevaMoneda.conversion_rate();
        this.monto_resultado = nuevaMoneda.conversion_result();
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getmOriginal() {
        return mOriginal;
    }

    public void setmOriginal(String mOriginal) {
        this.mOriginal = mOriginal;
    }

    public String getmDestino() {
        return mDestino;
    }

    public void setmDestino(String mDestino) {
        this.mDestino = mDestino;
    }

    public double getMonto_cambio() {
        return monto_cambio;
    }

    public void setMonto_cambio(double monto_cambio) {
        this.monto_cambio = monto_cambio;
    }

    public double getMonto_resultado() {
        return monto_resultado;
    }

    public void setMonto_resultado(double monto_resultado) {
        this.monto_resultado = monto_resultado;
    }

    @Override
    public String toString() {
        return  "resultado= " + resultado +
                ",\nmOriginal= " + mOriginal +
                ",\nmDestino= " + mDestino +
                ",\nmonto_cambio= " + monto_cambio +
                ",\nmonto_resultado= " + monto_resultado + "\n";
    }
}
