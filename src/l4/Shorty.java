package l4;

class Shorty extends Human {
    Shorty(String name, HumanState st, Position position) {
        super(name, st, position);

        Information qwe = () -> System.out.println(" Новый коротышка " + Shorty.super.getName() + ". " + Shorty.super.getPosition().toString());

        qwe.showInf();
    }

    public void feed(Shorty whom) {
        System.out.println(this.toString() + " покормил " + whom.getName());
    }

    public void hide() {
        switch (this.getState()) {
            case FEAR:
                System.out.println(this.getName() + " спрятался в доме и выглядывает в окно");
                break;
            case NOFEARLESS:
                System.out.println(this.getName() + " остался на дороге");
                break;
        }
    }

    public String toString() {
        return "Коротышка " + this.getName();
    }
}
