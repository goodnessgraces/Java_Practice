public class MoreVariables {
	public static void main (String[] args){
		String name, eyes, teeth, hair;
        int age, height, weight;
        float height2, weight2;

        name = "Zed A. Shaw";
        age = 35;     // not a lie
        height = 74;  // inches
        height2 = height * 2.54f; // cm
        
        weight = 180; // bs
        weight2 = weight *.453592f;
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + height + " inches tall." );
        System.out.println( "He's " + weight + " pounds heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
System.out.println("In kilos, the weight is "+ weight2 + " , and in cm, the height is "+ height2 + " .");
        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + age + ", " + height + ", and " + weight
            + " I get " + (age + height + weight) + "." );

	}
}