class Car{
    constructor(gas,num){
        this.gas=gas;
        this.num=num;
    }

    getNumGas(){
        console.log(`ガソリンは${this.gas}です。ナンバーは${this.num}です。`);
    }
}

let vitz = new Car('regular',1234);
vitz.getNumGas();