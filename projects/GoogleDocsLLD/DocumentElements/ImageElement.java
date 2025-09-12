package projects.GoogleDocsLLD.DocumentElements;

public class ImageElement extends DocumentElement {
    private String filepath;

    public ImageElement(String filepath){
        this.filepath = filepath;
    }

    @Override
    public void render(){
        System.out.println("Image: " + filepath);
    }
}
