import java.io.*;

class readfile {
    public static void main(String args[]) {
        try (FileInputStream ifile = new FileInputStream("first.txt")) {
            int fileread;
            while ((fileread = ifile.read()) != -1) {
                System.out.print((char) fileread);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

