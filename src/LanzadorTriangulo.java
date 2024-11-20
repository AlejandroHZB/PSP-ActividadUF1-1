import java.io.File;
import java.io.IOException;

public class LanzadorTriangulo {
    public static void main(String[] args) {

        int num5 = 5;
        int num7 = 7;
        int num9 = 9;

        String classpath = System.getProperty("java.class.path");

        ProcessBuilder proceso5 = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(num5));
        ProcessBuilder proceso7 = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(num7));
        ProcessBuilder proceso9 = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(num9));

        proceso5.redirectOutput(new File("triangulo5.txt"));
        proceso7.redirectOutput(new File("triangulo7.txt"));
        proceso9.redirectOutput(new File("triangulo9.txt"));


        try {
            proceso5.start().waitFor();
            proceso7.start().waitFor();
            proceso9.start().waitFor();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
