package viniciusmaia.com.vinipay.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 03/12/2017.
 */

public class Transacao {
    @SerializedName("card_number")
    private String numero;

    @SerializedName("cvv")
    private String codigoSeguranca;

    @SerializedName("expiry_date")
    private String validade;

    @SerializedName("destination_user_id")
    private String idUsuario;

    public Transacao(){}

    public Transacao(String numero, String codigoSeguranca, String validade, String idUsuario) {
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.validade = validade;
        this.idUsuario = idUsuario;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
        this.validade.replaceAll("\\s+","");
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}