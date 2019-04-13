public class PolylinjeTest {

    public static void main(String [] args){

        Punkt p1 = new Punkt("A", 1, 3);
        Punkt p2 = new Punkt("B", 2, 1);
        Punkt p3 = new Punkt("C", 3, 4);
        Punkt p4 = new Punkt("D", 5, -1);
        Punkt p5 = new Punkt("E", 6, 2);

        Punkt[] PL1 = {p1, p2, p3};
        Polylinje pLinje = new Polylinje(PL1);

        System.out.println(pLinje);

        pLinje.setBredd(2);
        pLinje.setFarg("blå");

        System.out.println(pLinje.getBredd());
        System.out.println(pLinje.getFarg());

        pLinje.laggTill(p4);
        pLinje.laggTillFramfor(p5, "C");
        pLinje.taBort("B");

        Polylinje pL2 = new Polylinje(pLinje.getHorn());
        System.out.println(pL2);
        System.out.println(pLinje);

    }
}
