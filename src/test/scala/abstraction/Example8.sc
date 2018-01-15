// Abstract types

// problem
/*
class Food
abstract class Animal {
  def eat(food: Food)
}

class Grass extends Food
class Cow extends Animal {
  override def eat(food: Grass): Unit = {}
}*/

// solution
class Food
abstract class Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  override def eat(food: Grass): Unit = {}
}

class Fish extends Food

val grass = new Grass
val fish = new Fish

val bessy: Animal = new Cow
//bessy.eat(new Fish)
//bessy.eat(new Grass)

// path dependents
bessy.eat(new bessy.SuitableFood)

class DogFood extends Food
class Dog extends Animal {
  override type SuitableFood = DogFood
  override def eat(food: DogFood): Unit = {}
}

// path independent
