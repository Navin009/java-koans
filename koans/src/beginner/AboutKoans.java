package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.util.Assert.fail;

public class AboutKoans {

    @Koan
    public void findAboutKoansFile() {
//        fail("delete this line to advance");
    }

    @Koan
    public void definitionOfKoanCompletion() {
        boolean koanIsComplete = true;
        if (!koanIsComplete) {
            fail("what if koanIsComplete variable was true?");
            // It will execute the fail method and throw an exception
        }
    }

}
