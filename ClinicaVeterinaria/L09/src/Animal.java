import java.util.ArrayList;

/**
 * Representa um Animal em uma clínica veterinária ou sistema de cadastro.
 * Contém informações como nome, espécie, idade, histórico clínico, tutor e atendimentos.
 * A idade do animal não pode ser negativa, sendo validada no setter e no construtor.
 * O histórico pode ser atualizado através do método {@link #adicionaHistorico(String)}.
 *
 * @author Arthur Nascimento Pereira anpereira@furb.br
 * @version 2.0
 */
public class Animal {
    /** Nome do animal */
    private String nome;
    /** Espécie do animal (ex.: Cachorro, Gato, Papagaio) */
    private String especie;
    /** Idade do animal em anos */
    private int idade;
    /** Histórico clínico ou observações sobre o animal */
    private String historico;
    /** Tutor responsável pelo animal */
    private Tutor tutor;
    /** Lista de atendimentos realizados no animal */
    private ArrayList<Atendimento> atendimentos;

    /**
     * Construtor padrão que cria um animal genérico
     * com valores iniciais pré-definidos:
     * <br>Nome = "Sem nome" | Espécie = "Sem espécie" | Idade = 0 | Histórico = "Sem histórico"
     */
    public Animal() {
        nome = "Sem nome";
        especie = "Sem especie";
        idade = 0;
        historico = "Sem historico";
        this.atendimentos = new ArrayList<>();
    }

    /**
     * Construtor que cria um animal com os valores informados.
     *
     * @param nome     Nome do animal
     * @param especie  Espécie do animal
     * @param idade    Idade do animal (não pode ser negativa)
     * @param historico Histórico inicial do animal
     * @throws IllegalArgumentException se a idade for negativa
     */
    public Animal(String nome, String especie, int idade, String historico) {
        this.nome = nome;
        this.especie = especie;
        setIdade(idade); // valida a idade
        this.historico = historico;
        this.atendimentos = new ArrayList<>();
    }

    /**
     * Obtém o nome do animal.
     *
     * @return nome do animal
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do animal.
     *
     * @param nome Nome do animal
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a espécie do animal.
     *
     * @return espécie do animal
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Define a espécie do animal.
     *
     * @param especie Espécie do animal
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Define a idade do animal.
     *
     * @param idade Idade em anos (não pode ser negativa)
     * @throws IllegalArgumentException se a idade for negativa
     */
    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    /**
     * Obtém a idade do animal.
     *
     * @return idade do animal
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Obtém o histórico clínico ou observações do animal.
     *
     * @return histórico do animal
     */
    public String getHistorico() {
        return historico;
    }

    /**
     * Define o histórico clínico do animal.
     *
     * @param historico Histórico clínico ou observações
     */
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    /**
     * Obtém o tutor do animal.
     *
     * @return Tutor responsável pelo animal
     */
    public Tutor getTutor() {
        return tutor;
    }

    /**
     * Define o tutor do animal.
     *
     * @param tutor Tutor responsável pelo animal
     */
    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    /**
     * Obtém a lista de atendimentos do animal.
     *
     * @return Lista de atendimentos realizados
     */
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    /**
     * Adiciona ou substitui o histórico do animal por uma nova descrição.
     *
     * @param descricao Texto da anotação ou atualização do histórico
     * @return histórico atualizado do animal
     */
    public String adicionaHistorico(String descricao) {
        return historico = descricao;
    }

    /**
     * Adiciona um atendimento à lista de atendimentos do animal.
     *
     * @param atendimento Atendimento a ser adicionado
     */
    public void adicionaAtendimento(Atendimento atendimento){
        atendimentos.add(atendimento);
    }

    /**
     * Remove um atendimento da lista de atendimentos do animal.
     *
     * @param atendimento Atendimento a ser removido
     * @return true se o atendimento foi removido, false caso contrário
     */
    public boolean removeAtendimento(Atendimento atendimento){
        return atendimentos.remove(atendimento);
    }

    /**
     * Retorna uma representação em string do animal.
     *
     * @return String formatada com informações do animal
     */

    /**
     * Exibe as informações do animal formatadas no console.
     */
    public void exibirInfo() {
        System.out.println("Animal: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Histórico: " + historico);
        System.out.println("------------------------------");
    }
}