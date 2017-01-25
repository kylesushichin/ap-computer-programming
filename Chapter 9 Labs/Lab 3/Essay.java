public class Essay extends TestQuestion
{
    public String answerSpace;
    String character, question;
    int numLines;
    protected void readQuestion(String type, int lines, String quest)
    {
        character = type;
        question = quest;
        numLines = lines;
    }
    public String toString()
    {
        String result = question + "\n";
        for(int i = numLines; i > 0; i--)
            result += "\n";
        return result;
    }
}