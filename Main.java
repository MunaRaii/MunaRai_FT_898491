
    public class Main {
        public static void main(String[] args) {
            Move move = new Move(2);

            Box box1 = new Box(1);
            box1.addItem(new SingleObject("scissors"));

            Box box2 = new Box(2);
            box2.addItem(new SingleObject("book"));

            Box box3 = new Box(3);
            box3.addItem(new SingleObject("compass"));
            Box box4 = new Box(4);
            box4.addItem(new SingleObject("scarf"));
            box3.addItem(box4);

            Box box5 = new Box(5);
            box5.addItem(box1);
            box5.addItem(box2);
            box5.addItem(box3);

            Box box6 = new Box(6);
            box6.addItem(new SingleObject("pencils"));
            box6.addItem(new SingleObject("pens"));
            box6.addItem(new SingleObject("rubber"));

            move.addItem(box5);
            move.addItem(box6);

            move.print();

            System.out.println("The scarf is in the cardboard number " + move.find("scarf"));
        }
    }

