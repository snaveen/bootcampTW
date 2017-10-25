class Point{
    int x;
    int y;
        }

public class Line {
    Point start;
    Point end;
    Line(Point start,Point end){
        this.start=start;
        this.end=end;
    }

    private Double getLength(){
        return Math.sqrt(Math.pow((start.x-end.x),2)-Math.pow((start.y-end.y),2));
    }
}
