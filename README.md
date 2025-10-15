# S1.7-Annotations

# 📄 **Description**

## **Level 1**

### **Exercise 01**

	Create an object hierarchy with three classes: Treballador, TreballadorOnline, and TreballadorPresencial.
	The Treballador class has the attributes first name, last name, hourly rate, and the method calcularSou() 
	which takes as a parameter the number of hours worked and multiplies it by the hourly rate. The subclasses must 
	override it using @Override.

	From the main() of the Principal class, make the necessary calls to demonstrate how the @Override annotation works.

	For on-site workers (TreballadorPresencial), the method to calculate their salary will receive as a parameter 
	the number of hours worked in the month. To compute the salary, multiply the number of hours worked by the hourly 
	rate, plus the value of a static attribute named benzina that we will add in this class.

	For online workers (TreballadorOnline), the method to calculate their salary will receive as a parameter 
	the number of hours worked in the month. To compute the salary, multiply the number of hours worked by the hourly 
	rate and add the cost of the flat-rate Internet plan, which will be a constant of the TreballadorOnline class.

### **Exercise 02**

	Add some deprecated methods to the subclasses and use the corresponding annotation. From an external class, 
	invoke the deprecated methods, suppressing the deprecation warnings using the corresponding annotation.

## **Level 02**

### **Exercise 01**

	Create a custom annotation that should allow serializing a Java object to a JSON file. The annotation must receive 
	the directory where the resulting file will be placed.

**Exercise 01 Execution**

This exercise can be compiled by terminal instructions or builded by idle. 
In the first case, the "result" directory wich contains person.json answer will appear in the exercise directory,
if the compilation and execution is done by idle, the directory will appear in  s1.7-Annotations directory.

### **Level 03**

**Exercise 01**

    Add the capability for the annotation created in the previous level to be retained by the Virtual Machine at 
	runtime. Demonstrate that reading the annotation is executed using Java Reflection.

	
## 💻 **Used technologies**

- Java
- Git

## 📋 **Requirements**

- Oracle OpenJDK 21.0.8

## 🛠️ **Install**

1. Clone this repo: **>  [git clone](https://github.com/mirexan/S1.2-Exceptions.git)**
2. Access to the directories in: S1.3-Java-Collections

