package uvg.edu.gt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DictionaryTest {
    

    @Test
    public void testInsertDuplicate() {
        Dictionary dictionary = new Dictionary();
        dictionary.insert("house", "casa");
        dictionary.insert("house", "hogar");
        

        assertEquals("casa", dictionary.translate("house"));
    }


    @Test
    public void testTranslate() {
        Dictionary dictionary = new Dictionary();
        dictionary.insert("house", "casa");
        dictionary.insert("dog", "perro");
        dictionary.insert("homework", "tarea");
        
  
        assertEquals("casa", dictionary.translate("house"));
        assertEquals("perro", dictionary.translate("dog"));
        assertEquals("tarea", dictionary.translate("homework"));

    
        assertEquals("cat", dictionary.translate("cat"));
        assertEquals("town", dictionary.translate("town"));
    }

    @Test
    public void testTranslateCaseInsensitive() {
        Dictionary dictionary = new Dictionary();
        dictionary.insert("house", "casa");
        
 
        assertEquals("casa", dictionary.translate("House"));
        assertEquals("casa", dictionary.translate("HOUSE"));
    }


}
