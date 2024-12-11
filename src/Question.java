import java.util.ArrayList;
import java.util.List;

public class Question {

    private String question;
    private int numberOfQuestion;
    private String singleMultipleAnswer;
    private List<Option> options;

    Question(int numberOfQuestion, String question,String singleMultipleAnswer){
        this.question = question;
        this.numberOfQuestion = numberOfQuestion;
        this.singleMultipleAnswer = singleMultipleAnswer;
        this.options = new ArrayList<>();
    }

    public void addOption(Option option){
        options.add(option);
    }

    public void printQuestion(){
        System.out.println(numberOfQuestion + "." + question + " (" + singleMultipleAnswer + ")");

        for(Option option: options){
            option.printOptions();
        }
    }

}
