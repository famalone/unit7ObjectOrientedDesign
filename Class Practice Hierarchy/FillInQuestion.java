
public class FillInQuestion extends Question
{
    // specified question: "The inventor of Java was _James Gosling_."
    //parse the specified question into a question to display and an answer to check:
    //questionb: "The inventor of Java was _____."
    //answer: "james Gosling"
    
    public FillInQuestion()
    {
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String Question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(question);
    }
}
