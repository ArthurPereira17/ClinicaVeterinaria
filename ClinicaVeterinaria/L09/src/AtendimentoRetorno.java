import java.time.LocalDate;

public class AtendimentoRetorno extends Atendimento implements Pagavel{

    private Atendimento atendimentoAnterior;
    private double valorBase;

    public AtendimentoRetorno(int id,LocalDate data, String descricao, Veterinario veterinario, Animal animal, Atendimento atendimentoAnterior, double valorBase){
        super(id, data, descricao, veterinario, animal);
        this.atendimentoAnterior = atendimentoAnterior;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularValor() {
        return valorBase * 0.5;
    }

    @Override
    public double getValorTotal() {
        return calcularValor();
    }

    @Override
    public String getDescricaoPagamentos() {
        return "Retorno relacionado ao atendimento #" + atendimentoAnterior.id + " - Valor: R$" + getValorTotal();
    }

    @Override
    public void registrarNoSistema() {
        System.out.println("Atendimento n°" + id + " registrado com sucesso");
    }
}
