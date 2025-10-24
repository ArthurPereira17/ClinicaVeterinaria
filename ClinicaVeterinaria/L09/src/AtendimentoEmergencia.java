import java.time.LocalDate;

public class AtendimentoEmergencia extends Atendimento implements Pagavel{

    private double valorBase;
    private double taxaEmergencia;

    public AtendimentoEmergencia(int id,LocalDate data, String descricao, Veterinario veterinario, Animal animal,double valorBase, double taxaEmergencia){
        super(id, data, descricao, veterinario, animal);
        this.valorBase = valorBase;
        this.taxaEmergencia = taxaEmergencia;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    public double getValorBase() {
        return valorBase;
    }

    public void setTaxaEmergencia(double taxaEmergencia) {
        this.taxaEmergencia = taxaEmergencia;
    }
    public double getTaxaEmergencia() {
        return taxaEmergencia;
    }

    @Override
    public double calcularValor() {
        return valorBase + taxaEmergencia;
    }



    @Override
    public double getValorTotal() {
        return 0;
    }

    @Override
    public String getDescricaoPagamentos() {
        return "Atendimento #" + id + " - Animal: " + getAnimal().getNome() +
                " - Veterinário: " + getVeterinario().getNome();
    }

    @Override
    public void registrarNoSistema() {
        System.out.println("Atendimento n°" + id + " registrado com sucesso");
    }
}
