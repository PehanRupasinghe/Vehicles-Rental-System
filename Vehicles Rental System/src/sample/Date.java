package sample;

public class Date  {

    private int Day;
    private int Month;
    private int Year;
    private String Date;



    public Date(){}

    public Date(int Day, int Month, int Year){
        this.Day = Day;
        this.Month= Month;
        this.Year= Year;

    }

    public void setDay(int Day){
        this.Day = Day;

    }
    public int getDay(){
        return Day;
    }


    public void setMonth( int Month){
        this.Month = Month;
    }

    public int getMonth(){
        return Month;
    }

    public void setYear( int Year){
        this.Year = Year;
    }

    public int getYear(){
        return Year;
    }


    public void setDate(int Day,int Month,int Year) {
        this.Date = Day + "/" + Month + "/" + Year;
    }

    public String getDate() {
        return this.Date;
    }

    public String toString() {
        return "Date : " + getDate();
    }
}