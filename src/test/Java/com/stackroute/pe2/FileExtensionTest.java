//package com.stackroute.pe2;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class FileExtensionTest {
//        FileExtensionTest fileExtensionTest;
//        @Before
//        public void setup() {
//            //This method runs, before running an of the testcase
//            //This method is used to initialize the required variables
//            System.out.println("Inside Before");
//            this.fileExtensionTest= new FileExtensionTest();
//        }
//
//        @After
//        public void tearDown() {
//            //This method runs,after running all the testcases
//            //This method is used to clear the initialized variables
//            System.out.println("Inside After");
//            fileExtensionTest = null;
//        }
//      public void givenAFolderShouldReturnAllItsFiles() {
//              FileExtensionTest fileExtensionTest= new FileExtensionTest();
//              //Input given as folder
//              String actualResult= fileExtensionTest.fileExtensionTest("home");
//              //Expected files of that particular folder
//              assertEquals("src, idea, iml",actualResult);
//          }
//          @Test
//          public void givenAExtensionShouldReturnAFileWithSameExtension(){
//              FileExtensionTest fileExtensionTest= new FileExtensionTest();
//              //Input given as file extension
//              String actualResult= fileExtensionTest.fileExtensionTest(".iml");
//              //Expected files with .iml extension
//              assertEquals("file.iml",actualResult);
//          }
//          @Test
//          public void givenAFileWithExtensionShouldReturnContentsOfThatFile() {
//              FileExtensionTest fileExtensionTest = new FileExtensionTest();
//              //Input given is a file name with extension(for ex:ipl.csv)
//              String actualResult = fileExtensionTest.fileExtensionTest("file.iml");
//              //Expected content of the file
//              assertEquals("abcdef", actualResult);
//          }
//     }
//
//
//
//
//}