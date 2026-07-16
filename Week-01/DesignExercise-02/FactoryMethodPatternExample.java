public class FactoryMethodPatternExample {

    // Common interface for every document type
    interface Document {
        void open();
    }

    // Concrete document classes
    static class WordDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening a Word document.");
        }
    }

    static class PdfDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening a PDF document.");
        }
    }

    static class ExcelDocument implements Document {
        @Override
        public void open() {
            System.out.println("Opening an Excel document.");
        }
    }

    // Abstract factory
    static abstract class DocumentFactory {
        public abstract Document createDocument();
    }

    // Concrete factory for Word documents
    static class WordDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            return new WordDocument();
        }
    }

    // Concrete factory for PDF documents
    static class PdfDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    // Concrete factory for Excel documents
    static class ExcelDocumentFactory extends DocumentFactory {
        @Override
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    // Test the Factory Method Pattern
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
    }
}