package ro.sapientia.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImplements implements DictionaryService {

    @Autowired
    private DictionaryRepository repository;

    @Override
    public boolean findWord(String word){
        return repository.findWord(word);
    }
}
