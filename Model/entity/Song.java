package Model.entity;

public class Song extends Favourite {
    private String disk;
    private String author;
    private String style;

    public Song() {
        super();
        disk="";
        author="";
        style="";
    }

    public Song(String id, String name, double duration, String disk, String author, String style) {
        super(id, name, duration);
        this.disk = disk;
        this.author = author;
        this.style = style;
    }

    public Song(String disk, String author, String style) {
        this.disk = disk;
        this.author = author;
        this.style = style;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Song [ disk=" + disk + "author=" + author + "style=" + style +"]" +super.toString();
    }
}