package GoogleDocsLLD;

import java.util.ArrayList;

import GoogleDocsLLD.DocumentElements.DocumentElement;

public class Document {
    private ArrayList<DocumentElement> list = new ArrayList<>();

    public void addDocument(DocumentElement element) {
        list.add(element);
    }


    public void removeDocument(DocumentElement element){
        list.remove(element);
    }

    public void render() {
        for(DocumentElement e : list){
            e.render();
        }
    }
}