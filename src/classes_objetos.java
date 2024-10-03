// Importação de classes para permitir com que as listas sejam criadas	
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe para Pessoa Física
class PessoaFisica {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    public String toString() {
        return "Pessoa Física [Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Email: " + email + "]";
    }
}

// Classe para a Pessoa Jurídica
class PessoaJuridica {
    private String nome;
    private String cnpj;
    private String endereco;
    private String email;

    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
    }

    public String toString() {
        return "Pessoa Jurídica [Nome: " + nome + ", CNPJ: " + cnpj + ", Endereço: " + endereco + ", Email: " + email + "]";
    }
}

// Classe para o Funcionário
class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }
    public String toString() {
        return "Funcionário [Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Salário: " + salario + "]";
    }
}
// Classe para os testes
public class classes_objetos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PessoaFisica> pessoasFisicas = new ArrayList<>();
        List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();

        // Cadastro de Pessoa Física
        System.out.println("Cadastro de Pessoa Física");
        System.out.print("Nome: ");
        String nomePF = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfPF = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPF = scanner.nextLine();
        System.out.print("Email: ");
        String emailPF = scanner.nextLine();
        pessoasFisicas.add(new PessoaFisica(nomePF, cpfPF, enderecoPF, emailPF));

        // Cadastro de Pessoa Jurídica
        System.out.println("\nCadastro de Pessoa Jurídica");
        System.out.print("Nome: ");
        String nomePJ = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpjPJ = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoPJ = scanner.nextLine();
        System.out.print("Email: ");
        String emailPJ = scanner.nextLine();
        pessoasJuridicas.add(new PessoaJuridica(nomePJ, cnpjPJ, enderecoPJ, emailPJ));

        // Cadastro de Funcionário
        System.out.println("\nCadastro de Funcionário");
        System.out.print("Nome: ");
        String nomeFunc = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfFunc = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoFunc = scanner.nextLine();
        System.out.print("Salário: ");
        double salarioFunc = scanner.nextDouble();
        funcionarios.add(new Funcionario(nomeFunc, cpfFunc, enderecoFunc, salarioFunc));

        // Exibindo as informações cadastradas (os testes)
        System.out.println("\nPessoas Físicas cadastradas:");
        for (PessoaFisica pf : pessoasFisicas) {
            System.out.println(pf);
        }

        System.out.println("\nPessoas Jurídicas cadastradas:");
        for (PessoaJuridica pj : pessoasJuridicas) {
            System.out.println(pj);
        }

        System.out.println("\nFuncionários cadastrados:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        scanner.close();
    }
}