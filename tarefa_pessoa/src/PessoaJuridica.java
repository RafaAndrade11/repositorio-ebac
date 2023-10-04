public class PessoaJuridica extends Pessoa {
    private Double cnpj;
    private Double numeroInscricao;

    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

    public Double getNumeroInscricao() {
        return numeroInscricao;
    }

    public void setNumeroInscricao(Double numeroInscricao) {
        this.numeroInscricao = numeroInscricao;
    }
}
