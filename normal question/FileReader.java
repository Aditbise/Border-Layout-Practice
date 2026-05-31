import java.io.*;
import java.net.URL;

public class FileReader
{
    
    public FileReader()
    {
        
    }

    public void showFile(String fileName)
        throws IOException
    {
        InputStream fstream = openFile(fileName);

        BufferedReader in = new BufferedReader(new InputStreamReader(fstream));

        System.out.println("File: " + fileName);
        String line = in.readLine();
        while(line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        System.out.println("<end of file>");
    }

    public void checkedShowFile(String fileName)
    {
        try {
            showFile(fileName);
        }
        catch(IOException exc) {
            System.out.println("There was a problem showing this file.");
            System.out.println("The error encountered is:");
            System.out.println(exc);
        }
    }

    public InputStream openFile(String fileName)
        throws IOException
    {
        if(fileName == null)
            throw new IOException("Cannot open file - filename was null.");
        URL url = getClass().getClassLoader().getResource(fileName);
        if(url == null)
            throw new IOException("File not found: " + fileName);
        return url.openStream();
    }
}


