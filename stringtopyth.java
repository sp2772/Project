import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
class stringtopyth{



public static void main(String[] args) throws IOException, InterruptedException
{
/*ProcessBuilder   ps=new ProcessBuilder("python","texttosp.py");
        ps.redirectErrorStream(true);
        Process p = ps.start();  

BufferedWriter out = new BufferedWriter(new
        OutputStreamWriter(p.getOutputStream()));
BufferedReader stdInput = new BufferedReader(new
        InputStreamReader(p.getInputStream()));

System.out.println("Output:");
String s = null;
out.write("testdata");
while ((s = stdInput.readLine()) != null) {
    System.out.println(s); */
    String h= java.time.LocalTime.now().toString();
     System.out.println(h);
}
}
