package abstractions;

import models.Cat;
import models.Owner;

import java.util.List;

public interface ICatRepository {
    Cat registerCat(Cat cat);
    List<Cat> getAllCats();
    Cat findCatById(Long id);
    Cat updateOwner(Cat cat, Owner owner);
    Cat addFriendToCat(Cat cat, Cat friend);
    List<Cat> getAllCatFriends(Cat cat);
    List<Cat> getCatsByColor(String color);
    void deleteCatById(Long id);
}