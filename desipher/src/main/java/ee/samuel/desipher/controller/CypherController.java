package ee.samuel.desipher.controller;


import ee.samuel.desipher.entity.Cypher;
import ee.samuel.desipher.repository.CypherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CypherController {
    @Autowired
    private CypherRepository cypherRepository;

    @GetMapping("cypher")
    public List<Cypher> getCyphers(){
        return cypherRepository.findAll();
    }
    @GetMapping("cyphers/{id}")
    public List<Cypher> deleteCypher(@PathVariable Long id){
        cypherRepository.deleteById(id);
        return cypherRepository.findAll();
    }

    @PostMapping("cyphers")
    public List<Cypher> addCypher(@RequestBody Cypher cypher){
        if (cypher.getWord() == null || cypher.getWord().isEmpty()) {
            throw new RuntimeException("Sõna ei tohi olla tühi");
        }
        if (cypher.getWord().length() < 2){
            throw new RuntimeException("Sõna peab olema vähemalt 2 tähte");-
        }
        cypherRepository.save(cypher);
        return cypherRepository.findAll();
    }
    @PutMapping("cyphers")
    public List<Cypher> editCypher(@RequestBody Cypher cypher) {
        cypherRepository.save(cypher);
        return cypherRepository.findAll();
    }

    @GetMapping("cyphers/encrypt")
    public List<Cypher> encrypt(@RequestParam int shift) {
        List<Cypher> cyphers = cypherRepository.findAll();
        for (Cypher cypher : cyphers) {
            cypher.setWord(nihuta(cypher.getWord(), shift));
            cypherRepository.save(cypher);
        }
        return cypherRepository.findAll();
    }

    @GetMapping("cyphers/encryptByLength")
    public List<Cypher> encryptByLength() {
        List<Cypher> cyphers = cypherRepository.findAll();
        for (Cypher cypher : cyphers) {
            cypher.setWord(nihuta(cypher.getWord(), cypher.getWord().length()));
            cypherRepository.save(cypher);
        }
        return cypherRepository.findAll();
    }
    @GetMapping("cyphers/decryptByLength")
    public List<Cypher> decryptByLength() {
        List<Cypher> cyphers = cypherRepository.findAll();
        for (Cypher cypher : cyphers) {
            cypher.setWord(nihuta(cypher.getWord(), -cypher.getWord().length()));
            cypherRepository.save(cypher);
        }
        return cypherRepository.findAll();
    }

    private String nihuta(String word, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            result.append((char)(c + shift));
        }
        return result.toString();
    }
}
