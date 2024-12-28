public class Film {
    private int id;
    private String filnName;
    private String genre;
    private int year;

    public Film(int id, String filnName, String genre, int year) {
        this.id = id;
        this.filnName = filnName;
        this.genre = genre;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilnName() {
        return filnName;
    }

    public void setFilnName(String filnName) {
        this.filnName = filnName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", filnName='" + filnName + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
