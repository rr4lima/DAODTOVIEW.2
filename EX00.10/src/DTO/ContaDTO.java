package DTO;

public class ContaDTO {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    public ContaDTO(String descricao, double valor, String dataVencimento, boolean pago) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.pago = pago;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "ContaDTO{" + "descricao=" + descricao + ", valor=" + valor + ", dataVencimento=" + dataVencimento + ", pago=" + pago + '}';
    }

    
}
