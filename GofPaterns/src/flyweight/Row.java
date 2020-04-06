package flyweight;

import java.util.List;

public class Row extends EnglishCharacter {
    private List<EnglishCharacter> englishCharacters;
    @Override
    public void printCharacter() {
        englishCharacters.forEach(EnglishCharacter::printCharacter);
    }
}
