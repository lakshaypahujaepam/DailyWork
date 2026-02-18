package org.example;

public class Laptop {

    private final String brand;
    private final String processor;
    private final Integer ram;
    private final int storage;
    private final String graphicsCard;
    private final boolean touchScreen;
    private final boolean backlitKeyboard;
    private final String operatingSystem;

    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.touchScreen = builder.touchScreen;
        this.backlitKeyboard = builder.backlitKeyboard;
        this.operatingSystem = builder.operatingSystem;
    }

    public static class LaptopBuilder {
//        mandatory
        private final String brand;
        private final String processor;
        private final Integer ram;
//        optional
        private int storage;
        private String graphicsCard;
        private boolean touchScreen;
        private boolean backlitKeyboard;
        private String operatingSystem;

        public LaptopBuilder(String brand, String processor, Integer ram) {
            this.brand = brand;
            this.processor = processor;
            this.ram = ram;
        }

        public LaptopBuilder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public LaptopBuilder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public LaptopBuilder touchScreen(boolean touchScreen) {
            this.touchScreen = touchScreen;
            return this;
        }

        public LaptopBuilder backlitKeyboard(boolean backlitKeyboard) {
            this.backlitKeyboard = backlitKeyboard;
            return this;
        }

        public LaptopBuilder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Laptop build() {
            if (ram < 4) {
                throw new IllegalArgumentException("RAM must be at least 4GB");
            }

            if (storage != 0 && storage < 128) {
                throw new IllegalArgumentException("Storage must be at least 128GB");
            }

            if (graphicsCard != null && ram < 16) {
                throw new IllegalArgumentException("Gaming laptop must have at least 16GB RAM");
            }
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "LaptopBuilder{" +
                "brand='" + brand + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", touchScreen=" + touchScreen +
                ", backlitKeyboard=" + backlitKeyboard +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
