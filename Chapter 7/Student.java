import java.util.*;
public class Student
{
    private String firstName, lastName;
    int average;
    private Test score1, score2, score3;
    
    
    public Student(String first, String last, int trial1, int trial2, int trial3)
    {
        firstName = first;
        lastName = last;
        score1 = new Test(trial1);
        score2 = new Test(trial2);
        score3 = new Test(trial3);
    }
    public Student(String first, String last)
    {
        firstName = first;
        lastName = last;
        score1.setScore(0);
        score2.setScore(0);
        score3.setScore(0);
    }
    
    public void setTestScore(int testNum, int score)
    {
        int grade = score;
        if(testNum == 1)
        {
            score1.setScore(grade);
        }
        if(testNum == 2)
        {
            score2.setScore(grade);
        }
        if(testNum == 3)
        {
            score3.setScore(grade);
        }
    }
    public int average()
    {
        average = score1.getTestScore() + score2.getTestScore() + score3.getTestScore();
        return average;
        
    }
    public String toString()
    {
        String result;
        
        result = firstName + " " + lastName + "\n";
        result += "First test score: " + score1.getTestScore() + "\n";
        result += "Second test score: " + score2.getTestScore() + "\n";
        result += "Third test score: " + score3.getTestScore() + "\n";
        result += "Average: " + average;
        
        return result;
    }
}