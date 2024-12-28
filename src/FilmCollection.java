import java.util.*;

public class FilmCollection {
    List<Film> filmList = new ArrayList<>();
    Set<String> filmName = new HashSet<>();
    Map<String,Film> filmMap=new HashMap<>();

    public void add(Film film) {
        filmList.add(film);
    }

    public void addSet(String name) {
        filmName.add(name);
    }

    public void addMap(String genre,Film film){
        filmMap.put(genre,film);
    }

    public void delete(int id){
        filmList.remove(id);
    }

    public List<Film> allFilm(){
        return filmList;
    }

    public Film filmForGenre(String genre){

        Set<Map.Entry<String, Film>> entrySet = filmMap.entrySet();
        for (Map.Entry<String, Film> entry : entrySet){
            if (genre.equalsIgnoreCase(entry.getKey())){
                return entry.getValue();
            }
        }
        return null;
    }
}
