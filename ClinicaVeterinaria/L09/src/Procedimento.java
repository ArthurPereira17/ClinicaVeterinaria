/**
 * Representa um procedimento realizado em um atendimento veterinário.
 * Um procedimento pode ser, por exemplo, uma vacina, exame ou tratamento.
 *
 * @author Arthur Nascimento Pereira anpereira@furb.br
 * @version 2.0
 */
public class Procedimento {
    private String nome;
    private double custo;
    private String observacoes;

    /**
     * Construtor padrão que inicializa o procedimento
     * com valores genéricos.
     */
    public Procedimento() {
        nome = "Sem nome";
        custo = 0.0;
        observacoes = "Sem observações";
    }

    /**
     * Construtor completo para inicializar o procedimento
     * com os dados fornecidos.
     *
     * @param nome         Nome do procedimento
     * @param custo        Custo do procedimento em reais
     * @param observacoes  Observações adicionais
     */
    public Procedimento(String nome, double custo, String observacoes) {
        this.nome = nome;
        this.custo = custo;
        this.observacoes = observacoes;
    }

    /**
     * Retorna o nome do procedimento.
     * @return Nome do procedimento
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do procedimento.
     * @param nome Nome do procedimento
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o custo do procedimento.
     * @return Custo em reais
     */
    public double getCusto() {
        return custo;
    }

    /**
     * Define o custo do procedimento.
     * @param custo Valor em reais
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * Retorna as observações do procedimento.
     * @return Texto com observações
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * Define as observações do procedimento.
     * @param observacoes Texto com observações
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
