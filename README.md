                                       LAB6

                                     TAXI COMPANY
				     
 In this simulation, the operator answers customer calls, proposes a car (model, type, color) and the accountant sets the price for the ride. The price of the ride in relation to the number of customers at the time, according to the formula
 
	 		MoneyCombustible = MoneyCombustible + NumberClients * CombustiblePrice.
This way we can find out the money from the day in total, and the total money of the company and from here you can see some actions. 

*If the money is less than n, a representative of the company partnerships will help the taxi company with money, and if there is more money, the taxi company will be able to call on a Marketolog who will advertise for the company. Depending on money and the number of customers, advertising can be of different types. If the advertising will happen, the director will improve the company.

*On a randomly generated day, and if the total money is more than n, the mechanics will start repairing the cars, and from the total money of the company will be removed the price of the car.

*If the clients are less than n, the driver will go on break.

*If there will be no more money, cars or drivers, the company will close.

*If the company will be closed, the director will leave.

*One day, randomly generated, the company can close and the simulation can stop then.

# LAB6


		The implemented architectural pattern : MVC
		
		Model —  represented by all the classes from the previous laboratory.
		View — Defines the presentation of the application
		Controller — operates with model and view packages.

		
	DRY, KISS, SOLID
	
Open-closed principle: Extending the functionality of your software shouldn’t require you to modify (a lot) of existing code. If you have to modify (several) existing files to extend functionality, you are probably not following the open-closed principle. To satisfy the open-closed principle, think about appropriate design patterns for your problem.
Liskov substitution principle: The behavior of subclasses should not deviate from the behavior that is implemented by the superclass. So, when you are overriding a method of the superclass, make sure that you are not breaking the invariants of the superclass. If that would be the case, use of inheritance is not appropriate.
