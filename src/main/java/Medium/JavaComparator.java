package Medium;

import java.util.*;

public class JavaComparator {

    class Checker implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score != o2.score) {
                return (o2.score - o1.score); // remember, think of the array arranged horizontally, and the directions -1 and 1 point to.
            } else {
                return o1.name.compareTo(o2.name);
            }
        }
    }

    class Player {

        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
}