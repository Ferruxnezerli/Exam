
//Task2
public class Main {
    public static void main(String[] args) {
        FilmCollection filmCollection=new FilmCollection();

        // add
        filmCollection.add(new Film(1,"Inception","Science fiction",2010));
        filmCollection.add(new Film(2,"Gost","Romantic",2010));
        filmCollection.add(new Film(3,"LOTR","History",2002));

        //add Map
        filmCollection.addMap(filmCollection.filmList.get(0).getGenre(),filmCollection.filmList.get(0));
        filmCollection.addMap(filmCollection.filmList.get(1).getGenre(),filmCollection.filmList.get(1));
        filmCollection.addMap(filmCollection.filmList.get(2).getGenre(),filmCollection.filmList.get(2));

        //add Set
        filmCollection.addSet("Inception");
        filmCollection.addSet("gost");
        filmCollection.addSet("LOTR");




////        Film sil
//        filmCollection.delete(1);

        //Janrlara görə filmləri göstər

        System.out.println(filmCollection.filmForGenre("History"));

//        Bütün filmləri göstər
        System.out.println(filmCollection.allFilm());


        }

}
