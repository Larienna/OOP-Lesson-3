package Task4;

public class DocumentWorker {
    void openDocument(){
        System.out.println("Документ открыт");
    }
    void editDocument() {
        System.out.println("Правка документа доступна в версии О");
    }
    void saveDocument() {
        System.out.println("Сохранение документа доступно в версии О");
    }
}
class ProDocumentWorker extends DocumentWorker{
    @Override
    void editDocument(){
        System.out.println("Документ отредактирован");
    }
    @Override
    void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в других форматах доступно в версии Эксперт");
    }
}
class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument() {
        super.saveDocument();
    }
}
