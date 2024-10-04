package Map;

import java.util.Arrays;

public interface Mappable {
    void render();
    static double[] stringToLatLang(String location){
        var s= location.split(",");
        double lat= Double.valueOf(s[0]);
        double lang= Double.valueOf(s[1]);
        return new double[]{lat,lang};
    }
}

abstract class Point implements Mappable{
    private double[] location= new double[2];

    public Point(String location){
        this.location= Mappable.stringToLatLang(location);
    }

    @Override
    public void render() {
        System.out.println("Render "+this+" as Point ("+locationPrint()+")");
    }

    private String locationPrint(){
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable{
    private double[][] locations;
    public Line(String... locations){
        this.locations= new double[locations.length][];
        int index=0;
        for (String l:locations){
            this.locations[index++]=Mappable.stringToLatLang(l);
        }
    }
    @Override
    public void render() {
        System.out.println("Render "+this+" as  LINE ("+locationPrint()+")");
    }
    private String locationPrint(){
        return Arrays.deepToString(locations);
    }
}

