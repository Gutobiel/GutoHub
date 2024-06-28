public class Main {
    public static void main(String[] args) {
        User user = new User("john_doe", "john@example.com", "password123");
        Repository repo = new Repository("john_doe", "sample-repo", "This is a sample repository.", true);
        user.addRepository(repo);

        File file = new File("Sample content", "txt");
        user.addFile(repo, file);

        user.starRepository(repo);

        PullRequest pr = user.createPullRequest(repo, repo, "Improved the documentation.");
        System.out.println("Pull Request created: " + pr);
    }
}	