import java.net.*;
import java.io.*;
class DownloadFileFromUrl {
    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("Usage: Java DownloadFileFromUrl <URL> <inputWord>");
            return;
        }
        String url = args[0];
        String inputWord = args[1];
        try {
            URL data = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(data.openStream()));
            String inputLine;
            int wordCount = 0;
            while((inputLine = in.readLine()) != null) {
                String[] wordsInLine = inputLine.split(" ");
                for (String word : wordsInLine) {
                    if(word.equalsIgnoreCase(inputWord)) {
                        wordCount++;
                    }
                }
            }
            in.close();
            System.out.println("The word " + inputWord + " appears " + wordCount + " time in the file. ");

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument, please provide a string value as the word to search");
        }


    }


}