class Book {
    private int pages;
    private String name;
    private String author;

    
    public Book(String author, String name, int pages) {
        this.pages = pages;
        this.author = author;
        this.name = name;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getName() {
        return this.name;
    }
    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.author + ", " + this.name + ", " + this.pages + " pages";
    }
}