public class MultipleChoice extends TestQuestion
{
    public String[] answers;
    public String character, question;
    protected void readQuestion(String type, int lines, String quest)
    {
        character = type;
        question = quest;
        
    }
    public void addChoices(String[] list)
    {
        answers = list;
    }
    public String toString()
    {
        String result = question + "\n";
        for(int choice = 0; choice < answers.length; choice++)
            result += answers[choice] + "\n";
        return result;
    }
}