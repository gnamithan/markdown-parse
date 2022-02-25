import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


//javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
//java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
public class MarkdownParseTest {
    @Test
    public void addition() throws IOException {
        // assertEquals(2, 1 + 1);

        //String contentsTest = Files.readString(Path.of("test-file.md"));
        //String contentsTest1 = Files.readString(Path.of("test1.md"));
        //String contentsTest2 = Files.readString(Path.of("test2.md"));
        String contentsTest3 = Files.readString(Path.of("test3.md"));

       // assertEquals(List.of("https://something.com", "some-page.html"), 
            //MarkdownParse.getLinks(contentsTest));
        //assertEquals(List.of("https://something.com"), 
            //MarkdownParse.getLinks(contentsTest1));
        //assertEquals(List.of("someLink.html"), 
            //MarkdownParse.getLinks(contentsTest2));
       // assertEquals(List.of("someLink.html"), 
           // MarkdownParse.getLinks(contentsTest3));
        //assertEquals(List.of("[a link](url.com)", "another link`", "cod[e" , "code]"), 
            //MarkdownParse.getLinks(contentsTest1));
        //assertEquals(List.of("[a nested link](b.com)", "a nested parenthesized url", "some escaped [ brackets ]"), 
            //MarkdownParse.getLinks(contentsTest2));
        assertEquals(List.of("[this title text is really long and takes up more than one line", 
                    "and has some line breaks]( https://www.twitter.com )",
                     "this title text is really long and takes up more than one line",
                     "[this link doesn't have a closing parenthesis](github.com",
                     "And there's still some more text after that.",
                     "[this link doesn't have a closing parenthesis for a while](https://cse.ucsd.edu/",
                      ")",
                     "And then there's more text"), 
            MarkdownParse.getLinks(contentsTest3));
    }
}