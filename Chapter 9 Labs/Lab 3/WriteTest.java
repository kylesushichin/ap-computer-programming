import java.util.*;
public class WriteTest
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        TestQuestion[] quiz;
        int questNum, number = 0, lines;
        String type, question;
        System.out.print("How many questions will you have on the test?: ");
        questNum = input.nextInt();
        quiz = new TestQuestion[questNum];
        
        while(number < questNum)
        {
            System.out.print("\n What type of question essay or multiple choice [e/m]: ");
            type = input.next();
            
            if(type.equals("e"))
            {
                System.out.print("\nHow many lines would you like to provide?: ");
                lines = input.nextInt();
                
                System.out.print("\nEnter the question: ");
                question = input.nextLine();
                quesiton = input.nextLine();
                
                Essay Ques = new Essay();
                ques.readQuestion(type, lines, question);
                quiz[number] = ques;
            }
            if(type.equals("m"))
            {
                System.out.print("\nHow many choices would you like to provide?: ");
                lines = input.nextInt();
                String[] choices = new String[lines];
                
                System.out.print("\nEnter the question: ");
                question = input.nextLine();
                quesiton = input.nextLine();
                
                System.out.print("\nEnter the choices one per line: ");
                for(int i = 0; i < lines; i++)
                {
                    choices[i] = input.nextLine();
                }
                MultipleChoice Ques = new MultipleChoice();
                Ques.readQuestions(type, lines, question);
                Ques.addChoices(choices);
                quiz[number] = Ques;
            }
            number++;
        }
        for(int p = 0; p < quiz.length; p++)
            System.out.println(quiz[p].toString());
    }
}