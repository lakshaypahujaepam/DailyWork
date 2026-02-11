package org.example;

public class PizzaBuilder {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    public enum CrustType {
        THIN, THICK, CHEEZE_BURST
    }

    private final Size size;
    private final CrustType crustType;
    private final boolean extracheeze;
    private final boolean mushroom;
    private final boolean olives;

    private PizzaBuilder(Builder builder) {
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.extracheeze = builder.extracheeze;
        this.mushroom = builder.mushroom;
        this.olives = builder.olives;
    }

    public static class Builder {
        private Size size;
        private CrustType crustType;
        private boolean extracheeze;
        private boolean mushroom;
        private boolean olives;

        public Builder(Size size, CrustType crustType) {
            this.size = size;
            this.crustType = crustType;
        }

        public Builder extracheeze(boolean extracheeze) {
            this.extracheeze = extracheeze;
            return this;
        }

        public Builder mushroom(boolean mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public Builder olives(boolean olives) {
            this.olives = olives;
            return this;
        }

//        public Builder size(Size size) {
//            this.size = size;
//            return this;
//        }
//
//        public Builder crustType(CrustType crustType) {
//            this.crustType = crustType;
//            return this;
//        }

        public PizzaBuilder build() {
            return new PizzaBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "PizzaBuilder{" +
                "size=" + size +
                ", crustType=" + crustType +
                ", extracheeze=" + extracheeze +
                ", mushroom=" + mushroom +
                ", olives=" + olives +
                '}';
    }
}
