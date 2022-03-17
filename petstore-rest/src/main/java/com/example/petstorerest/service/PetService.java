package com.example.petstorerest.service;

import com.example.petstorerest.model.Pet;
import com.example.petstorerest.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository)
    {
        this.petRepository = petRepository;
    }

    public Pet getPetById(final long petId) {
        return petRepository.getPetById(petId);
    }

    public List<Pet> findPetByStatus(final String status) {
        return petRepository.findPetByStatus(status);
    }

    public List<Pet> findPetByTags(final List<String> tags) {
        return  petRepository.findPetByTags(tags);
    }

    public void addPet(final Pet pet) {
        if(pet.getId() == null)
        {
            pet.setId(petRepository.autoIncrement());
        }
        petRepository.addPet(pet);
    }

    public void deletePetById(final Long petId) {
        petRepository.deletePetById(petId);
    }
}
