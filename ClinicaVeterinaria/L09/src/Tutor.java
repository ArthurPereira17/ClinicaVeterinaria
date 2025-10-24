import java.util.ArrayList;

public class Tutor extends Pessoa implements Registravel{
    private String telefone;
    private String endereco;
    private ArrayList<Animal> animais;

    public Tutor(String nome, String cpf) {
        super(nome, cpf);
        this.animais = new ArrayList<>();
    }

    public Tutor(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf);
        setTelefone(telefone);
        this.endereco = endereco;
        this.animais = new ArrayList<>();
    }

    @Override
    public void getResumo() {
        System.out.println("Nome: " + getNome() + " é um tutor");
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isEmpty()) {
            throw new IllegalArgumentException("Insira um número de telefone!");
        }
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void adicionaAnimal(Animal animal){
        animais.add(animal);
    }
    public void removeAnimal(Animal animal){
        animais.remove(animal);
    }


    public void exibirInfo() {
        System.out.println("Tutor: " + getNome());
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("------------------------------");
    }

    @Override
    public void registrarNoSistema() {
        System.out.println("Tutor registrado no sistema");
    }
}
