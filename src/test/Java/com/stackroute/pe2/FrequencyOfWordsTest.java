//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class FrequencyOfWordsTest {
//
//        FrequencyOfWords frequencyOfWords;
//        @Before
//        public void setUp() {
//            //This method runs, before running an of the testcase
//            //This method is used to initialize the required variables
//            frequencyOfWords = new FrequencyOfWords();
//        }
//
//        @After
//        public void tearDown() {
//            //This method runs,after running all the testcases
//            //This method is used to clear the initialized variables
//            frequencyOfWords = null;
//        }
//
//        @Test
//        public void givenAFileNameShouldReturnIfItsValid() {
//            //Check for valid filename
//            FrequencyOfWords frequencyOfWords= new FrequencyOfWords();
//            String actualResult= frequencyOfWords.frequencyOfWords("file.txt");
//            //Returns valid filename
//            assertEquals("valid file name",actualResult);
//        }
//        @Test
//       public void givenAFilenameShouldCheckForFrequencyOfWords() {
//            //Check for frequency of words
//            FrequencyOfWords frequencyOfWords = new FrequencyOfWords();
//            //This method returns frequency of words
//            String actualResult = frequencyOfWords.frequencyOfWords("i am a man,i like to sleep,i have a home");
//            assertEquals("i->3times, am->1time,like->1time,a->2times", actualResult);
//        }
//        @Test
//    public void givenAInvalidStringShouldReturnContentNotFound(){
//            FrequencyOfWords frequencyOfWords = new FrequencyOfWords();
//            //Check for content of file
//            String actualResult= frequencyOfWords.frequencyOfWords("StackRoute");
//            assertEquals("Invalid content",actualResult);
//
//        }
//}