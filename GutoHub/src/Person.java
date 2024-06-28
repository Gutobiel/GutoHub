import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    private String nome;
    private String email;
    private List<Repository> repositories;

    public Person(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.repositories = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void addRepository(Repository repository) {
        this.repositories.add(repository);
    }
}
