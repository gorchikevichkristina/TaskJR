public class Classes { //публичный класс может быть только один

}

class fud {

}

class cat {

}

//не можем наследовать этот класс
//для библиотек
//используется очень редко, что бы никто не переопределял метод и не ломал код
final class MyFinalClass {
    void someLogin(){

    }

}

//не можем создать экземпляр этого класса
//описывают поведение, по типу интерфейсов

class ExsampleClass{
    void method(){
        Car car = new Ferrary();
        car.Run();
        car.Stop();
    }
}
abstract class Car {
    int speed;

    abstract void Run();//без тела, не знаем как он работает

    void Stop() {
        speed = 0;

    }

}

class Ferrary extends Car {
    @Override
    void Run() {
        speed = 25;
    }
}

//для работы с деньгами, но есть классы более точные
strictfp class moon3 {
    void method(float f) {
        f = 0.23f;
    }
}