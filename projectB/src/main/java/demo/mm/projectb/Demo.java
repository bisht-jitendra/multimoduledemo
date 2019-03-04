package demo.mm.projectb;

import demo.mm.projecta.tools.ConsoleLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Demo
{

    public static void main(String[] args) throws IOException
    {
        ConsoleLogger logger = new ConsoleLogger();
        URL content = Demo.class.getClassLoader().getResource("scripts/content.bat");
        logger.log("Reading content from resource starts here -------");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(content.openStream())))
        {
            logger.log(reader.readLine());
        }
        logger.log("Reading content from resource ends here -------");
    }
}
