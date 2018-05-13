package l4;

class Shorty extends Human {
    Shorty(String name, HumanState st, Position position) {
        super(name, st, position);

        Information qwe = () -> System.out.println(" Новый коротышка " + Shorty.super.getName() + ". " + Shorty.super.getPosition().toString());

        qwe.showInf();
    }

    public String feed(Shorty whom) {
        return(this.toString() + " покормил " + whom.getName());
    }

    public String hide() {
        switch (this.getState()) {
            case FEAR:
                return(this.getName() + " спрятался в доме и выглядывает в окно");
            case NOFEARLESS:
                return(this.getName() + " остался на дороге");
        }
        return "";
    }

    public String toString() {
        return "Коротышка " + this.getName();
    }
}
