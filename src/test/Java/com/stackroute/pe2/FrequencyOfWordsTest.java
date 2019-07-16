package com.stackroute.pe2;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {

        FrequencyOfWords frequencyOfWords;
        @Before
        public void setUp() {
            frequencyOfWords = new FrequencyOfWords();
        }

        @After
        public void tearDown() {
            frequencyOfWords = null;
        }

        @Test
        public void testCalculateWordFrequencySuccessGivenFilePathShouldReturnWordCount() {
            HashMap<String, Integer> expectedWordCound = new HashMap<>();
            expectedWordCound.put("i", 3);
            expectedWordCound.put("am", 1);
            expectedWordCound.put("like", 1);
            expectedWordCound.put("have", 1);
            expectedWordCound.put("a", 2);
            assertEquals("testCalculateWordFrequencySuccessGivenFilePathShouldReturnWordCount: check calculateWordFrequency()",
                    expectedWordCound, frequencyOfWords.frequencyOfWords("test_files/FileDemo.txt"));
        }

        @Test
        public void testCalculateWordFrequencyFailureGivenFilePathShouldReturnNull() {
            assertNull("testCalculateWordFrequencyFailureGivenFilePathShouldReturnNull: check calculateWordFrequency(). Should return null.",
                    frequencyOfWords.frequencyOfWords("testFile.txt"));
        }
    }
}