package page;

/**
 * Created by linhtran on 16/07/17.
 */
public class Page {
    public int  start =1;
    public  int end=1;

    @Override
    public String toString() {
        return "Page{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
