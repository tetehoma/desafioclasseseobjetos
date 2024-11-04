//criacao da classe

class heroModel {
    constructor(name, age, type) {

        this.name = name
        this.age = age
        this.type = type
    }

    goAtack(){
        if (this.type == "guerreiro") {
             console.log ("o " + this.type + " atacou usando espada")
        } else if (this.type == "mago"){
            console.log ("o " + this.type + " atacou usando magia")
        }else if (this.type == "monge"){
            console.log ("o " + this.type + " atacou usando artes marciais")
        } else {
            console.log ("o " + this.type + " atacou usando shuriken")
        }
    }
}

let hero = new heroModel("Carlos", 28, "mago")
hero.goAtack()

let hero1 = new heroModel("Joao", 16, "guerreiro")
hero1.goAtack()