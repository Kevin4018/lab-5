package example;

import java.io.IOException;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     * @param args unused arguments
     */
    public static void main(String[] args) {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp?username=dma40";
        String response = "";

        try {
            response = example.run(gradeAPISignUpURL);
        }

        catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

        System.out.println(response);
    }
}
