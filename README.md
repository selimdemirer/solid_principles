![1713642993887](https://github.com/selimdemirer/solid_principles/assets/125173819/f1c34ec8-7561-4453-8300-41d95613b35e)
![Adsız](https://github.com/selimdemirer/solid_principles/assets/125173819/d7dea242-5cd9-4c22-8823-9c1785b223bf)

- SOLID

- SRP: The Single Responsibility Principle:
	* A class should have one, and only one, reason to change.
	* Controller -> Manager(Validation) -> Security -> Service(CRUD) -> Repository(Database)

- OCP: The Open/Closed Principle
	* A class/module should be open for extension, but closed for modification
	* Means we should be able to change the behavior of a module, without changing the module.
	* If you implement it successfully, you should be able add a new feature to the application by writing a new code, and not changing any old code.
	* Shape and draw example, DrawAllShapes is the high level policy and doesn't know about the other shapes, which are the low level policies
	* Calculator -> Operation example

- LSP: The Liskov's Substitution Principle
	* Derived classes must be usable through the base class/interface, without the need for the user to know the difference.
	* Rectangle, Square example
	* Yes, a square is a rectangle, but the class rectangle is not a rectangle and the class square is not a square.
	* Class rectangle represents a rectangle, and class square represents a square.
	* But the representatives of things, do not share the relationships of the things they represent.
	* Divorce lawyers example

- ISP: The Interface Segregation Principle
	* A client shouldn't be forced to implement an interface or depend on a method it does not use. 
	* Bird, fly() example

           Note: Difference between LSP and ISP -> LSP: We need to substitute the subclasses from their parents.
							                         ISP: We need to divide a bigger interface to smaller pieces.

- DIP: The Dependency Inversion Principle
	* Entities must depend on abstractions, not on concretions. The high level modules must not depend on the low level modules.
	* Example about connecting a light bulb directly to a battery or connecting it to a switch and connecting switch to a battery.
	* FileReader example -> SQLReader, JSONReader, XMLReader, TextFileReader
	* So in here the high level module has a dependency on a low level module.
![image](https://github.com/selimdemirer/solid_principles/assets/125173819/83f66fce-2ba1-401d-804d-82d3b6f27e17)
