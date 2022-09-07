package inheritanceDemo;

public interface Max {
    public void mp3Player();
    public void games();

    default public void newIdea(){
        System.out.println("I'm default method since java 1.8");
    }
}
