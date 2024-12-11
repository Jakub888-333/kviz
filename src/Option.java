public class Option {

    private String numberOfOptionByLetter;
    private String textOfOption;


    public Option(String numberOfOptionByLetter, String textOfOption) {
        this.numberOfOptionByLetter = numberOfOptionByLetter;
        this.textOfOption = textOfOption;
    }

    public void printOptions(){
        System.out.println(numberOfOptionByLetter + "." + textOfOption);
    }
}
