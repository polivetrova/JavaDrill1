package L110;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("создать");
        words.add("массив");
        words.add("с");
        words.add("набором");
        words.add("слов");
        words.add("десять");
        words.add("двадцать");
        words.add("десять");
        words.add("слов");
        words.add("должны");
        words.add("встречаться");
        words.add("повторяющиеся");
        words.add("Найти");
        words.add("и");
        words.add("вывести");
        words.add("уникальных");
        words.add("слов");

        //cheekListForDupl(words);

        //System.out.println("\n________________________");

        Phonebook pb = new Phonebook();
        pb.add("Kim","23739241");
        System.out.println(pb.get("Kim"));
        System.out.println(pb.get("McKay"));

    }

    private static void cheekListForDupl(List<String> list) {
        int wordCount = 0;
        StringBuilder uniqueWords = new StringBuilder();
        Set<String> duplicates = new HashSet<>();

        for (String word : list) {
            for (String s : list) {
                if(word.equals(s)){
                    wordCount++;
                }
            }

            if(wordCount == 1){
                uniqueWords.append(word).append("; ");
            } else {
                duplicates.add(String.format("The word '%s' occurred %d times", word, wordCount));
            }
            wordCount = 0;
        }

        System.out.println("Unique words: " + uniqueWords);
        for (String duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
