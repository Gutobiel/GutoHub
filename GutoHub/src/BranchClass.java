class BranchClass extends Branch {
    private int id;
    private String name;
    private Repository repository;

    public BranchClass(int id, String name, Repository repository) {
        super(name, repository.getOwner());
        this.id = id;
        this.repository = repository;
    }

    public void exitBranch() {
        // Implement exit branch logic
    }

    private void changeBranch() {
        // Implement change branch logic
    }
}
