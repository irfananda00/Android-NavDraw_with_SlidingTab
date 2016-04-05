package project.irfananda.navdraw_w_slidetab.object;

import java.util.ArrayList;
import java.util.List;

import project.irfananda.navdraw_w_slidetab.R;

public class DefineListFilm {

    public static List<Film> filmListSmall;
    public static List<Film> filmListMedium;
    public static List<Film> filmListRandom;
    private static int[] imgsmall = {
            R.drawable.avatar_small,
            R.drawable.avengers_small,
            R.drawable.fault_in_our_star_small,
            R.drawable.gamer_small,
            R.drawable.iron_man_3_small,
            R.drawable.nemo_small,
            R.drawable.popeye_small,
            R.drawable.spiderman_small,
            R.drawable.starwars_small,
            R.drawable.taken3_small,
            R.drawable.titanic_small
    };
    private static int[] imgmedium = {
            R.drawable.avatar_medium,
            R.drawable.avengers_medium,
            R.drawable.fault_in_our_star_medium,
            R.drawable.gamer_medium,
            R.drawable.iron_man_3_medium,
            R.drawable.nemo_medium,
            R.drawable.popeye_medium,
            R.drawable.spiderman_medium,
            R.drawable.starwars_medium,
            R.drawable.taken3_medium,
            R.drawable.titanic_medium
    };
    private static Film film;

    public static void setFilmListSmall() {
        filmListSmall = new ArrayList<>();
        film = new Film("action, fantasy", imgsmall[0],"Avatar",6.3,false);
        filmListSmall.add(film);
        film = new Film("action", imgsmall[1],"Avengers",6.0,false);
        filmListSmall.add(film);
        film = new Film("drama", imgsmall[2],"The Fault in our Star",4.2,false);
        filmListSmall.add(film);
        film = new Film("action", imgsmall[3],"Gamer",6.8,false);
        filmListSmall.add(film);
        film = new Film("action", imgsmall[4],"Iron Man 3",5.7,false);
        filmListSmall.add(film);
        film = new Film("Animation", imgsmall[5],"Nemo",5.1,false);
        filmListSmall.add(film);
        film = new Film("action", imgsmall[6],"Popeye",7.9,false);
        filmListSmall.add(film);
        film = new Film("action", imgsmall[7],"The Amazing Spiderman",8.7,false);
        filmListSmall.add(film);
        film = new Film("action, sci-fi", imgsmall[8],"Star Wars : The Force Awaken",9.1,false);
        filmListSmall.add(film);
        film = new Film("action", imgsmall[9],"Taken 3",5.2,false);
        filmListSmall.add(film);
        film = new Film("drama", imgsmall[10],"Titanic",3.7,false);
        filmListSmall.add(film);
    }

    public static void setFilmListMedium() {
        filmListMedium = new ArrayList<>();
        film = new Film("action, fantasy", imgmedium[0],"Avatar",6.3,false);
        filmListMedium.add(film);
        film = new Film("action", imgmedium[1],"Avengers",6.0,false);
        filmListMedium.add(film);
        film = new Film("drama", imgmedium[2],"The Fault in our Star",4.2,false);
        filmListMedium.add(film);
        film = new Film("action", imgmedium[3],"Gamer",6.8,false);
        filmListMedium.add(film);
        film = new Film("action", imgmedium[4],"Iron Man 3",5.7,false);
        filmListMedium.add(film);
        film = new Film("Animation", imgmedium[5],"Nemo",5.1,false);
        filmListMedium.add(film);
        film = new Film("action", imgmedium[6],"Popeye",7.9,false);
        filmListMedium.add(film);
        film = new Film("action", imgmedium[7],"The Amazing Spiderman",8.7,false);
        filmListMedium.add(film);
        film = new Film("action, sci-fi", imgmedium[8],"Star Wars : The Force Awaken",9.1,false);
        filmListMedium.add(film);
        film = new Film("action", imgmedium[9],"Taken 3",5.2,false);
        filmListMedium.add(film);
        film = new Film("drama", imgmedium[10],"Titanic",3.7,false);
        filmListMedium.add(film);
    }

    public static void setFilmListRandom() {
        filmListRandom = new ArrayList<>();
        film = new Film("action, fantasy", imgmedium[0],"Avatar",6.3,false);
        filmListRandom.add(film);
        film = new Film("action", imgsmall[1],"Avengers",6.0,false);
        filmListRandom.add(film);
        film = new Film("drama", imgmedium[2],"The Fault in our Star",4.2,false);
        filmListRandom.add(film);
        film = new Film("action", imgmedium[3],"Gamer",6.8,false);
        filmListRandom.add(film);
        film = new Film("action", imgsmall[4],"Iron Man 3",5.7,false);
        filmListRandom.add(film);
        film = new Film("Animation", imgsmall[5],"Nemo",5.1,false);
        filmListRandom.add(film);
        film = new Film("action", imgsmall[6],"Popeye",7.9,false);
        filmListRandom.add(film);
        film = new Film("action", imgmedium[7],"The Amazing Spiderman",8.7,false);
        filmListRandom.add(film);
        film = new Film("action, sci-fi", imgmedium[8],"Star Wars : The Force Awaken",9.1,false);
        filmListRandom.add(film);
        film = new Film("action", imgsmall[9],"Taken 3",5.2,false);
        filmListRandom.add(film);
        film = new Film("drama", imgmedium[10],"Titanic",3.7,false);
        filmListRandom.add(film);
    }
}
