class Animal {

    constructor(name,weight){
        this.name = name;
        this.weight = weight;
        //this.#food = "Plant Based Food";
        if (this.constructor == Animal) {
            throw new Error("Animal class is Abstract class, cannot be created");
        }
    }

    //#intenralOperations() {
    //
    //};

    eat(){
        console.log(`${this.name} is eating`);
    }

    sleep(){
        console.log(`${this.name} is sleeping`);
    }

}

class Horse extends Animal {
    constructor(name,weight,height){
        super(name,weight);
        this.height = height;
    }

    run(){
        console.log("My Horse is running");
    }
}

let hrse = new Horse("Tommy",150,6);
hrse.eat();
hrse.run();

//let animal = new Animal("Tiger",200);
//animal.eat();


