import java.util.*;

abstract class Branch {
    protected List<File> files;

    public Branch(String name, Person owner) {
        this.files = new ArrayList<>();
        this.name = name;
        this.owner = owner;
    }

    private String name;
    private Person owner;
}