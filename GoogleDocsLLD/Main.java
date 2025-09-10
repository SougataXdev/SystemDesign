package GoogleDocsLLD;

import GoogleDocsLLD.Persistance.SaveToDb;
import GoogleDocsLLD.Persistance.SaveToFile;

public class Main {
    public static void main(String[] args) {
    Document doc = new Document();
    DocumentEditor editor = new DocumentEditor(doc, new SaveToDb());

    editor.addText("Hello World");
    editor.addImg("image.png");

    editor.renderDocument();
    editor.save(); 
    editor.setPersistance(new SaveToFile());
    editor.save(); 
        
    }
}
