package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер ключа доступа (pro/exp): ");
        String key = scanner.nextLine();

        DocumentWorker documentWorker;
        // предложено ввести номер ключа доступа: pro или exp
        if (key.equalsIgnoreCase("pro")){
            documentWorker = new ProDocumentWorker();
        } else if (key.equalsIgnoreCase("exp")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker= new DocumentWorker();
        }
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
