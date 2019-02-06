//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package lab03_maps;

public class Part implements Comparable<Part> {
    private String part, serial, car;
    private int year;

    public Part(String line) {
        String[] list = line.split(" ");
        if (list.length == 6)
            part = list[0] + " " + list[1];
        else
            part = list[0];
        year = Integer.parseInt(list[list.length - 1]);
        car = list[list.length - 3] + " " + list[list.length - 2];
        serial = list[list.length - 4];


    }

    //have to have compareTo if implements Comparable
    public int compareTo(Part rhs) {
        if (car.compareTo(rhs.car) == 0 && year - rhs.year == 0)
            return part.compareTo(rhs.part);
        else if (car.compareTo(rhs.car) == 0) {
            return year - rhs.year;
        }
        return car.compareTo(rhs.car);
    }

    public String toString() {
        return car + " " + year + " " + part + " " + serial;
    }
}