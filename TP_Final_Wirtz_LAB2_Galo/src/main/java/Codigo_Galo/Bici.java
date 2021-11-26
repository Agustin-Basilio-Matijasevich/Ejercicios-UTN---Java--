package Codigo_Galo;

import java.io.Serializable;

/**
 *
 * @author Galo
 */
public class Bici implements Serializable
{
    private String Tipo;
    private String Marca;
    private double Rodado;
    private String TipoDeFrenos;
    private String Frame;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getRodado() {
        return Rodado;
    }

    public void setRodado(double rodado) {
        Rodado = rodado;
    }

    public String getTipoDeFrenos() {
        return TipoDeFrenos;
    }

    public void setTipoDeFrenos(String tipoDeFrenos) {
        TipoDeFrenos = tipoDeFrenos;
    }

    public String getFrame() {
        return Frame;
    }

    public void setFrame(String frame) {
        Frame = frame;
    }

    public Bici (String Tipo, String Marca, double Rodado, String TipoDeFrenos, String Frame){
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.Rodado = Rodado;
        this.TipoDeFrenos = TipoDeFrenos;
        this.Frame = Frame;
    }
}
