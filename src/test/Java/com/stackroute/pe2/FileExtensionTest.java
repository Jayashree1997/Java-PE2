package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileExtensionTest {
        FileExtensionTest fileExtensionTest;
        @Before
        public void setup() {
            System.out.println("Inside Before");
            this.fileExtensionTest= new FileExtensionTest();
        }

        @After
        public void tearDown() {
            System.out.println("Inside After");
            fileExtensionTest = null;
        }
      public void GivenAFolderShouldReturnAllItsFiles() {
              FileExtensionTest fileExtensionTest= new FileExtensionTest();
              String actualResult= fileExtensionTest.fileExtensionTest("home");
              assertEquals("src, idea, iml",actualResult);
          }
          @Test
          public void givenAExtensionShouldReturnAFileWithSameExtension(){
              FileExtensionTest fileExtensionTest= new FileExtensionTest();
              String actualResult= fileExtensionTest.fileExtensionTest(".iml");
              assertEquals("file.iml",actualResult);
          }
          @Test
          public void givenAFileWithExtensionShouldReturnContentsOfThatFile() {
              FileExtensionTest fileExtensionTest = new FileExtensionTest();
              String actualResult = fileExtensionTest.fileExtensionTest("file.iml");
              assertEquals("abcdef", actualResult);
          }
     }




}