package com.site.SDE.Service;

import com.site.SDE.Entite.Entreprise;
import com.site.SDE.Repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrepriseServiceImpl implements EntrepriseService{
    @Autowired
    EntrepriseRepository entrepriseRepository;
    @Override
    public Entreprise ajouterEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public Entreprise modifierEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> listEntreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public void supprimerEntreprise(Long id) {
        entrepriseRepository.deleteById(id);
    }

    @Override
    public Optional<Entreprise> getEntrepriseById(Long id) {
        return entrepriseRepository.findById(id);
    }

    @Override
    public Entreprise getEntrepriseByEmail(String email) {
        return entrepriseRepository.findEntrepriseByEmail(email);
    }

    @Override
    public List<Entreprise> getEntrepriseByEtat(int etat) {
        return entrepriseRepository.findByEtat(etat);
    }


}
