import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um atendimento realizado em um animal dentro da clínica veterinária.
 * Cada atendimento possui uma data, uma descrição, um veterinário responsável,
 * o animal atendido e uma lista de procedimentos realizados.
 *
 * @author Arthur Nascimento Pereira anpereira@furb.br
 * @version 2.0
 */
public abstract class Atendimento implements Pagavel,Registravel{
    protected int id;
    private Animal animal;
    private Veterinario veterinario;
    private LocalDate data;
    private String descricao;

public Atendimento() {
        data = LocalDate.now();
        descricao = "Sem descrição";
        veterinario = null;
        animal = null;
    }


    public Atendimento(int id, LocalDate data, String descricao, Veterinario veterinario, Animal animal) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.animal = animal;
        this.veterinario = veterinario;
    }

    public abstract double calcularValor();

    public void exibirResumo(){
        System.out.println("Atendimento ID: " + id);
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Veterinário: " + veterinario.getNome());
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: R$ " + calcularValor());
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Veterinario getVeterinario() {
        return veterinario;
    }


    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }


    public Animal getAnimal() {
        return animal;
    }


    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void registrarNoSistema() {
        System.out.println("Atendimento n°" + id + " registrado com sucesso");
    }
}
