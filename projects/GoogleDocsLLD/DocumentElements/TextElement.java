package projects.GoogleDocsLLD.DocumentElements;

public class TextElement extends DocumentElement {
    private String content;

    public TextElement(String content){
        this.content = content;
    }

    @Override
    public void render(){
        System.out.println("Text: " + content);
    }
}
