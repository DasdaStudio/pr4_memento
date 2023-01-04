public class MementoPatternDemo {

    public static void main(String[] args){
        Character player = new Character("Dasda", "Druid");

        Stats tmp = Stats.generate();
        player.setAttributes(tmp);
        player.printSheet();

        CareTaker careTaker = new CareTaker();
        Memento mem = new Memento(tmp);

        mem.setState(tmp);
        careTaker.add(mem.getState());

        tmp = Stats.generate();
        tmp.print();
        mem.setState(tmp);
        careTaker.add(mem.getState());

        mem.setState(careTaker.get(0));
        tmp = mem.getState();
        tmp.print();
    }
}
