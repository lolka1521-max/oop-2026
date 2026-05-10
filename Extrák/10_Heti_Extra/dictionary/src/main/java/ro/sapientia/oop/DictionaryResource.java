package ro.sapientia.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/dictionary")
public class DictionaryResource {
    @Autowired
    private DictionaryService service;
    @GetMapping("/{word}")
    public String word(@PathVariable("word") String word){
        if (service.findWord(word)){
            return "The word " + word + " EXISTS";
        }
        else{
            return "The word " + word + " DOES NOT EXIST";
        }
    }
}
