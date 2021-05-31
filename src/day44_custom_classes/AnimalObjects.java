package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.type); // 把Animal课的String 用在这节课
        animal.eat();
        animal.eat("grass");
        animal.speak();
        //create object cheetahObj
        Animal cheetahObj =new Animal();
        cheetahObj.type = "cheetah" ; // 改变变量的内容
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
