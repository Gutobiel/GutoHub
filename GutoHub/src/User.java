import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

class User {
    private String userName;
    private UUID id;
    private String profile;
    private String email;
    private String password;
    private List<Repository> repositories;
    private List<Star> stars;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.id = UUID.randomUUID();
        this.email = email;
        this.password = password;
        this.repositories = new ArrayList<>();
        this.stars = new ArrayList<>();
    }

    public void createListStars(String name, String description) {
        stars.add(new Star(true, this, new Repository(this.userName, name, description, true)));
    }

    public void addRepository(Repository repo) {
        repositories.add(repo);
    }

    public void addFile(Repository repo, File file) {
        repo.addFile(file);
    }

    public void starRepository(Repository repo) {
        stars.add(new Star(true, this, repo));
    }

    public PullRequest createPullRequest(Repository origin, Repository destination, String description) {
        return new PullRequest(origin.getOwner(), destination.getOwner(), description);
    }

    public Map<String, Object> login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            Map<String, Object> loginDetails = new HashMap<>();
            loginDetails.put("profile", this.profile);
            loginDetails.put("id", this.id);
            return loginDetails;
        }
        return null;
    }
}
