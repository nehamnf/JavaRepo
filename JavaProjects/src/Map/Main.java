package Map;

public class Main {
    public static void main(String[] args) {

        Park[] usNationalParks=new Park[]{
                new Park("Yellowstone","44.123,45,1234"),
                new Park("ChildrenPark","48.123,49,1234"),
                new Park("ZPark","49.123,49,1234")
        };

        Layer<Park> parkLayer= new Layer<>(usNationalParks);
        System.out.println(usNationalParks[0]);
        parkLayer.renderLayer();

        River[] riverPoint= new River[]{
                new River("Yamuna River","60.123,61,1234","62.123,63,1234"),
                new River("Gangs River",new String[]{"70.123,71,1234","72.123,73,1234"})
        };

        River a= new River("Yamuna River","60.123,61,1234","62.123,63,1234");


        Layer<River> riverLayer= new Layer<>(riverPoint);

        riverLayer.renderLayer();
    }
}