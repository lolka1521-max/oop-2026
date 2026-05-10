package ro.sapientia.oop;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

@Repository
public class DictionaryRepository {

    private ArrayList<String> words = new ArrayList<>();

    public DictionaryRepository() {
        try {
            File file = ResourceUtils.getFile("classpath:dict.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                /// Kovetkezo sor
                String line = scanner.nextLine();
                /// Ha a line nem ures amit nem tudunk feldolgozni akkor tesszuk bele maskepp kihagyjuk
                if(line != null && !line.isEmpty()){
                    /// A szavakrol levagjuk a plusz feherkaraktereket
                    String word = line.trim().toLowerCase();
                    words.add(word);
                }
            }
            Collections.sort(words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public boolean findWord(String word) {
        boolean result = false;
        /// A szo atalakitasa kisbetusse
        String convertLower = word.toLowerCase(Locale.ROOT);
        /// Collections.searchBinary kereses
        int index = Collections.binarySearch(words,convertLower);
        /// Ha az index nem negativ szam akkor a szo megtalalhato
        if(index >= 0){
            result = true;
        }
        return result;
    }
}
