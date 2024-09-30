/*
Edwin Zeng
This program will calculate the area and perimeter of a room 
*/
public class areaPerimeter{
    public static void main(String[] args){
        String room_name = "dining room";
        float length = 5.5f, width = 6.1f;
        float area = length*width;
        float perimeter = 2*(length+width);
        System.out.println("The area of " + room_name + " is " + area + "m^2");
        System.out.println("The perimeter of the " + room_name + " is " + perimeter + "m");
    }
}
