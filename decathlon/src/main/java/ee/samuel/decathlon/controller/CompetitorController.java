package ee.samuel.decathlon.controller;

import ee.samuel.decathlon.entity.Competitor;
import ee.samuel.decathlon.repo.CompetitorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CompetitorController {
    @Autowired
    private CompetitorRepo competitorRepo;

    @GetMapping("competitors")
    public List<Competitor> getCompetitors(){
        return competitorRepo.findAll();
    }

    @GetMapping("competitors/{id}")
    public List<Competitor> deleteCompetitor(@PathVariable Long id){
        competitorRepo.deleteById(id);
        return competitorRepo.findAll();
    }

    @PostMapping("competitors")
    public List<Competitor> addCompetitor(@RequestBody Competitor competitor){
        competitorRepo.save(competitor);
        return competitorRepo.findAll();
    }

    @PutMapping("competitors")
    public List<Competitor> editCompetitor(@RequestBody Competitor competitor) {
        competitorRepo.save(competitor);
        return competitorRepo.findAll();
    }
}


