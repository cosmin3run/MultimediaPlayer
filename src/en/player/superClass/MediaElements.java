package en.player.superClass;

public abstract class MediaElements {
    protected String title;

    public MediaElements(String title) {
        this.title=title;
    }

    public void getTitle() {
        this.title = title;
    }
}
