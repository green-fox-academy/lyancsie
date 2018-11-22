package Extension;

import Extension.Extension;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {
  
  Extension extension = new Extension();
  
  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }
  
  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }
  
  @Test
  void testAdd_2and4is6() {
    assertEquals(6, extension.add(2, 4));
  }
  
  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }
  
  @Test
  void testMaxOfThree_firstSwappedOrder() {
    assertEquals(5, extension.maxOfThree(5, 3, 4));
  }
  
  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }
  
  void testMaxOfThree_thirdSwappedOrder() {
    assertEquals(5, extension.maxOfThree(4, 3, 5));
  }
  
  @Test
  void testMaxOfThree_second() {
    assertEquals(5, extension.maxOfThree(3, 5, 4));
  }
  
  @Test
  void testMaxOfThree_secondSwappedOrder() {
    assertEquals(5, extension.maxOfThree(4, 5, 3));
  }
  
  @Test
  void testMedian_four() {
    assertEquals(5, extension.median(Arrays.asList(7, 5, 3, 5)));
  }
  
  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1, 2, 3, 4, 5)));
  }
  
  @Test
  void testMedian_five_unsorted() {
    assertEquals(5, extension.median(Arrays.asList(5, 10, 10, 1)));
  }
  
  @Test
  void testMedian_eight_unsorted() {
    assertEquals(5, extension.median(Arrays.asList(0, 10, 2, 20, 3, 30, 4, 40, 5, 50)));
  }
  
  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }
  
  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }
  
  @Test
  void testIsVowel_e() {
    assertTrue(extension.isVowel('e'));
  }
  
  @Test
  void testIsVowel_i() {
    assertTrue(extension.isVowel('i'));
  }
  
  @Test
  void testIsVowel_o() {
    assertTrue(extension.isVowel('o'));
  }
  
  @Test
  void testIsVowel_d() {
    assertFalse(extension.isVowel('d'));
  }
  
  @Test
  void testTranslate_bemutatkozik() {
    
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }
  
  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
  
  @Test
  void testTranslate_endsWithAVowel() {
    assertEquals("lavabdava", extension.translate("labda"));
  }
  
  @Test
  void testTranslate_lastLetterIsASyllable() {
    assertEquals("csuvuk", extension.translate("csuk"));
  }
  
  @Test
  void testTranslate_3similarVowels() {
    assertEquals("csovokovolovom", extension.translate("csokolom"));
  }
  
  @Test
  void testTranslate_2similarvowels() {
    assertEquals("kovokovo", extension.translate("kokok"));
  }
  
  @Test
  void testTranslate_1similarvowel() {
    assertEquals("kavakovok", extension.translate("kakok"));
  }
}
