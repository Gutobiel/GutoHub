import java.util.ArrayList;
import java.util.List;

class File {
    private int additions;
    private int deletions;
    private String content;
    private String type;
    private List<File> versions;

    public File(String content, String type) {
        this.content = content;
        this.type = type;
        this.additions = 0;
        this.deletions = 0;
        this.versions = new ArrayList<>();
    }

    public int changeFiles(int additions, int deletions) {
        this.additions += additions;
        this.deletions += deletions;
        return this.additions - this.deletions;
    }

    public void postChangeFiles() {
        // Implement logic for post-change files
    }
}
