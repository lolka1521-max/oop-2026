import oop.labor07.Auto;
import oop.labor07.Jarmu;
import oop.labor07.JarmuPark;

void main() {
    JarmuPark jarmu = new JarmuPark("jarmuvek.csv");

    jarmu.ujJarmu(new Auto("AAA111","BMW",5));

    System.out.println("*************** A Jarmuvek kiirasa ***********************");
    System.out.println(jarmu);

    System.out.println("*************** A keresett Rendszam AAA111 ***********************");
    System.out.println(jarmu.jarmuKeres("aaaaaa"));
}