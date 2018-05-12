public enum HumanState {
    FEAR {
        @Override
        public void reaction() {
            System.out.println("ААА, это стоголовый дракон!");
        }
    },
    NOFEARLESS {
        @Override
        public void reaction() {
            System.out.println("Это не дракон!");
        }
    },
    NORMAL {
        @Override
        public void reaction() {
            System.out.println("-_-");
        }
    };

    abstract public void reaction();
}