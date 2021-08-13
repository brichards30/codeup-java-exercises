package file_io;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IOLecture {

    //This is writing to JS file
//    public static void main(String[] args) throws IOException {
//
////        String directory = "data"; //relative path, /data absolute path
////        String filename = "info.txt";
//
//        //String directory = "src/file_io"; //relative path, /data absolute path
////        String filename = "hello.sh";
//
//        String directory = "js"; //relative path, /data absolute path
//        String filename = "madeByJava.js";
//
//
//        //When writing multiline content, use collection to hold each lne
//
//        ArrayList<String> fileContents = new ArrayList<String>();
//
//        /*
//        Each string that we add to the fileContents will represent a line to write on the file
//         */
//        fileContents.add("const message = \"Hello World\"");
//        fileContents.add("// written by the java file system");
//
//
////        fileContents.add("Hello from");
////        fileContents.add("JAVA FILE IO");
//
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//
//        //Check if a dir exists
//        if (Files.notExists(dataDirectory)) {
//            // if dir does not exist, we will create it
//            Files.createDirectories(dataDirectory);
//        }
//
//        // checking if file exists
//        if (! Files.exists(dataFile)) {
//
//            //if file doesn't exist , we will create it
//            Files.createFile(dataFile);
//        }
//
//        //this will write contents to the file
//        Files.write(dataFile, fileContents);
//
//        //how to read a file's contents
//        //Collection<String> contentsReadFromFile = Files.readAllLines(dataFile);
//        List<String> contentsReadFromFile = Files.readAllLines(dataFile);
//
//    }

    public static void main(String[] args) throws IOException {

        String directory = "src/file_io"; //relative path, /data absolute path
        String filename = "hello.sh";


        //When writing multiline content, use collection to hold each lne

        ArrayList<String> fileContents = new ArrayList<String>();

        /*
        Each string that we add to the fileContents will represent a line to write on the file
         */
        fileContents.add("say hello Polaris");


        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);


        //Check if a dir exists
        if (Files.notExists(dataDirectory)) {
            // if dir does not exist, we will create it
            Files.createDirectories(dataDirectory);
        }

        // checking if file exists
        if (!Files.exists(dataFile)) {

            //if file doesn't exist , we will create it
            Files.createFile(dataFile);
        }

        //this will write contents to the file
        Files.write(dataFile, fileContents, StandardOpenOption.APPEND);

        //how to read a file's contents
        //Collection<String> contentsReadFromFile = Files.readAllLines(dataFile);
        List<String> contentsReadFromFile = Files.readAllLines(dataFile);


        for (String line : contentsReadFromFile) {
            System.out.println(line);
        }
    }
}

