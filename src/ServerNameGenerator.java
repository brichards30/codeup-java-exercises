import java.util.Random;
import java.util.ArrayList;

public class ServerNameGenerator {

//        String[] adjs = new String[10];
//        String[] nouns = new String[10];

    public static String[] nouns = {"car", "bike", "bus", "soldier", "restaurant", "tea", "coffee", "water", "bed", "game"};
    public static String[] adjs = {"good", "bad", "beautiful", "ugly", "annoying", "unique", "fast", "slow", "average", "great"};

//        adjs[0] = "good";
//        adjs[1] = "bad";
//        adjs[2] = "beautiful";
//        adjs[3] = "ugly";
//        adjs[4] = "annoying";
//        adjs[5] = "unique";
//        adjs[6] = "fast";
//        adjs[7] = "slow";
//        adjs[8] = "average";
//        adjs[9] = "great";
//
//        nouns[0] = "car";
//        nouns[1] = "bike";
//        nouns[2] = "bus";
//        nouns[3] = "soldier";
//        nouns[4] = "restaurant";
//        nouns[5] = "tea";
//        nouns[6] = "coffee";
//        nouns[7] = "water";
//        nouns[8] = "bed";
//        nouns[9] = "game";

    public static String getRandomWords(String[] words) {
        Random random = new Random();
        int rndNum = random.nextInt(words.length);
        return words[rndNum];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(getRandomWords(adjs) + "-" + getRandomWords(nouns));

    }
}
