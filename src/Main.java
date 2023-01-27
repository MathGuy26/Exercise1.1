import java.net.*;
import java.io.*;
class DownloadFileFromUrl {
    public static void main(String[] args){ // entry point to main program, exception is an unreachable URL
        try {
            URL data = new URL("https://gist.githubusercontent.com/Thiamath/b84075e5b1c6be151b444e14b4a88be6/raw/dc67a96c38722523574134acf24848f3f6a1c40f/lipsum.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(data.openStream()));

            String inputWord;
            while((inputWord = in.readLine()) != null) {
                System.out.println(inputWord);
            }
            in.close();

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }


    }


}