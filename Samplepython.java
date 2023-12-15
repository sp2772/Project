import java.util.List;
import java.io.*;
public class Samplepython {
    public static void main(String[] args)  throws IOException, InterruptedException{

        /*Process process = new ProcessBuilder("java", "-version").start();
    
        System.out.print("is process alive = " + process.isAlive());
        List<String> results = readOutput(process.getInputStream());
        System.out.println("results = " + results);*/
        ProcessBuilder   ps=new ProcessBuilder("python","sampleexceute.py");
        ps.redirectErrorStream(true);
        Process pr = ps.start();  

        BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line;
        int i=0;
        while ((line= in.readLine()) != null) {
            System.out.print(i);
            System.out.println(line);
            i++;
        }
        pr.waitFor();
        System.out.println("ok!");

        in.close();
        
    }
}
