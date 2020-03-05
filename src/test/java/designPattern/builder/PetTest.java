package designPattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void legalBuild() {
        final Pet.Builder builder = new Pet.Builder();
        final Pet pet = builder
                .withAnimal(Animal.CAT)
                .withPetName("Squidge")
                .withOwnerName("Simon Smith")
                .withAddress("123 High Street")
                .withTelephone("07777777770")
                .withEmailAddress("simon@email.com")
                .build();
    }

    /**
     * 꼭 필요한 생성자 매개변수가 없을 때
     */
    @Test(expected = IllegalStateException.class)
    public void illegalBuild() {
        final Pet.Builder builder = new Pet.Builder();
        final Pet pet = builder
                .withAnimal(Animal.DOG)
                .withPetName("Fido")
                .withOwnerName("Simon Smith")
                .build();
    }

}