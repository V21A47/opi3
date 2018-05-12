package l4;

public enum Fruit  {
    APPLE {
        public String lang() {
            return "Большое краснобокое яблоко";
        }
    },
    PEAR {
        public String lang() {
            return "Спелая груша";
        }
    },
    PLUMS {
        public String lang() {
            return "Полдесятка слив";
        }
    };

    abstract String lang();
}
