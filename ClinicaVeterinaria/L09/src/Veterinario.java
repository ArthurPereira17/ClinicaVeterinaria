public class Veterinario extends Pessoa implements Registravel{
    private String crmv;
    private String especialidade;
    private Veterinario supervisor;

    public Veterinario(String nome, String cpf, String crmv, String especialidade) {
        super(nome, cpf);
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    @Override
    public void getResumo() {
        System.out.println("Nome: " + getNome());
        System.out.println("CRMV: " + crmv);
        System.out.println("Especialidade: " + especialidade);
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setSupervisor(Veterinario supervisor) {
        this.supervisor = supervisor;
    }

    public Veterinario getSupervisor() {
        return supervisor;
    }

    public void exibirInfo() {
        System.out.println("Veterinário: " + getNome());
        System.out.println("CRMV: " + crmv);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Supervisor: " + supervisor);
        System.out.println("------------------------------");
    }

    @Override
    public void registrarNoSistema() {
        System.out.println("Veterinário com CRMV válido registrado no sistema.");
    }
}
