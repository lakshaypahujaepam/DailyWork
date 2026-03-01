package com.lakshay.documentExporter;

public class ExporterFactory {

//    private String type;
//
//    ExporterFactory() {
//        if(type == null || type.isEmpty() || type.isBlank()) {
//            throw new IllegalArgumentException("invalid type.");
//        }
//        this.type = type;
//    }

    public DocumentExporter getExporter(String type) {
        if(type.equalsIgnoreCase("pdf")) {
            return new PDFExporter();
        } else if(type.equalsIgnoreCase("html")) {
            return new HTMLExporter();
        } else if(type.equalsIgnoreCase("word")) {
            return new WordExporter();
        } else {
            return null;
        }
    }
}
