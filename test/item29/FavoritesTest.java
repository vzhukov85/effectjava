package item29;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FavoritesTest {

    private Favorites subj;

    @Before
    public void setUp() throws Exception {
        subj = new Favorites();
    }

    @Test
    public void testPutFavorites() throws Exception {
        subj.putFavorites(String.class, "Java");
        subj.putFavorites(Integer.class, 0xcafebabe);
        subj.putFavorites(Class.class, Favorites.class);

        assertThat(subj.getFavorite(Class.class), Matchers.equalTo(Favorites.class));
        assertThat(subj.getFavorite(Integer.class), Matchers.equalTo(0xcafebabe));
        assertThat(subj.getFavorite(String.class), Matchers.equalTo("Java"));
    }
}