/* Create a clss named Rectangle with 2 data members 'length' & 'breadth'
 * & 2 methods to print area & perimeter.
 * Let class Square inherit Rectangle
 * Print the area & perimeter of a rectangle & square 
 */
class Rectangle
{
    int length,breadth;
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;   //Initialising the global variables
    }
    public int area()
    {
        return length*breadth;  //Calculating area of a general rectangle
    }
    public int perimeter()
    {
        return 2*(length+breadth);//Calculating perimeter of a general rectangle
    }
}