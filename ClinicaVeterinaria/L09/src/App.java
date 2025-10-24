import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Animal a1 = new Animal("Rex", "Cachorro", 3, "Saudável");
        Animal a2 = new Animal("Mimi", "Gato", 2, "Resfriado");
        Animal a3 = new Animal("Thor", "Cachorro", 5, "Febre");
        Animal a4 = new Animal("Nina", "Gata", 1, "Vacinação");
        Animal a5 = new Animal("Luna", "Cachorra", 4, "Pós-cirurgia");

        Tutor t1 = new Tutor("Maria", "123.456.789-00", "98765-4040", "Rua das Flores, 43");
        Tutor t2 = new Tutor("André", "123.897.090-09", "94532-8909", "Avenida Souza, 89");
        Tutor t3 = new Tutor("Beatriz", "123.456.789-00", "98765-4040", "Rua Itajai, 83");
        Tutor t4 = new Tutor("Amanda", "123.897.090-09", "94532-8909", "Avenida Florianopolis, 39");
        Tutor t5 = new Tutor("Pedro", "123.456.789-00", "98765-4040", "Rua das Flores, 37");

        t1.adicionaAnimal(a1);
        t1.adicionaAnimal(a2);
        t2.adicionaAnimal(a3);
        t2.adicionaAnimal(a4);


        Veterinario v1 = new Veterinario("Dr. Arthur", "987.654.432-10", "46283", "Clínico Geral");
        Veterinario v2 = new Veterinario("Dra. Ana", "999.111.187-97", "12345-CRMV", "Dermatologista");
        Veterinario v3 = new Veterinario("Dr. Carlos", "283.686.262-09", "67890-CRMV", "Fisioterapeuta");

        AtendimentoEmergencia e1 = new AtendimentoEmergencia(1, LocalDate.now(),"Ferimento leve", v1, a1, 155.99,45.00);
        AtendimentoRetorno r1 = new AtendimentoRetorno(1, LocalDate.now().plusWeeks(3),"Revisão",v1,a1,e1,105.99);

        AtendimentoEmergencia e2 = new AtendimentoEmergencia(2, LocalDate.now(),"Urgência respiratória", v1, a2, 235.00,30.00);
        AtendimentoRetorno r2 = new AtendimentoRetorno(2, LocalDate.now().plusWeeks(2),"Revisão",v1,a2,e2,235.00);

        AtendimentoEmergencia e3 = new AtendimentoEmergencia(3, LocalDate.now(),"Queimadura com fogo", v2, a3, 250.00,35.00);
        AtendimentoRetorno r3 = new AtendimentoRetorno(3, LocalDate.now().plusWeeks(2),"Revisão",v2,a3,e3,215.00);

        AtendimentoEmergencia e4 = new AtendimentoEmergencia(4, LocalDate.now(),"Atropelamento",v3, a2, 175.00,40.00);
        AtendimentoRetorno r4 = new AtendimentoRetorno(4, LocalDate.now().plusWeeks(2),"Revisão",v3,a4,e4,205.00);

        List<Pessoa> pessoas = Arrays.asList(t1,t2,t3,t4,t5,v1,v2,v3);
        List<Atendimento> atendimentos = Arrays.asList(e1,e2,r1,r2,e3,r3,e4,r4);

        System.out.println("=====Lista de Pessoas=====");
        for (Pessoa p : pessoas){
            System.out.println(p.getNome());
            p.registrarNoSistema();
        }

        System.out.println("=====Lista de Atendimentos=====");
        for (Atendimento a : atendimentos){
            a.exibirResumo();
            a.registrarNoSistema();
            System.out.println(a.getDescricaoPagamentos());
        }

    }
}
