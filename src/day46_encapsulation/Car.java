package day46_encapsulation;

public class Car {
    //隐藏一些DATA的方法 ！ ！ ！ 保密一些数据
    private String model;
    private int year;
    private int mileage;

    // setter method for model
    public void setModel(String carModel){
        model =carModel;
    }
    //getter method for model

    public String getModel() {
        return model;
    }

    // setter for year
    public void setYear(int year){
        this.year = year;          // this 的意思就是这个class里的
    }
    // getter for year

    public int getYear(){
        return year;

    }
    //getter setter for mileage
    //generate toString
    public int getMileage(){
        return mileage;   // this.mileage; also works fine
    }

    public void setMileage(int mileage){
        this.mileage =mileage;   // 一样的名字就要用this

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }



}
